package Case_study;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class TrumCode {
    private static final String REGEX_SERVICE_CODE = "^SV(VL|RO)-\\d{4}$";
    private static final String REGEX_NAME_SERVICE = "^[A-Z][a-z]*$";
    private static final String REGEX_AREA = "^[+-]?\\d+(\\.\\d+)?$";
    private static final String REGEX_RENTAL_COSTS = "^[+]?\\d+(\\.\\d+)?$";
    private static final String REGEX_NUMBER_PEOPLE = "^[+]?[1-9]\\d*$";
    private static final String REGEX_NUMBER_FLOORS = "^[+]?[1-9]\\d*$";
    private static final String REGEX_RENTAL_TYPE = "^[A-Z][a-z]*$";

    public static boolean checkRegexServiceCode(String regex) {
        return regex.matches(REGEX_SERVICE_CODE);
    }

    public static boolean checkRegexNameService(String regex) {
        return regex.matches(REGEX_NAME_SERVICE);
    }

    public static boolean checkRegexArea(String regex) {
        return regex.matches(REGEX_AREA);
    }

    public static boolean checkRegexRentalCosts(String regex) {
        return regex.matches(REGEX_RENTAL_COSTS);
    }

    public static boolean checkRegexNumberPeople(String regex) {
        return regex.matches(REGEX_NUMBER_PEOPLE);
    }

    public static boolean checkRegexNumberFloors(String regex) {
        return regex.matches(REGEX_NUMBER_FLOORS);
    }

    public static boolean checkRegexRentalType(String regex) {
        return regex.matches(REGEX_RENTAL_TYPE);
    }
}
