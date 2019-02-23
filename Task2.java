import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number ->");
        num1 = scanner.nextDouble();
        System.out.print("insert operation -> (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("insert second number ->");
        num2 = scanner.nextDouble();
        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

           
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}