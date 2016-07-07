package FirstPackage;

import java.util.Scanner;

public class FirstClass implements FirstInterface {

	@Override
	public Integer add(Integer input1, Integer intput2) {
		// TODO Auto-generated method stub
		
		return input1+intput2;
	}

	@Override
	public Integer sub(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		return input1-input2;
	}
	@Override
	public Integer mul(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		return input1*input2;
	}
	@Override
	public Integer div(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		
		if(input2!=0)
			return input1/input2;
		else
			throw new ArithmeticException();
		
	}
	

	public static void main(String[] args) {
		
		FirstClass obj=new FirstClass();
		Integer choice,val1,val2;
		Scanner x =new Scanner(System.in);
		System.out.println("Enter the first number ");
		val1=x.nextInt();
		System.out.println("Enter the second number ");
		val2=x.nextInt();
		
		System.out.println("Enter the choice:\n 1.Addition \n 2.Subtraction \n 3.Multiply \n 4.Divide\n 5.AddSubtract");
		choice=x.nextInt();
		
		if(choice==1)
			System.out.println("Result after addition is "+obj.add(val1, val2));
		else if(choice==2)
			System.out.println("Result after Subtraction is "+obj.sub(val1, val2));
		else if(choice==3)
			System.out.println("Result after Multplication is "+obj.mul(val1, val2));
		else if(choice==4)
		{
			try {
				System.out.println("Result after division is "+obj.div(val1, val2));
			} catch (Exception e) {
				System.out.println("Enter valid Input");
				// TODO: handle exception
			}
		}
		else if(choice==5)
			System.out.println("Result after add and subtract is "+ obj.addSub(val1,val2));
		else 
			System.out.println("Invalid choice");
		x.close();
	}
}
