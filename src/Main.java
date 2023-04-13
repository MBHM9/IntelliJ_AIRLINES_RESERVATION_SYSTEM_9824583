import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //  Flight_schedule FS1 = new Flight_schedule("WX-12", "Yazd", "Tehran", "1402-01-27", "22:30", 700, 41);
       // User_Pass U1 = new


        User_Pass user_enter_data = new User_Pass(null, null, 0, null);
        Login Login = new Login(null, null);
        Scanner input = new Scanner(System.in);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("           WELCOME TO AIRLINES RESERVATION SYSTEM");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("........................MENU OPTIONS......................");
        System.out.println("<1> Sign in");
        System.out.println("<2> Sign up");
        String menu_get = input.next();
        if(menu_get.equals("1")) {
            System.out.println("Enter user:");
            String user_enter = input.next();
            System.out.println("Enter pass:");
            String pass_enter = input.next();
            user_enter_data = Login.find_user(user_enter, pass_enter);
            System.out.println(user_enter_data.toString());
        }
    }
}
