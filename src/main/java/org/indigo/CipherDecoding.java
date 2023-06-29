package org.indigo;

public class CipherDecoding {
    private static String uppercaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lowercaseAlphabets = "abcdefghijklmnopqrstuvwxyz";
    public static String decode(String msg, int key){
        String output = "";
        for (char c: msg.toCharArray()){
            String alphabet=uppercaseAlphabets;
            if (Character.isLowerCase(c)){
                alphabet=lowercaseAlphabets;
            }
            int charPos = alphabet.indexOf(c);
            if (charPos == -1){
                output = output + c;
                continue;
            }
            int tempNewPos = charPos - key;
            int newPos = tempNewPos < 0? 26 + tempNewPos : tempNewPos;
            char replacement = alphabet.charAt(newPos);
            output = output + replacement;
        }
        return output;
    }

}
