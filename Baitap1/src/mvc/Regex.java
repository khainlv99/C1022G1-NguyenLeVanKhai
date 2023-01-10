package mvc;

public class Regex {
    private static final String REGEX_MA_CODE = "^STK-\\d{3}$";
    private static final String REGEX_KY_HAN = "^(Vô thời hạn|1 tháng|3 tháng|6 tháng|1 năm)$";
    private static final String REGEX_SO_NGUYEN_DUONG = "^[+-]?\\d+(\\.\\d+)?$";
    private static final String REGEX_SO_DUONG = "^[+]?\\d+(\\.\\d+)?$";
    public static boolean checkRegexMaSo(String regex) {
        return regex.matches(REGEX_MA_CODE);
    }
    public static boolean checkKyHan(String regex) {
        return regex.matches(REGEX_KY_HAN);
    }

    public static boolean checkSoTien(String regex) {
        return regex.matches(REGEX_SO_NGUYEN_DUONG);
    }
    public static boolean checkLaiSuat(String regex) {
        return regex.matches(REGEX_SO_DUONG);
    }
}
