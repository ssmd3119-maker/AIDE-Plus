# Generates app_rewrite/src/main/res/values-v29/aideplus_themes.xml from the
# current AIDE theme definitions: every existing item is kept, colors and
# component styles are replaced with the AIDE+ Material 3 ones.
import xml.etree.ElementTree as ET
from xml.sax.saxutils import escape
import os
R=os.path.join(os.path.dirname(os.path.abspath(__file__)), '..', '..') + '/'
def load(p):
    return {st.get('name'):(st.get('parent'),[(i.get('name'),(i.text or '').strip()) for i in st.iter('item')])
            for st in ET.parse(R+p).getroot().iter('style')}
defs=load('appAideBase/src/main/res/values-v21/styles.xml')
for f in ['values-v22/app_md3_theme_light.xml','values-v22/app_md3_theme_dark.xml']:
    defs.update(load('app_rewrite/src/main/res/'+f))

def c(t,m): return f'@color/aideplus_{t}_{m}'
def palette(m, window=True):
    light=m=='light'
    o={}
    if window:
        o['android:windowBackground']=c('background',m)
    o.update({
        'android:colorPrimary':c('surface_container',m),
        'android:colorPrimaryDark':c('surface_container',m),
        'android:colorAccent':c('primary',m),
        'android:colorBackground':c('background',m),
        'android:colorControlNormal':c('on_surface_variant',m),
        'android:colorControlActivated':c('primary',m),
        'android:colorEdgeEffect':c('primary',m),
        'android:textColorPrimary':c('on_surface',m),
        'android:textColorSecondary':c('on_surface_variant',m),
        'android:textColorHighlight':c('primary_container',m),
        'android:textColorLink':c('primary',m),
        'android:statusBarColor':c('surface_container',m),
        'android:navigationBarColor':c('surface_container',m),
        'android:windowLightStatusBar':'true' if light else 'false',
        'android:windowLightNavigationBar':'true' if light else 'false',
        'android:popupMenuStyle':f'@style/AidePlus.PopupMenu.{m.title()}',
        'android:actionOverflowMenuStyle':f'@style/AidePlus.PopupMenu.Overflow.{m.title()}',
        'android:listPopupWindowStyle':f'@style/AidePlus.ListPopupWindow.{m.title()}',
        'aideplusPrimaryContainer':c('primary_container',m),
        'aideplusOnPrimaryContainer':c('on_primary_container',m),
        'aideplusSurfaceContainerLow':c('surface_container_low',m),
        'aideplusSurfaceContainerHighest':c('surface_container_highest',m),
    })
    return o
def aide_colors(m):
    return {
        'color_app_background':c('background',m),
        'color_browser_label':c('on_surface',m),
        'color_browser_label_gray':c('on_surface_variant',m),
        'color_key':c('on_surface_variant',m),
        'color_list_separator':c('outline_variant',m),
        'color_page_separator':c('outline_variant',m),
        'color_selected_item':c('secondary_container',m),
        'color_split_separator':c('outline_variant',m),
        'drawable_header':f'@drawable/aideplus_header_{m}',
        'drawable_keybar':f'@drawable/aideplus_keybar_{m}',
        'drawable_popup':f'@drawable/aideplus_completion_popup_{m}',
    }
def merged(name, overrides):
    parent,items=defs[name]
    keys=[k for k,v in items]
    out=[(k,overrides.get(k,v)) for k,v in items]
    out+=[(k,v) for k,v in overrides.items() if k not in keys]
    return parent,out

themes=[]
for m in ['light','dark']:
    M=m.title()
    ov=palette(m); ov.update(aide_colors(m)); ov.update({
        'android:actionBarStyle':f'@style/AidePlus.ActionBar.{M}',
        'android:actionBarTabStyle':f'@style/AidePlus.ActionBar.TabView.{M}',
        'android:actionBarTabTextStyle':f'@style/AidePlus.ActionBar.TabText.{M}',
        'android:actionBarTabBarStyle':f'@style/AidePlus.ActionBar.TabBar.{M}',
        'android:dialogTheme':f'@style/DialogTheme{M}',
        'android:alertDialogTheme':f'@style/AlertDialogTheme{M}',
    })
    themes.append(('Main window and most activities',f'ActivityActionbarTheme{M}',merged(f'ActivityActionbarTheme{M}',ov)))
    # transparent overlay: keep its window, only colors
    ov=palette(m,window=False); ov.update({k:v for k,v in aide_colors(m).items() if k in dict(defs[f'ActivityGotoTheme{M}'][1])})
    themes.append(('Goto overlay (keeps its transparent window)',f'ActivityGotoTheme{M}',merged(f'ActivityGotoTheme{M}',ov)))
    ov=palette(m); ov.update({
        'android:actionBarStyle':f'@style/AidePlus.ActionBar.{M}',
        'android:dialogTheme':f'@style/DialogTheme{M}',
        'android:alertDialogTheme':f'@style/AlertDialogTheme{M}',
        'android:listDivider':'@android:color/transparent',
    })
    themes.append(('Settings',f'ActivityPreferencesTheme{M}',merged(f'ActivityPreferencesTheme{M}',ov)))
    for d in ['DialogTheme','AlertDialogTheme']:
        ov=palette(m)
        for k in ['android:statusBarColor','android:navigationBarColor','android:windowLightStatusBar','android:windowLightNavigationBar']: ov.pop(k)
        ov.update({
            'android:windowBackground':f'@drawable/aideplus_dialog_bg_{m}',
            'android:colorBackground':c('surface_container_high',m),
            'android:windowElevation':'6dp',
            'android:buttonBarButtonStyle':f'@style/AidePlus.DialogButton.{M}',
            'android:windowTitleStyle':f'@style/AidePlus.DialogTitle.{M}',
        })
        themes.append(('Dialogs',f'{d}{M}',merged(f'{d}{M}',ov)))

