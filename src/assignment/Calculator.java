package assignment;

public class Calculator {

	public static void main(String[] args) {

		if (args.length < 3) {
			System.out.println("Please pass 2 numbers and operator from command line");
		}

		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		char operator = args[2].charAt(0);// .class need to take last as operator so .class is not printed in next line
		double result = 0;
		System.out.println("Expression " + num1 + " " + operator + " " + num2);

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '.') {// . is printed instead of * so need to take . to compare with * ....
			result = num1 * num2;  // when * is passed from command line it prints . class
		} else if (operator == '/') {
			if (num2 == 0) {
				System.out.println("cannot divide by 0");
			} else {
				result = num1 / num2;
			}
		} else {
			System.out.println("Enter correct(+,-,*,/) operator");
		}
		System.out.println("Solution for given expression :  " + result);
	}

}
/*  
public class Calculator
{
	public static void main(String[] args) 
	{
	if(args.length<3)
	{
		System.out.println("please pass 2 numbers and operator from command line ");
	}
	else
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		char operator = args[2].charAt(0);
		switch(operator)
		{
		case '+':
			System.out.println("Addition of "+num1+"and"+num2+"is : "+(num1+num2));
			break;
		
		case '-':
			System.out.println("Subtraction of "+num1+"and"+num2+"is : "+(num1-num2));
			break;
			
		case '/':
			System.out.println("Division of "+num1+"and"+num2+"is : "+(num1/num2));
			break;
			
		case '.':
			System.out.println("Multiplication of "+num1+"and"+num2+"is : "+(num1*num2));
			break;	
		 
			}
		
		}
	
	}
} 
 
*/

