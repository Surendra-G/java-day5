package Workshop5;
import java.util.Scanner;

public class online_ordering_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, This is the online Ordering Program.");
        System.out.println("Press 1: Sign Up.");
        System.out.println("Press 2: Quit The Application");
        System.out.println("What do you want to do: ");
        int user = input.nextInt();
        input.nextLine(); 
        

        while (user != 2) {
            System.out.println("Enter your Full Name: ");
            String full_name = input.nextLine();
            if (full_name.length() >= 4) {
                System.out.println("Enter your Phone Number: ");
                String phone = input.nextLine();
                if (phone.length() >= 10 && phone.startsWith("0")) {
                    System.out.println("Enter your password: ");
                    String password = input.nextLine();
                    if (password.matches("^[a-zA-Z]+[@&]\\d+$")) {
                        System.out.println("Confirm your password: ");
                        String confirm_password = input.nextLine();
                        if (password.equals(confirm_password)) {
                            System.out.println("Enter your date of birth in DD/MM/YYYY: ");
                            String birth = input.nextLine();
                            if (birth.matches("((0[1-9]|[12]\\d|3[01])/(0[13578]|1[02])/\\d{4})|((0[1-9]|[12]\\d|30)/(0[13456789]|1[012])/\\d{4})|((0[1-9]|1\\d|2[0-8])/02/\\d{4})|29/02/(\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][048]|[13579][26])00)")) {
                                System.out.println("You have successfully signed up.");
                            } else {
                                System.out.println("Your Date of birth did not match.");
                            }
                        } else {
                            System.out.println("Your passwords did not match.");
                        }
                    } else {
                        System.out.println("Password must initiate with alphabets followed by either '@' or '&' and end with a numeric.");
                    }
                } else {
                    System.out.println("Your number must start with 0 and have 10 digits.");
                }
            } else {
                System.out.println("Your name must be greater than 4 letters.");
            }

            System.out.println("Press 1: Sign Up.");
            System.out.println("Press 2: Quit The Application");
            System.out.println("What do you want to do: ");
            user = input.nextInt();
            input.nextLine(); // Consume newline
        }

        System.out.println("_______Thank You for Using my Program______");
        input.close();
    }
}