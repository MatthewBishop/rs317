final class ComplexTile {

	static int anIntArray688[] = new int[6];
	static int anIntArray689[] = new int[6];
	static int anIntArray690[] = new int[6];
	static int anIntArray691[] = new int[6];
	static int anIntArray692[] = new int[6];
	static int anIntArray693[] = { 1, 0 };
	static int anIntArray694[] = { 2, 1 };
	static int anIntArray695[] = { 3, 3 };
	static final int anIntArrayArray696[][] = { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static final int anIntArrayArray697[][] = { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	boolean aBoolean683;
	int anInt684;
	int anInt686;
	int anInt687;
	int anIntArray673[];
	int anIntArray674[];
	int anIntArray675[];
	int anIntArray676[];
	int anIntArray677[];
	int anIntArray678[];
	int anIntArray679[];
	int anIntArray680[];
	int anIntArray681[];
	int anIntArray682[];
	int orientation;

	public ComplexTile(int y, int j, int k, int northEastZ, int texture, int j1, int orientation, int l1, int i2, int j2,
			int northZ, int eastZ, int centreZ, int j3, int k3, int l3, int i4, int x, int l4) {
		aBoolean683 = true;
		if (centreZ != eastZ || centreZ != northEastZ || centreZ != northZ) {
			aBoolean683 = false;
		}

		anInt684 = j3;
		this.orientation = orientation;
		anInt686 = i2;
		anInt687 = l4;

		int c = 128;
		int i5 = c / 2;
		int j5 = c / 4;
		int k5 = c * 3 / 4;
		int[] ai = anIntArrayArray696[j3];
		int l5 = ai.length;
		anIntArray673 = new int[l5];
		anIntArray674 = new int[l5];
		anIntArray675 = new int[l5];
		int ai1[] = new int[l5];
		int ai2[] = new int[l5];
		int i6 = x * c;
		int j6 = y * c;

		for (int k6 = 0; k6 < l5; k6++) {
			int l6 = ai[k6];
			if ((l6 & 1) == 0 && l6 <= 8) {
				l6 = (l6 - orientation - orientation - 1 & 7) + 1;
			}
			if (l6 > 8 && l6 <= 12) {
				l6 = (l6 - 9 - orientation & 3) + 9;
			}
			if (l6 > 12 && l6 <= 16) {
				l6 = (l6 - 13 - orientation & 3) + 13;
			}
			int i7;
			int k7;
			int i8;
			int k8;
			int j9;
			if (l6 == 1) {
				i7 = i6;
				k7 = j6;
				i8 = centreZ;
				k8 = l1;
				j9 = j;
			} else if (l6 == 2) {
				i7 = i6 + i5;
				k7 = j6;
				i8 = centreZ + eastZ >> 1;
				k8 = l1 + i4 >> 1;
				j9 = j + l3 >> 1;
			} else if (l6 == 3) {
				i7 = i6 + c;
				k7 = j6;
				i8 = eastZ;
				k8 = i4;
				j9 = l3;
			} else if (l6 == 4) {
				i7 = i6 + c;
				k7 = j6 + i5;
				i8 = eastZ + northEastZ >> 1;
				k8 = i4 + j2 >> 1;
				j9 = l3 + j1 >> 1;
			} else if (l6 == 5) {
				i7 = i6 + c;
				k7 = j6 + c;
				i8 = northEastZ;
				k8 = j2;
				j9 = j1;
			} else if (l6 == 6) {
				i7 = i6 + i5;
				k7 = j6 + c;
				i8 = northEastZ + northZ >> 1;
				k8 = j2 + k >> 1;
				j9 = j1 + k3 >> 1;
			} else if (l6 == 7) {
				i7 = i6;
				k7 = j6 + c;
				i8 = northZ;
				k8 = k;
				j9 = k3;
			} else if (l6 == 8) {
				i7 = i6;
				k7 = j6 + i5;
				i8 = northZ + centreZ >> 1;
				k8 = k + l1 >> 1;
				j9 = k3 + j >> 1;
			} else if (l6 == 9) {
				i7 = i6 + i5;
				k7 = j6 + j5;
				i8 = centreZ + eastZ >> 1;
				k8 = l1 + i4 >> 1;
				j9 = j + l3 >> 1;
			} else if (l6 == 10) {
				i7 = i6 + k5;
				k7 = j6 + i5;
				i8 = eastZ + northEastZ >> 1;
				k8 = i4 + j2 >> 1;
				j9 = l3 + j1 >> 1;
			} else if (l6 == 11) {
				i7 = i6 + i5;
				k7 = j6 + k5;
				i8 = northEastZ + northZ >> 1;
				k8 = j2 + k >> 1;
				j9 = j1 + k3 >> 1;
			} else if (l6 == 12) {
				i7 = i6 + j5;
				k7 = j6 + i5;
				i8 = northZ + centreZ >> 1;
				k8 = k + l1 >> 1;
				j9 = k3 + j >> 1;
			} else if (l6 == 13) {
				i7 = i6 + j5;
				k7 = j6 + j5;
				i8 = centreZ;
				k8 = l1;
				j9 = j;
			} else if (l6 == 14) {
				i7 = i6 + k5;
				k7 = j6 + j5;
				i8 = eastZ;
				k8 = i4;
				j9 = l3;
			} else if (l6 == 15) {
				i7 = i6 + k5;
				k7 = j6 + k5;
				i8 = northEastZ;
				k8 = j2;
				j9 = j1;
			} else {
				i7 = i6 + j5;
				k7 = j6 + k5;
				i8 = northZ;
				k8 = k;
				j9 = k3;
			}
			anIntArray673[k6] = i7;
			anIntArray674[k6] = i8;
			anIntArray675[k6] = k7;
			ai1[k6] = k8;
			ai2[k6] = j9;
		}

		int ai3[] = anIntArrayArray697[j3];
		int j7 = ai3.length / 4;
		anIntArray679 = new int[j7];
		anIntArray680 = new int[j7];
		anIntArray681 = new int[j7];
		anIntArray676 = new int[j7];
		anIntArray677 = new int[j7];
		anIntArray678 = new int[j7];
		if (texture != -1) {
			anIntArray682 = new int[j7];
		}
		int l7 = 0;
		for (int j8 = 0; j8 < j7; j8++) {
			int l8 = ai3[l7];
			int k9 = ai3[l7 + 1];
			int i10 = ai3[l7 + 2];
			int k10 = ai3[l7 + 3];
			l7 += 4;
			if (k9 < 4) {
				k9 = k9 - orientation & 3;
			}
			if (i10 < 4) {
				i10 = i10 - orientation & 3;
			}
			if (k10 < 4) {
				k10 = k10 - orientation & 3;
			}
			anIntArray679[j8] = k9;
			anIntArray680[j8] = i10;
			anIntArray681[j8] = k10;
			if (l8 == 0) {
				anIntArray676[j8] = ai1[k9];
				anIntArray677[j8] = ai1[i10];
				anIntArray678[j8] = ai1[k10];
				if (anIntArray682 != null) {
					anIntArray682[j8] = -1;
				}
			} else {
				anIntArray676[j8] = ai2[k9];
				anIntArray677[j8] = ai2[i10];
				anIntArray678[j8] = ai2[k10];
				if (anIntArray682 != null) {
					anIntArray682[j8] = texture;
				}
			}
		}

		int i9 = centreZ;
		int l9 = eastZ;
		if (eastZ < i9) {
			i9 = eastZ;
		}
		if (eastZ > l9) {
			l9 = eastZ;
		}
		if (northEastZ < i9) {
			i9 = northEastZ;
		}
		if (northEastZ > l9) {
			l9 = northEastZ;
		}
		if (northZ < i9) {
			i9 = northZ;
		}
		if (northZ > l9) {
			l9 = northZ;
		}
		i9 /= 14;
		l9 /= 14;
	}

}