L={'light':'.Light','dark':''}
components=[]
for m in ['light','dark']:
    M=m.title(); l=L[m]
    components+= [
     (f'AidePlus.ActionBar.{M}',f'@android:style/Widget.Material{l}.ActionBar.Solid',[
        ('android:background',f'@drawable/aideplus_actionbar_bg_{m}'),
        ('android:backgroundStacked',f'@drawable/aideplus_actionbar_bg_{m}'),
        ('android:backgroundSplit',f'@drawable/aideplus_actionbar_bg_{m}'),
        ('android:elevation','0dp'),
        ('android:titleTextStyle',f'@style/AidePlus.ActionBar.Title.{M}')]),
     (f'AidePlus.ActionBar.Title.{M}',f'@android:style/TextAppearance.Material.Widget.ActionBar.Title',[
        ('android:textColor',c('on_surface',m)),('android:textSize','20sp')]),
     (f'AidePlus.ActionBar.TabBar.{M}',f'@android:style/Widget.Material{l}.ActionBar.TabBar',[
        ('android:showDividers','none')]),
     (f'AidePlus.ActionBar.TabView.{M}',f'@android:style/Widget.Material{l}.ActionBar.TabView',[
        ('android:background','@drawable/aideplus_tab_bg'),
        ('android:paddingStart','16dp'),('android:paddingEnd','16dp')]),
     (f'AidePlus.ActionBar.TabText.{M}',f'@android:style/Widget.Material{l}.ActionBar.TabText',[
        ('android:textAllCaps','false'),('android:textColor',f'@color/aideplus_tab_text_{m}'),
        ('android:textSize','14sp'),('android:fontFamily','sans-serif-medium')]),
     (f'AidePlus.PopupMenu.{M}',f'@android:style/Widget.Material{l}.PopupMenu',[
        ('android:popupBackground',f'@drawable/aideplus_popup_bg_{m}'),('android:popupElevation','3dp')]),
     (f'AidePlus.PopupMenu.Overflow.{M}',f'@android:style/Widget.Material{l}.PopupMenu.Overflow',[
        ('android:popupBackground',f'@drawable/aideplus_popup_bg_{m}'),('android:popupElevation','3dp')]),
     (f'AidePlus.ListPopupWindow.{M}',f'@android:style/Widget.Material{l}.ListPopupWindow',[
        ('android:popupBackground',f'@drawable/aideplus_popup_bg_{m}'),('android:popupElevation','3dp')]),
     (f'AidePlus.DialogButton.{M}',f'@android:style/Widget.Material{l}.Button.Borderless.Colored',[
        ('android:textAllCaps','false'),('android:textColor',c('primary',m)),('android:fontFamily','sans-serif-medium')]),
     (f'AidePlus.DialogTitle.{M}',f'@android:style/TextAppearance.Material.DialogWindowTitle',[
        ('android:textColor',c('on_surface',m)),('android:textSize','22sp')]),
    ]

out=['<?xml version="1.0" encoding="utf-8"?>','<resources>',
 '\t<!-- AIDE+ Material You theme. The theme names are the ones AIDE already uses',
 '\t     (their ids are fixed in public.xml); all AIDE attributes are kept and',
 '\t     colors come from aideplus_colors.xml (wallpaper colors on Android 12+). -->','']
last=None
for comment,name,(parent,items) in themes:
    if comment!=last: out.append(f'\t<!-- {comment} -->'); last=comment
    out.append(f'\t<style name="{name}" parent="{parent}">')
    out+= [f'\t\t<item name="{k}">{escape(v)}</item>' for k,v in items]
    out.append('\t</style>'); out.append('')
out.append('\t<!-- Components -->')
for name,parent,items in components:
    out.append(f'\t<style name="{name}" parent="{parent}">')
    out+= [f'\t\t<item name="{k}">{escape(v)}</item>' for k,v in items]
    out.append('\t</style>')
out.append('</resources>')
open(R+'app_rewrite/src/main/res/values-v29/aideplus_themes.xml','w').write('\n'.join(out)+'\n')
print(len(themes),'themes,',len(components),'component styles')
