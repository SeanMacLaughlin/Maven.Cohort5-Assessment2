package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder input1 = new StringBuilder();
        input1.append(string1);
        input1 = input1.reverse();
        return input1.toString();
}

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder input1 = new StringBuilder();
        input1.append(string1);
        input1 = input1.reverse();
        String strRev1 = input1.toString();

        StringBuilder input2 = new StringBuilder();
        input2.append(string2);
        input2 = input2.reverse();
        String strRev2 = input2.toString();

        return strRev1 + strRev2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char[] stringArr=string.toCharArray();
        char[] removeARR=charactersToRemove.toCharArray();
        int start,end=0;
        boolean[]  tempBoolean = new boolean[128];

        for(start=0;start < removeARR.length;++start)
        {
            tempBoolean[removeARR[start]]=true;
        }
        for(start=0;start < stringArr.length;++start)
        {
            if(!tempBoolean[stringArr[start]])
            {
                stringArr[end++]=stringArr[start];
            }
        }

        return new String(stringArr,0,end);
    }



//               charactersToRemove.toCharArray();
//
//        String removed = string.replaceAll(charactersToRemove, "");
//
//        return removed;



    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        char[] stringArr=string.toCharArray();
        char[] removeARR=charactersToRemove.toCharArray();
        int start,end=0;
        boolean[]  tempBoolean = new boolean[128];

        for(start=0;start < removeARR.length;++start)
        {
            tempBoolean[removeARR[start]]=true;
        }
        for(start=0;start < stringArr.length;++start)
        {
            if(!tempBoolean[stringArr[start]])
            {
                stringArr[end++]=stringArr[start];
            }
        }

         String mids = new String(stringArr,0,end);

        StringBuilder input1 = new StringBuilder();
        input1.append(mids);
        input1 = input1.reverse();
        return input1.toString();
    }
}
