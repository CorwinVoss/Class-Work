package com.company;

public class Main {

    public static void main(String[] args) {
        int num1  = 7;
        int num2  = 3;
        int num3  = 7;
        int num4  = 3;
        int result1  = num1/num2; //result1 should be 2 after this instruction
        double result2  = num3/num4; //result2 should be 2.3333(Shortend here for display reasons) after this instruction
        double var5  = 12.5;
        int var6  = 1337;
        int result3  = 11/(int)var5; // blank on right side of = is for a data conversion (numeric to numeric)- still should be double or int
        double result4  = 11/var5; //result3 should be 0.0 and result4 should be 0.8627450980392157


/*Answer the follow questions:
Why does the value for result1 differ from that of result2? result1 is an integer so it cuts off all of the decimal points
What is the reason that result3 differs from result4? In double it has decimal points but integers don't so result 3 is 11/12 which is
0.91666666666666666666666666666667 but it is stored as an int which cuts off the decimal points.

What reason can you think of that in some cases the precison is lost before it gets saved in a memory.  Or in other words why are
all intermediate calculations prior to being stored into memory, not calculated as doubles and then converted when into memory/variables.
	- For this one knowing that Processors have different "execute" hardware that preforms math operations for floating point number and integers
		might give you a hint.
		It stores as a floating point number but then changes to double when it saves in a 64bit storage place.

If you added the following code to the end of the above program, would it work?
result1 = num3/num4; //result should be 2.3333
if not what could you change to make it work?  note the original calculated value of result1 (5th instruction) should still be 2, but then will
be updated to 2.3333 after the new line of code is added.
No, you would need to make it a double so that when you print the variable it is going to say 2.33 repeated and not 2. It would print 2 if you stated it as a int it would print out 2.
*/
    }
}
