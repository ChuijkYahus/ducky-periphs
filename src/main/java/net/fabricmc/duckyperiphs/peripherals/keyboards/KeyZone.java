package net.fabricmc.duckyperiphs.peripherals.keyboards;

// just maps keyzones to their tint indexes
public enum KeyZone {
    CASE_RIGHT(0),
    CASE_LEFT(1),
    CASE_MID_LEFT(2),
    CASE_MID_RIGHT(3),
    FLAT_CASE_RIGHT(4),
    FLAT_CASE_LEFT(5),
    FLAT_CASE_FRONT_FR(6),
    FLAT_CASE_FRONT_FL(7),
    FLAT_CASE_FRONT_ML(8),
    FLAT_CASE_FRONT_MR(9),
    FLAT_CASE_BACK_FR(10),
    FLAT_CASE_BACK_FL(11),
    FLAT_CASE_BACK_ML(12),
    FLAT_CASE_BACK_MR(13),
    ARROW_KEYS(14),
    BACK_KEY(15),
    BACKSLASH_KEY(16),
    CAPS_KEY(17),
    ENTER_KEY(18),
    ESC_KEY(19),
    GRAVE_KEY(20),
    LEFT_FN_KEYS(21),
    RIGHT_FN_KEYS(22),
    LSHIFT(23),
    RSHIFT(24),
    MID_FN_KEYS(25),
    MID_SIDE_KEYS(26),
    MODIFIER_KEYS_LEFT(27),
    MODIFIER_KEYS_RIGHT(28),
    MOST_KEYS(29),
    NUM_ROW(30),
    SCREEN_KEYS(31),
    SPACE_KEY(32),
    TAB_KEY(33),
    TOP_SIDE_KEYS(34),
    WASD_KEYS(35);
    short tI;
    private KeyZone(int tintIndex){
        this.tI = (short)tintIndex;
    }
    public int tintIndex(){return tI;}
    public boolean equals(int i){return tI == i;}

    public static final KeyZone[] CASE_ZONES = {CASE_RIGHT, CASE_LEFT, CASE_MID_LEFT, CASE_MID_RIGHT, FLAT_CASE_RIGHT, FLAT_CASE_LEFT, FLAT_CASE_FRONT_FR, FLAT_CASE_FRONT_FL, FLAT_CASE_FRONT_ML, FLAT_CASE_FRONT_MR, FLAT_CASE_BACK_FR, FLAT_CASE_BACK_FL, FLAT_CASE_BACK_ML, FLAT_CASE_BACK_MR};
    public static final KeyZone[] CASE_ZONES_R = {CASE_RIGHT, CASE_MID_RIGHT, FLAT_CASE_RIGHT, FLAT_CASE_FRONT_FR, FLAT_CASE_FRONT_MR, FLAT_CASE_BACK_FR, FLAT_CASE_BACK_MR};
    public static final KeyZone[] CASE_ZONES_L = {CASE_LEFT, CASE_MID_LEFT, FLAT_CASE_LEFT, FLAT_CASE_FRONT_FL, FLAT_CASE_FRONT_ML, FLAT_CASE_BACK_FL, FLAT_CASE_BACK_ML};
    public static final KeyZone[] CASE_ZONES_M = {CASE_MID_LEFT, CASE_MID_RIGHT, FLAT_CASE_FRONT_ML, FLAT_CASE_FRONT_MR, FLAT_CASE_BACK_ML, FLAT_CASE_BACK_MR};
    public static final KeyZone[] UTIL_ZONES = {ARROW_KEYS, BACK_KEY, CAPS_KEY, ENTER_KEY, ESC_KEY, LSHIFT, RSHIFT, MID_SIDE_KEYS, MODIFIER_KEYS_LEFT, MODIFIER_KEYS_RIGHT, SCREEN_KEYS, TAB_KEY, TOP_SIDE_KEYS};
    public static final KeyZone[] FN_ZONES = {LEFT_FN_KEYS, RIGHT_FN_KEYS, MID_FN_KEYS};
}
