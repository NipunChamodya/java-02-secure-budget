//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String savedUsername = "Nipun";
        String savedPassword = "Nipun@123";

        System.out.println("Enter Username");
        String inputUsername = input.next();
        System.out.println("Enter Password");
        String inputPassword = input.next();

        if(savedUsername.equals(inputUsername) && savedPassword.equals(inputPassword)){
            System.out.println("Login Successfully");

            System.out.println("What is your monthly income ? ");
            double income = input.nextInt();
            System.out.println("What is your monthly food expenses ? ");
            double food = input.nextInt();
            System.out.println("What is your monthly bill expenses ? ");
            double bill = input.nextInt();

            double balance = income - (food + bill );

            if (balance > 0){
                System.out.println("You saved money");
            } else if (balance == 0) {
                System.out.println("you saved nothing");
            } else {
                System.out.println("you broke in this month");
            }




        }else{
            System.out.println("Username or Password is incorrect ");

        }



    }
}