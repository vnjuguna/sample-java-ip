package org.indigo;

public class Cipherencoding {
    private static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
    public static String encode(String msg, int key){
        String output = "";
        for (char c: msg.toCharArray()){
            int charPos = alphabets.indexOf(c);
            if (charPos == -1){
                output = output + c;
                continue;
            }
            int tempNewPos = charPos + key;
            int newPos = tempNewPos > 25? tempNewPos % 26 : tempNewPos;
            char replacement = alphabets.charAt(newPos);
            output = output + replacement;
        }
        return output;
    }

}
