import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Flight_schedule[] Flight_schedule = new Flight_schedule[1000];


        Flight_schedule[0] = new Flight_schedule("WX-12", "Yazd", "Tehran", "1402-01-27", "22:30", 700, 41);
        Flight_schedule[1] = new Flight_schedule("GA-12", "Yazd", "Esfahan", "1402-05-27", "00:30", 300, 150);


        User_Pass[] User_Pass = new User_Pass[10000];
        User_Pass[0] = new User_Pass("mohammad", "1234", 5000, null);
        User_Pass[1] = new User_Pass("Ali", "5863", 1500, null);

        User_Pass_admin[] User_Pass_admin = new User_Pass_admin[10];
        User_Pass_admin[0] = new User_Pass_admin("admin1", "123456");
        User_Pass_admin[1] = new User_Pass_admin("admin2", "78910");

        User_Pass user_enter_data = new User_Pass(null, null, 0, null);
        User_Pass_admin admin_enter_data = new User_Pass_admin(null, null);


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
                    admin_enter_data = Login.find_admin(user_enter, pass_enter);
                    if(admin_enter_data == null){
                        System.out.println("user not found!");
                    }else{
                        /////////////start admin menu

                    }
                } else {
                   /////////////start passenger menu
                    boolean passenger_menu = true;
                    passenger_menu_start:
                    while (passenger_menu) {
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println("                  PASSENGER MENU OPTION");
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println("..........................................................");
                        System.out.println("<1> Change password");
                        System.out.println("<2> Search flight tickets");
                        System.out.println("<3> Booking ticket");
                        System.out.println("<4> Ticket cancellation");
                        System.out.println("<5> Booked ticket");
                        System.out.println("<6> Add charge");
                        System.out.println("<0> Sign out");
                        String enter_option_user = input.next();
                        if(enter_option_user.equals("0")) {
                            passenger_menu = false;
                        }if(enter_option_user.equals("1")){
                            System.out.println("Enter old password:");
                            String old_pass = input.next();
                            if(old_pass.equals(user_enter_data.getPass())){
                                System.out.println("Enter new password:");
                                String new_pass = input.next();
                                user_enter_data = Login.change_pass_user(user_enter, new_pass);
                                System.out.println("Password changed\nnew password : "+new_pass);
                            }else {
                                System.out.println("old pass is wrong!");
                            }
                        }
                    }
                }
            }
        }
    }
}
