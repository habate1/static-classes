package com.pluralsight;

public class NameFormatter {

    // private constructor - so cant make a new nameformatter?
    private NameFormatter() {

    }
    // NameFormatter.format(...).
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;

    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }
    public static String format(String fullName) {
        return fullName;

    }
}
