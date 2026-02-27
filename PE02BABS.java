/*Name: Bien Angelo B. Sunpongco
Section: BSIT 1D-G1
Description: This is a simple java code that determines whether an integer is positive, negative, or zero..*/

import java.util.Scanner;
class PE02BABS{

public static void main(String Bien[]){

Scanner input = new Scanner(System.in);
int numr;

System.out.print("Enter an integer number: ");
numr = input.nextInt();

	if(numr>0)
	{
		System.out.println("The number is positive.");
	}
		else if (numr<0)
		{
			System.out.println("The number is negative.");
		}
			else
			{
				System.out.println("The number is zero.");
			}
	}
}
