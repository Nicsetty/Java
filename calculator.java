import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulus (%)");

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b =scanner.nextInt();

        System.out.println("Enter the operation(1-5):");
        int operator = scanner.nextInt();
        switch(operator){
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: if (b==0){
                System.out.println("invalid operation");
            }else {System.out.println(a / b);}
            break;
            case 5: if(b==0){
                System.out.println("invalid operation");
            }else{ System.out.println(a % b);}
            break;
            default : System.out.println("invalid operator");
        }
    }
}
