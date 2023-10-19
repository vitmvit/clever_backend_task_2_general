package by.clever.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberPositive() {
        String var1 = "0";
        Assertions.assertTrue(StringUtils.isPositiveNumber(var1));

        String var2 = "1.2";
        Assertions.assertTrue(StringUtils.isPositiveNumber(var2));
    }

    @Test
    public void isPositiveNumberNegative() {
        String var1 = null;
        Assertions.assertFalse(StringUtils.isPositiveNumber(var1));

        String var2 = "";
        Assertions.assertFalse(StringUtils.isPositiveNumber(var2));

        String var3 = "asd";
        Assertions.assertFalse(StringUtils.isPositiveNumber(var3));

        String var4 = ",";
        Assertions.assertFalse(StringUtils.isPositiveNumber(var4));

        String var5 = "-1";
        Assertions.assertFalse(StringUtils.isPositiveNumber(var5));

        String var6 = "1.2.3";
        Assertions.assertFalse(StringUtils.isPositiveNumber(var6));

        String var7 = "1-2";
        Assertions.assertFalse(StringUtils.isPositiveNumber(var1));
    }
}
