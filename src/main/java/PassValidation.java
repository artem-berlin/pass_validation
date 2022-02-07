import java.util.Objects;
import java.util.Scanner;

public class PassValidation {
    static final String pass2 ="artem"; // pass to compare
    static final int passLength = 5; // pass length to compare

    public static void main(String[] args) {
       // String pass2="artem"; // pass to compare
        //String pass = "artem"; //main pass to test
       // int passLength = 5; // pass length to compare
        System.out.println("Enter your password:");
        Scanner in = new Scanner(System.in);
        String pass = in.next();
     //---------------------------------------------------------------------
        System.out.println(ifPassEmpty(pass));
        System.out.println(passLength(pass,passLength));
        System.out.println("Numbers im password ----> " + ifNumber(pass));
        System.out.println("Password has lowcase ----> " + lowCase(pass));
        System.out.println("Password has uppercase ----> " + upperCase(pass));
        System.out.println("your pass is " + pass);
        System.out.println(ifPassEqual(pass,pass2));
        System.out.println("All tests result----------------------->" + allTestResult(pass,pass2,5));

    }
    public static String ifPassEmpty(String pass) {
        if (Objects.equals(pass, "")) {
            return "Error, password is empty.";
        } else
            return "Password is not empty";
    }
    public static String passLength(String pass, int passLength) {
        if (pass.length() < passLength) {
            return "Error, password too short.";
        }else
            return "Password is ok";
    }
    private static Boolean ifNumber(String pass) {
        boolean result = false;
        for (int i=0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                result = true;
            }
        }
        return result;
    }
    public static boolean lowCase(String pass) {
        char currentChar;

        boolean isLowerCase = false;
        for (int i = 0; i < pass.length(); i++) {
            currentChar = pass.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                isLowerCase = true;
            }

        }
        return (isLowerCase);
    }
    public static boolean upperCase(String pass) {
        char currentChar;
        boolean isUppercase = false;

        for (int i = 0; i < pass.length(); i++) {
            currentChar = pass.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                isUppercase = true;
            }

        }
        return (isUppercase);
    }
    static String ifPassEqual(String pass, String pass2) {
        if (pass.equals(pass2)) {

           return "Pass is valid";
        } else {
            return "Pass is not valid";
        }
    }
    public static boolean allTestResult(String pass, String pass2, int passLength){
        if (!ifPassEmpty(pass).equals("Password is not empty") && !passLength(pass, passLength).equals("Password is ok") && ifNumber(pass) && !lowCase(pass)) {
            upperCase(pass);
        }// return false;

        return true;
    }

}

//-----------------------------------------------------------
//
// public static void main(String[] args) {
//          ifPassvalid("artem","artem");
//  }
//  static void  ifPassvalid (String pass, String pass2) {
//      if (pass.equals(pass2)) {
//
//          System.out.println("Pass is valid");
//      } else {
//          System.out.println("Pass is not valid");
//      }
//
//
//  }