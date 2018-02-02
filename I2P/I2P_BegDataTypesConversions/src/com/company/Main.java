package com.company;

public class Main {

    public static void main(String[] args) {
     			/*------------------
			Assignment Objective:
			To get practice with converting into different data types.
			Secondary Objective:
			learn how to use Debbugger tool.
			---------------------*/
        //copy the following code to a new project and
        //fix the errors in the conversions below then run in debug
        //mode and put the current value of each variable next to the
        //line in comments
        String myString = "1";//"1"
        char myChar = '2'; //'2'
        float myFloat = 10.7f;
        double myDouble = 10.9123457890;
        boolean myBool = true;
        long myLong = 123123;
        int myInt = 12;
        myDouble = myFloat;
        myDouble = myInt;
        myDouble = myLong;
        myDouble = Double.parseDouble(myString);
        myDouble = myChar;

        myString = "1";//"1"
        myChar = '2';
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myFloat = (float) myDouble;
        myFloat = myInt;
        myFloat = myLong;
        myFloat = Float.parseFloat(myString);
        myFloat = myChar;

        myString = "1";//"1"
        myChar = '2';
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myInt = (int) myDouble;
        myInt = (int) myFloat;
        myInt = (int)myLong;
        myInt = Integer.parseInt(myString);
        myInt = myChar;

        myString = "1";//"1"
        myChar = '2';
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myLong = (long) myDouble;
        myLong = (long) myFloat;
        myLong = myInt;
        myLong = Long.parseLong(myString);
        myLong = myChar;

        myString = "1";//"1"
        myChar = '2';
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myString = String.valueOf(myDouble);
        myString = String.valueOf(myFloat);
        myString = String.valueOf(myInt);
        myString = String.valueOf(myLong);
        myString = String.valueOf(myChar);
        myString = String.valueOf(myBool);

    }
}
