package com.pluralsight;

public class NameFormatter {

    // private constructor - so cant make a new nameformatter?
    private NameFormatter() {

    }
    // NameFormatter.format(...).
    public static String format(String firstName, String lastName) {
        return NameFormatter.format(firstName, lastName);

    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return NameFormatter.format(prefix, firstName, middleName, lastName, suffix);
    }
    public static String format(String fullName) {
        return NameFormatter.format(fullName);

    }
}
