package org.example;

public class Main {
    public static void main(String[] args) {
        // ------------------  8 data type ----------------------
        // byte  Stores whole numbers from -128 to 127 ---> 1byte
        byte myByte = -25;
        System.out.println("The byte number is:" + myByte);
        //---------------------------------------------------------------

        //short  Stores whole numbers from -32,768 to 32,767 ---> 2bytes
        short myShort = 31052;
        System.out.println("The short number is:" + myShort);
        //---------------------------------------------------------------

        //int 	Stores whole numbers from -2,147,483,648 to 2,147,483,647 ---> 4bytes
        int myInt = 2000000000;
        System.out.println("The int number is:" + myInt);
        //---------------------------------------------------------------

        //long  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 ---> 8bytes
        long myLong = -324665788;
        System.out.println("The long number is:" + myLong);
        //---------------------------------------------------------------

        //float  	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits ---> 4bytes
        float myFloat = 15.226f;
        System.out.println("The float number is:" + myFloat);
        //---------------------------------------------------------------

        //double	Stores fractional numbers. Sufficient for storing 15 decimal digits ---> 8bytes
        double myDouble = 2341.44796635d;
        System.out.println("The double number is:" + myDouble);
        //---------------------------------------------------------------

        //boolean  Stores true or false values ---> 1bit
        boolean myBolean = true;
        System.out.println("The boolean logic is:" + myBolean);
        //---------------------------------------------------------------

        //char  Stores a single character/letter or ASCII values   ---> 2 bytes
        char myChar = 'a';
        System.out.println("The char number is:" + myChar);
        //---------------------------------------------------------------



    }
}