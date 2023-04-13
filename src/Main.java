import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Flight_schedule[] Flight_schedule = new Flight_schedule[1000];
        Flight_schedule[0] = new Flight_schedule("WX-12", "Yazd", "Tehran", "1402-01-27", "22:30", 700, 41);
        User_Pass[] User_Pass = new User_Pass[10000];
        User_Pass[0] = new User_Pass("mohammad", "1234", 0, null);
        User_Pass_admin[] User_Pass_admin = new User_Pass_admin[10];


        User_Pass user_enter_data = new User_Pass(null, null, 0, null);
        Login Login = new Login(User_Pass, User_Pass_admin);


        Scanner input = new Scanner(System.in);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("           WELCOME TO AIRLINES RESERVATION SYSTEM");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        while(true) {
            System.out.println("........................MENU OPTIONS......................");
            System.out.println("<1> Sign in");
            System.out.println("<2> Sign up");
            String menu_get = input.next();

            if (menu_get.equals("1")) {
                System.out.println("Enter user:");
                String user_enter = input.next();
                System.out.println("Enter pass:");
                String pass_enter = input.next();
                user_enter_data = Login.find_user(user_enter, pass_enter);
                if (user_enter_data == null) {
                    System.out.println("user not found!");
                } else {
                    System.out.println(user_enter_data.toString());
                }
            }
        }
    }
}
