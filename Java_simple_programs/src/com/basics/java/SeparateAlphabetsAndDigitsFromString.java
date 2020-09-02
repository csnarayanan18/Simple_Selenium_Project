package com.basics.java;

public class SeparateAlphabetsAndDigitsFromString {
    public static void main(String[] args) {
           String input = "1a2b3c#%%%%4def!!!GH@jkl";
           separateDigitsAndAlphabets(input);
    }

    public static void separateDigitsAndAlphabets(String str) {
        int lettercount = 0 ;
        int numbercount = 0;
        int symbolscount=0;
        int Upperlettercount =0;
        int lowerlettercount =0;
    	String number = "";
           String letter = "";
           String Uppercaseletter=" ";
           String Lowercaseletter=" ";
           String symbols=" ";
           for (int i = 0; i < str.length(); i++) {
                  char a = str.charAt(i);
                  if (Character.isDigit(a)) {
                        number = number + a;
                        numbercount++;
                  } 
                  else if(Character.isAlphabetic(a)) {
                     letter = letter + a;
                      lettercount++;
                      
                      if(Character.isUpperCase(a)) {
                          Uppercaseletter = Uppercaseletter + a;
                          Upperlettercount++;
                    }
                    else if (Character.isLowerCase(a)) {
                        Lowercaseletter = Lowercaseletter + a;
                        lowerlettercount++;
                  }
                }
                  
                  
                  else {
                      symbols = symbols + a;
                      symbolscount++;
                }
           }
           System.out.println("Total count of Alphates in string:"+lettercount);
       		System.out.println("Alphates in string:"+letter);
           System.out.println("Total uppercase count of Alphates in string:"+Upperlettercount);
           System.out.println("Upper case Alphates in string:"+Uppercaseletter);
           System.out.println("Total lower case count of Alphates in string:"+lowerlettercount);
           System.out.println("lower case Alphates in string:"+Lowercaseletter);
           
           System.out.println("Total count of Numbers in String:"+numbercount);
           System.out.println("Numbers in String:"+number);
           System.out.println("Total count of Symbols in String:"+symbolscount);
           System.out.println("Symbols in String:"+symbols);

    }
}
