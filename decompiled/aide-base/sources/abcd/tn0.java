package abcd;

/* loaded from: classes.dex */
public abstract class tn0 implements on0 {
    static final long[] Ws = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long EQ;
    private long FH;
    private long Hw;
    private int J8;
    protected long VH;
    protected long Zo;
    protected long gn;
    protected long tp;
    protected long u7;
    protected long v5;
    protected long we;
    private long[] J0 = new long[80];
    private byte[] j6 = new byte[8];
    private int DW = 0;

    public tn0() {
        DW();
    }

    private long EQ(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private void J0() {
        long j = this.FH;
        if (j > 2305843009213693951L) {
            this.Hw += j >>> 61;
            this.FH = j & 2305843009213693951L;
        }
    }

    private long VH(long j, long j2, long j3) {
        return ((j ^ (-1)) & j3) ^ (j2 & j);
    }

    private long gn(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private long tp(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long u7(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long we(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    @Override // abcd.on0
    public void DW() {
        this.FH = 0L;
        this.Hw = 0L;
        int i = 0;
        this.DW = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.j6;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.J8 = 0;
        while (true) {
            long[] jArr = this.J0;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // abcd.on0
    public void FH(byte b) {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            XL(bArr, 0);
            this.DW = 0;
        }
        this.FH++;
    }

    public void J8() {
        J0();
        long j = this.FH << 3;
        long j2 = this.Hw;
        FH((byte) -128);
        while (this.DW != 0) {
            FH((byte) 0);
        }
        QX(j, j2);
        Ws();
    }

    public void QX(long j, long j2) {
        if (this.J8 > 14) {
            Ws();
        }
        long[] jArr = this.J0;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void Ws() {
        J0();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.J0;
            long jTp = tp(jArr[i - 2]);
            long[] jArr2 = this.J0;
            jArr[i] = jTp + jArr2[i - 7] + u7(jArr2[i - 15]) + this.J0[i - 16];
        }
        long j = this.v5;
        long j2 = this.Zo;
        long j3 = this.VH;
        long j4 = this.gn;
        long j5 = this.u7;
        int i2 = 0;
        long j6 = this.tp;
        long j7 = j4;
        int i3 = 0;
        long j8 = j2;
        long j9 = j3;
        long j10 = j5;
        long j11 = j;
        int i4 = 0;
        long j12 = this.EQ;
        long j13 = this.we;
        while (i4 < 10) {
            long j14 = j10;
            int i5 = i3 + 1;
            long jWe = j13 + we(j10) + VH(j10, j6, j12) + Ws[i3] + this.J0[i3];
            long j15 = j7 + jWe;
            long j16 = j11;
            long jEQ = jWe + EQ(j11) + gn(j11, j8, j9);
            int i6 = i5 + 1;
            long jWe2 = j12 + we(j15) + VH(j15, j14, j6) + Ws[i5] + this.J0[i5];
            long j17 = j9 + jWe2;
            long jEQ2 = jWe2 + EQ(jEQ) + gn(jEQ, j16, j8);
            int i7 = i6 + 1;
            long jWe3 = j6 + we(j17) + VH(j17, j15, j14) + Ws[i6] + this.J0[i6];
            long j18 = j8 + jWe3;
            long jEQ3 = jWe3 + EQ(jEQ2) + gn(jEQ2, jEQ, j16);
            int i8 = i7 + 1;
            long jWe4 = j14 + we(j18) + VH(j18, j17, j15) + Ws[i7] + this.J0[i7];
            long j19 = j16 + jWe4;
            long jEQ4 = jWe4 + EQ(jEQ3) + gn(jEQ3, jEQ2, jEQ);
            int i9 = i8 + 1;
            long jWe5 = j15 + we(j19) + VH(j19, j18, j17) + Ws[i8] + this.J0[i8];
            long j20 = jEQ + jWe5;
            long jEQ5 = jWe5 + EQ(jEQ4) + gn(jEQ4, jEQ3, jEQ2);
            int i10 = i9 + 1;
            long jWe6 = j17 + we(j20) + VH(j20, j19, j18) + Ws[i9] + this.J0[i9];
            long j21 = jEQ2 + jWe6;
            long jEQ6 = jWe6 + EQ(jEQ5) + gn(jEQ5, jEQ4, jEQ3);
            int i11 = i10 + 1;
            long jWe7 = j18 + we(j21) + VH(j21, j20, j19) + Ws[i10] + this.J0[i10];
            long j22 = jEQ3 + jWe7;
            long jEQ7 = jWe7 + EQ(jEQ6) + gn(jEQ6, jEQ5, jEQ4);
            int i12 = i11 + 1;
            long jWe8 = j19 + we(j22) + VH(j22, j21, j20) + Ws[i11] + this.J0[i11];
            long j23 = jEQ4 + jWe8;
            long jEQ8 = jWe8 + EQ(jEQ7) + gn(jEQ7, jEQ6, jEQ5);
            i4++;
            j9 = jEQ6;
            j12 = j21;
            j13 = j20;
            j10 = j23;
            j8 = jEQ7;
            i3 = i12;
            i2 = 0;
            j11 = jEQ8;
            j6 = j22;
            j7 = jEQ5;
        }
        this.v5 += j11;
        this.Zo += j8;
        this.VH += j9;
        this.gn += j7;
        this.u7 += j10;
        this.tp += j6;
        this.EQ += j12;
        this.we += j13;
        this.J8 = i2;
        while (i2 < 16) {
            this.J0[i2] = 0;
            i2++;
        }
    }

    public void XL(byte[] bArr, int i) {
        this.J0[this.J8] = uo0.DW(bArr, i);
        int i2 = this.J8 + 1;
        this.J8 = i2;
        if (i2 == 16) {
            Ws();
        }
    }

    @Override // abcd.on0
    public void j6(byte[] bArr, int i, int i2) {
        while (this.DW != 0 && i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.j6.length) {
            XL(bArr, i);
            byte[] bArr2 = this.j6;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.FH += bArr2.length;
        }
        while (i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
    }
}
