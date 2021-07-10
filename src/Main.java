import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        String username = "admin",password = "12345";
        String usernameInput,passwordInput;
        int choice;

        System.out.println("------------------ Welcome ------------------");
        System.out.println("-> Press 1 to create your username & password");
        System.out.println("-> Press 2 to login");
        System.out.println("---------------------------------------------");
        System.out.print("\nYour Choice: ");
        choice = keyboard.nextInt();
        keyboard.nextLine();//Dummy Line

        switch (choice){

            case 1:
                System.out.print("New Username: ");
                username = keyboard.nextLine();

                System.out.print("New Password:");
                password = keyboard.nextLine();

                System.out.println("------------ Login Screen ------------");
                System.out.print("Username: ");
                usernameInput = keyboard.nextLine();
                System.out.print("Password: ");
                passwordInput = keyboard.nextLine();

                if (username.equals(usernameInput) && password.equals(passwordInput)){


                    System.out.println("!!! You are logged in successfully !!!");


                }else {

                    System.out.println("!!! Username or password is wrong !!!");
                    System.out.println("Do you want to reset your password?");
                    System.out.println("1.Yes\n2.No");
                    System.out.print("Your Choice: ");
                    choice = keyboard.nextInt(); keyboard.nextLine();

                    if (choice == 1){

                        System.out.print("New Password: ");
                        String resetPassword = keyboard.nextLine();

                        if (resetPassword.equals(passwordInput) || resetPassword.equals(password)){

                            System.out.println("This password can not be created. Please try another one.");

                        }else{

                            System.out.println("This password is created.");

                        }

                    }else if (choice == 2){

                        System.out.println("Goodbye.");

                    }else{

                        System.out.println("Invalid Input!");

                    }

                }

                break;

            case 2:

                System.out.println("------------ Login Screen ------------");
                System.out.print("Username: ");
                usernameInput = keyboard.nextLine();
                System.out.print("Password: ");
                passwordInput = keyboard.nextLine();

                if (username.equals(usernameInput) && password.equals(passwordInput)){


                    System.out.println("!!! You are logged in successfully !!!");


                }else {

                    System.out.println("!!! Username or password is wrong !!!");
                    System.out.println("Do you want to reset your password?");
                    System.out.println("1.Yes\n2.No");
                    System.out.print("Your Choice: ");
                    choice = keyboard.nextInt(); keyboard.nextLine();

                    if (choice == 1){

                        System.out.print("New Password: ");
                        String resetPassword = keyboard.nextLine();

                        if (resetPassword.equals(passwordInput) || resetPassword.equals(password)){

                            System.out.println("This password can not be created. Please try another one.");

                        }else{

                            System.out.println("This password is created.");

                        }

                    }else if (choice == 2){

                        System.out.println("Goodbye.");

                    }else{

                        System.out.println("Invalid Input!");

                    }

                }




        }












    }
}
