package com.company;

class ReverseString {
    public static void main (String[] args) {

        String str= "Govind", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Govind"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

