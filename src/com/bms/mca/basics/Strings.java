package com.bms.mca.basics;
public class Strings {
    public static void main(String[] args) {
        String str = "BMSIT";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        // Convert a character array into a String
        char[] letters = {'A','M','I','T'};
        String name = new String(letters);
        System.out.println(name);
        String data = "Keertika1is1from1MCA";
        String[] words = data.split("1");
        System.out.println(words[0]);

    }
}
