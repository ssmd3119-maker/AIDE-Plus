package abcd;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.probelytics.api.UserNotification;
import com.probelytics.api.UserNotificationAction;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class wy {
    private static final Map<Integer, PendingIntent> j6 = new HashMap();

    public static PendingIntent DW(Context context, int i, Intent intent, int i2, Bundle bundle) {
        int iNextInt = new Random().nextInt();
        intent.putExtra("PROBELYTICS_INTENT_EXTRA", iNextInt);
        PendingIntent activity = (bundle == null || Build.VERSION.SDK_INT < 16) ? PendingIntent.getActivity(context, i, intent, i2) : PendingIntent.getActivity(context, i, intent, i2, bundle);
        j6.put(Integer.valueOf(iNextInt), activity);
        b00.j6("Notifications", "Create PendingIntent " + iNextInt);
        return activity;
    }

    private static File FH() {
        return d00.v5(iy.DW(), "notifications");
    }

    private static File Hw(int i) {
        return new File(FH(), "" + i);
    }

    public static boolean VH(Activity activity, Intent intent) {
        int i;
        UserNotificationAction userNotificationActionZo;
        if (intent == null || intent.getExtras() == null || (userNotificationActionZo = Zo(activity, (i = intent.getExtras().getInt("PROBELYTICS_INTENT_EXTRA", -1)))) == null) {
            return false;
        }
        b00.j6("Notifications", "Load action " + userNotificationActionZo.getName() + " for " + i);
        py.nw(userNotificationActionZo);
        return true;
    }

    private static UserNotificationAction Zo(Activity activity, int i) throws IOException {
        try {
            File fileHw = Hw(i);
            int iNextLong = 0;
            HashMap map = new HashMap();
            JsonReader jsonReader = new JsonReader(new FileReader(fileHw));
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        strNextString2 = jsonReader.nextString();
                    }
                } else if (strNextName.equals("id")) {
                    iNextLong = (int) jsonReader.nextLong();
                } else if (strNextName.equals("group")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        strNextString = jsonReader.nextString();
                    }
                } else if (strNextName.equals("extras")) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        map.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return new UserNotificationAction(new UserNotification(iy.DW(), iNextLong, strNextString, map), activity, strNextString2);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void gn(String str, int i, Notification notification) throws IOException {
        Notification.Action[] actionArr;
        Integer numV5;
        Integer numV52;
        UserNotification userNotificationJ6 = j6(i, notification);
        PendingIntent pendingIntent = notification.contentIntent;
        if (pendingIntent != null && (numV52 = v5(pendingIntent)) != null) {
            u7(numV52, userNotificationJ6, UserNotificationAction.CONTENT_ACTION_NAME);
        }
        PendingIntent pendingIntent2 = notification.deleteIntent;
        if (pendingIntent2 != null && (numV5 = v5(pendingIntent2)) != null) {
            u7(numV5, userNotificationJ6, UserNotificationAction.DELETE_ACTION_NAME);
        }
        if (Build.VERSION.SDK_INT >= 19 && (actionArr = notification.actions) != null) {
            for (Notification.Action action : actionArr) {
                Integer numV53 = v5(action.actionIntent);
                if (numV53 != null) {
                    CharSequence charSequence = action.title;
                    u7(numV53, userNotificationJ6, charSequence == null ? null : charSequence.toString());
                }
            }
        }
        py.ei(userNotificationJ6);
    }

    private static UserNotification j6(int i, Notification notification) {
        Bundle bundle;
        HashMap map = new HashMap();
        if (Build.VERSION.SDK_INT >= 19 && (bundle = notification.extras) != null) {
            for (String str : bundle.keySet()) {
                Object obj = notification.extras.get(str);
                if (obj instanceof CharSequence) {
                    map.put(str, obj.toString());
                } else if (obj instanceof Integer) {
                    map.put(str, obj.toString());
                } else if (obj instanceof Boolean) {
                    map.put(str, obj.toString());
                }
            }
        }
        return new UserNotification(iy.DW(), i, Build.VERSION.SDK_INT >= 21 ? notification.getGroup() : null, map);
    }

    private static void u7(Integer num, UserNotification userNotification, String str) throws IOException {
        try {
            b00.j6("Notifications", "Save action " + str + " as " + num);
            File fileHw = Hw(num.intValue());
            fileHw.getParentFile().mkdirs();
            JsonWriter jsonWriter = new JsonWriter(new FileWriter(fileHw));
            jsonWriter.beginObject();
            jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
            jsonWriter.name("id").value(userNotification.getId());
            jsonWriter.name("group").value(userNotification.getGroup());
            jsonWriter.name("extras");
            jsonWriter.beginObject();
            for (Map.Entry<String, String> entry : userNotification.getExtras().entrySet()) {
                jsonWriter.name(entry.getKey()).value(entry.getValue());
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException unused) {
        }
    }

    private static Integer v5(PendingIntent pendingIntent) {
        for (Map.Entry<Integer, PendingIntent> entry : j6.entrySet()) {
            if (entry.getValue().equals(pendingIntent)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
