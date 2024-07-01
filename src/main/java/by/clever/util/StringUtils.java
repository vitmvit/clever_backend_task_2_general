package by.clever.util;

public class StringUtils {

    /**
     * проверяет строку на содержание положительного числа
     */
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (str.startsWith("-")) {
            return false;
        }
        if (str.contains(",")) {
            return false;
        }
        if (str.indexOf(".") != str.lastIndexOf(".")) {
            return false;
        }
        for (char symbol : str.toCharArray()) {
            if (!Character.isDigit(symbol) && symbol != '.') {
                return false;
            }
        }
        return true;
    }
}
