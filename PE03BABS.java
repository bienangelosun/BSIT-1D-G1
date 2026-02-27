/*Name: Bien Angelo B. Sunpongco
Section: BSIT 1D-G1
Description: This is a java source code that determines whether integers N1 or N2 are greater than, lesser than, or equal to eachother.*/

import java.util.Scanner;
class PE03BABS{

public static void main(String Bien[]){

Scanner input = new Scanner(System.in);
int N1, N2;

System.out.print("Enter first number: ");
N1 = input.nextInt();
System.out.print("Enter second number: ");
N2= input.nextInt();

if(N1>N2)
{
	System.out.println("Nl is greater than N2.");
}

	else if (N1<N2)
	{
		System.out.println("Nl is less than N2.");
	}
		else
		{
			System.out.println("NI is equal to N2.");
		}
	}
}
