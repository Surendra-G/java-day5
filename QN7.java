package Workshop5;
import java.util.Scanner;

public class QN7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What do you want to use this calculator? (Y/N)\n");
        String user1 = input.nextLine().toLowerCase();

        while (!user1.equals("n")) {
            System.out.println("Press 1: Add two integers.");
            System.out.println("Press 2: Add two floating numbers.");
            System.out.println("Press 3: Add three integers.");
            System.out.println("Press 4: Add three floating numbers.");
            System.out.println("Press 5: Exit");
            System.out.print("What do you want to do: ");
            int user = input.nextInt();

            if (user == 5) {
                System.out.println("You exited from the Calculator");
                break; 
            }

            switch (user) {
                case 1:
                    System.out.print("Enter 1st number: ");
                    int u1 = input.nextInt();
                    System.out.print("Enter 2nd number: ");
                    int u2 = input.nextInt();
                    calculator cal = new calculator(u1, u2);
                    break;
                case 2:
                    System.out.print("Enter 1st float number: ");
                    double u3 = input.nextDouble();
                    System.out.print("Enter 2nd float number: ");
                    double u4 = input.nextDouble();
                    new calculator(u3, u4);
                    break;
                case 3:
                    System.out.print("Enter 1st integer number: ");
                    int u5 = input.nextInt();
                    System.out.print("Enter 2nd integer number: ");
                    int u6 = input.nextInt();
                    System.out.print("Enter 3rd integer number: ");
                    int u7 = input.nextInt();
                    new calculator(u5, u6, u7);
                    break;
                case 4:
                    System.out.print("Enter 1st float number: ");
                    double u8 = input.nextDouble();
                    System.out.print("Enter 2nd float number: ");
                    double u9 = input.nextDouble();
                    System.out.print("Enter 3rd float number: ");
                    double u10 = input.nextDouble();
                    new calculator(u8, u9, u10);
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            input.nextLine(); // Clear the buffer
            user1 = input.nextLine().toLowerCase();
        }
        System.out.println("\n\n ----------Thank Your using my program-------------");

        input.close();
    }
}

class calculator {
    calculator(double a, double b) {
        double add = a + b;
        System.out.println("The sum of the two floating numbers is: " + add);
    }

    calculator(int a, int b) {
        double add = a + b;
        System.out.println("The sum of the two integers numbers is: " + add);
    }

    calculator(int a, int b, int c) {
        double add = a + b + c;
        System.out.println("The sum of the three integers numbers is: " + add);
    }

    calculator(double a, double b, double c) {
        double add = a + b + c;
        System.out.println("The sum of the three floating numbers is: " + add);
    }
}
