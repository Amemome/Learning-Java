public enum VolcanicExplosiveIndex {
    VEI_0(0),
    VEI_1(1),
    VEI_2(2),
    VEI_3(3),
    VEI_4(4),
    VEI_5(5),
    VEI_6(6),
    VEI_7(7),
    VEI_8(8);

    private final int vei;

    VolcanicExplosiveIndex(int vei) {
        this.vei = vei;
    }

    public static VolcanicExplosiveIndex fromValue(int value) {
        for (var v : values()) {
            if (v.vei == value) {
                return v;
            }
        }
        return null;
    }

    public int getInteger() {
        return vei;
    }
}
