package codegym;

public class Calculator {

    public static class Addition {
	public static int calculate(int num1, int num2) {
	    return num1 + num2;
	}
    }

    public static class Subtraction {
	public static int calculate(int num1, int num2) {
	    return num1 - num2;
	}
    }

    public static class Multiplication {
	public static int calculate(int num1, int num2) {
	    return num1 * num2;
	}
    }

    public static class Division {
	public static int calculate(int num1, int num2) {
	    if (num2 == 0)
		return 0;
	    else
		return num1 / num2;
	}
    }

    public static void main(String[] args) {
	int num1 = 10;
	int num2 = 5;

	int sum = Addition.calculate(num1, num2);
	System.out.println("Sum is " + sum);

	int diff = Subtraction.calculate(num1, num2);
	System.out.println("Difference is " + diff);

	int prod = Multiplication.calculate(num1, num2);
	System.out.println("Product is " + prod);

	int quotient = Division.calculate(num1, num2);
	System.out.println("Quotient is " + quotient);

    }
}
