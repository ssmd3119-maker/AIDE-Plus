package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.os.Parcel;
import android.os.Parcelable;

@cy(clazz = 7780765271333714769L, container = 7780765271333714769L, user = true)
/* loaded from: classes.dex */
public class FileHighlightings implements Parcelable {

    @dy(field = 2285256802090892448L)
    public static final Parcelable.Creator<FileHighlightings> CREATOR;

    @gy
    private static /* synthetic */ boolean hK;

    @fy
    private static /* synthetic */ boolean w9;

    @dy(field = 1976171881246088353L)
    public int AL;

    @dy(field = -4479947829592451888L)
    public int[] endColumns;

    @dy(field = 3496808922153491896L)
    public int[] endLines;

    @dy(field = -3369965173401013485L)
    public String filePath;

    @dy(field = 437085497395244595L)
    public int size;

    @dy(field = -5421722536802487829L)
    public int[] startColumns;

    @dy(field = -2156564942828709573L)
    public int[] startLines;

    @dy(field = 1050439682497984779L)
    public SyntaxStyleType[] syntaxStyleTypes;

    @cy(clazz = -2773963344198450264L, container = 7780765271333714769L, user = true)
    static class a implements Parcelable.Creator<FileHighlightings> {

        @fy
        private static /* synthetic */ boolean DW;

        @gy
        private static /* synthetic */ boolean FH;

        @dy(field = 1344800284458621504L)
        private FileHighlightings j6 = new FileHighlightings();

        static {
            iy.Zo(a.class);
        }

        @ey(method = -206212450074633680L)
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = -607123074475691648L)
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public FileHighlightings[] newArray(int i) {
            try {
                if (DW) {
                    iy.u7(-2588890491825977849L, this, i);
                }
                return new FileHighlightings[i];
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, -2588890491825977849L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // android.os.Parcelable.Creator
        @ey(method = 2072592329956407207L)
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public FileHighlightings createFromParcel(Parcel parcel) {
            try {
                if (DW) {
                    iy.tp(1868528276555403552L, this, parcel);
                }
                this.j6.j6(parcel);
                return this.j6;
            } catch (Throwable th) {
                if (FH) {
                    iy.j3(th, 1868528276555403552L, this, parcel);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(FileHighlightings.class);
            if (w9) {
                iy.gn(1314669640533748995L, null);
            }
            CREATOR = new a();
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 1314669640533748995L, null);
            }
            throw th;
        }
    }

    @ey(method = -758174911511263757L)
    public FileHighlightings() {
        try {
            if (w9) {
                iy.gn(3566736626202971200L, null);
            }
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 3566736626202971200L, null);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = 821273599013876472L)
    public int describeContents() {
        try {
            if (!w9) {
                return 0;
            }
            iy.gn(4910506993268413032L, this);
            return 0;
        } catch (Throwable th) {
            if (hK) {
                iy.aM(th, 4910506993268413032L, this);
            }
            throw th;
        }
    }

    @ey(method = 449877240601162136L)
    public void j6(Parcel parcel) {
        try {
            if (w9) {
                iy.tp(-2812940080177441136L, this, parcel);
            }
            this.filePath = parcel.readString();
            this.size = parcel.readInt();
            this.AL = parcel.readInt();
            if (this.syntaxStyleTypes == null || this.syntaxStyleTypes.length < this.size) {
                int i = (this.size * 5) / 4;
                this.syntaxStyleTypes = new SyntaxStyleType[i];
                this.startLines = new int[i];
                this.endLines = new int[i];
                this.startColumns = new int[i];
                this.endColumns = new int[i];
            }
            SyntaxStyleType[] syntaxStyleTypeArrValues = SyntaxStyleType.values();
            for (int i2 = 0; i2 < this.size; i2++) {
                byte b = parcel.readByte();
                if (b == 0) {
                    this.syntaxStyleTypes[i2] = null;
                } else if ((b & 128) == 0) {
                    this.syntaxStyleTypes[i2] = syntaxStyleTypeArrValues[b];
                    int i3 = parcel.readInt();
                    int[] iArr = this.startLines;
                    this.endLines[i2] = i3;
                    iArr[i2] = i3;
                    this.startColumns[i2] = parcel.readByte();
                    this.endColumns[i2] = parcel.readByte();
                } else {
                    this.syntaxStyleTypes[i2] = syntaxStyleTypeArrValues[b & 127];
                    this.startLines[i2] = parcel.readInt();
                    this.startColumns[i2] = parcel.readInt();
                    this.endLines[i2] = parcel.readInt();
                    this.endColumns[i2] = parcel.readInt();
                }
            }
        } catch (Throwable th) {
            if (hK) {
                iy.j3(th, -2812940080177441136L, this, parcel);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    @ey(method = -5175425764798508349L)
    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (w9) {
                iy.EQ(-2593435452539459385L, this, parcel, new Integer(i));
            }
            this.size = Math.min(30000, this.size);
            parcel.writeString(this.filePath);
            parcel.writeInt(this.size);
            parcel.writeInt(this.AL);
            for (int i2 = 0; i2 < this.size; i2++) {
                SyntaxStyleType syntaxStyleType = this.syntaxStyleTypes[i2];
                if (syntaxStyleType == null || syntaxStyleType == SyntaxStyleType.PLAIN) {
                    parcel.writeByte((byte) 0);
                } else {
                    int i3 = this.startLines[i2];
                    int i4 = this.startColumns[i2];
                    int i5 = this.endLines[i2];
                    int i6 = this.endColumns[i2];
                    if (i3 != i5 || i6 >= 127) {
                        parcel.writeByte((byte) (syntaxStyleType.ordinal() | 128));
                        parcel.writeInt(i3);
                        parcel.writeInt(i4);
                        parcel.writeInt(i5);
                        parcel.writeInt(i6);
                    } else {
                        parcel.writeByte((byte) syntaxStyleType.ordinal());
                        parcel.writeInt(i3);
                        parcel.writeByte((byte) i4);
                        parcel.writeByte((byte) i6);
                    }
                }
            }
        } catch (Throwable th) {
            if (hK) {
                iy.Mr(th, -2593435452539459385L, this, parcel, new Integer(i));
            }
            throw th;
        }
    }
}
