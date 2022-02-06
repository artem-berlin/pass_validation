public class PracticeRegex {
   static String pass = "artem";
   static String pass2 = "Artem";
   static String pass3 = "artem";

    public static void main(String[] args) {
     ifPassvalid(pass,pass3);
    }
    static void ifPassvalid (String pass, String pass2) {
        if (pass.equals(pass2)) {

            System.out.println("Pass is valid");
        } else {
            System.out.println("Pass is not valid");
        }

    }}
//       System.out.println(pass.equals(pass2));
//        System.out.println(pass.equals(pass3);
//
//        static String input;
//        public static void main(String args[])
//        {
//            System.out.println("Enter a String ");
//            Scanner sc = new Scanner(System.in);
//            if(sc.hasNext("[A-Za-z]*")) {
//                input = sc.next();
//                System.out.println("You entered a valid password"+input);
//            }else {
//                System.out.println("Please Enter valid password");
//            }
//        }
  //  }
    //------------------------------------------------------------
//       String pass = "artem";
//       String pass2 = "Artem";
//         String pass3 = "artem"
//       System.out.println(pass.equals(pass2));
//        System.out.println(pass.equals(pass3);
//-----------------------------------------------------------------------
//    // Function to validate the password
//    public static boolean isValidPass(String pass)
//    {
//
//
//        String regex = "^[A-Za-z]\\w{5,29}$";
//
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(a);
 //       Matcher m2 = p.matcher(a);
//
//        // Return if the username
//        // matched the ReGex
//        return m.matches();
//    }
//
//    public static void main(String[] args)
//    {
//         String pass;
//        // Test Case: 1
//         pass = "artem";
//        System.out.println(isValidPass(String a));
//
//        // Test Case: 2
//        String str3 = "Art";
//        System.out.println(isValidPass(str3));
//
//        // Test Case: 3
//        String str5 = "1Art";
//        System.out.println(isValidPass(str5));
//    }
//}
