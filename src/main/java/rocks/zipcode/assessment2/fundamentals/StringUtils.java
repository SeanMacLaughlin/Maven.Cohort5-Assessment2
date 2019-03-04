package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = new String(new char[numberOfTimeToRepeat]).replace("\0", stringToBeRepeated);
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String specialCharacters = "[" + "a-zA-Z "+ "]+" ;
        Boolean alphaStr = false;

        if ( string.matches(specialCharacters)) {
            alphaStr = true;
        } else {
            alphaStr = false;
        }
        return alphaStr;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String specialCharacters = "[" + "0123456789"+ "]+" ;
        Boolean numStr = false;

        if ( string.matches(specialCharacters)) {
            numStr = true;
        } else {
            numStr = false;
        }
        return numStr;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()"+ "]+" ;
        Boolean specialStr = false;

        if ( string.matches(specialCharacters)) {
           specialStr = true;
        } else {
            specialStr = false;
        }
        return specialStr;
    }
}
