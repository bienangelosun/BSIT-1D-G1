/*Name: Bien Angelo B. Sunpongco
Section: BSIT 1D-G1
Description: This is a simple java code that decides whether a number/integer is odd or even..*/

import java.util.Scanner;
class PE01BABS{

public static void main(String Bien[])
{
Scanner input = new Scanner(System.in);
int numr;

System.out.print("Enter an integer number: ");
numr = input.nextInt();

if (numr%2 == 0)
	{
	System.out.println("The number is even.");
	}

else if (numr%2 != 0)
{
System.out.println("The number is odd.");
}

	}
}
