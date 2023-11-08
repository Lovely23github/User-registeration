package user.registeration;

import java.util.Scanner;

public class UserRegt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname=sc.nextLine();
        System.out.println("Enter your last name:");
        String lname=sc.nextLine();



        private static boolean isValidFirstName(String fname) {
            // Check if the first name starts with a capital letter
            if (fname.length() >= 3 && Character.isUpperCase(fname.charAt(0))) {
                return true;
            } else {
                return false;
            }

    }

}
