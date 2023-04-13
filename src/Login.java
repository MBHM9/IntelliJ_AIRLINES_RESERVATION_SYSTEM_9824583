import java.util.Arrays;

public class Login {

    private User_Pass[] User_Pass;
    private String admin1_user = "admin1";
    private String admin2_user = "admin2";
    private String admin3_user = "admin3";
    private String admin1_pass = "pass1";
    private String admin2_pass = "pass2";
    private String admin3_pass = "pass3";

    public Login(User_Pass[] user_Pass) {
        User_Pass = user_Pass;
    }

    public User_Pass[] getUser_Pass() {
        return User_Pass;
    }

    public void setUser_Pass(User_Pass[] user_Pass) {
        User_Pass = user_Pass;
    }

    public String getAdmin1_user() {
        return admin1_user;
    }

    public String getAdmin2_user() {
        return admin2_user;
    }

    public String getAdmin3_user() {
        return admin3_user;
    }

    public String getAdmin1_pass() {
        return admin1_pass;
    }

    public String getAdmin2_pass() {
        return admin2_pass;
    }

    public String getAdmin3_pass() {
        return admin3_pass;
    }

    @Override
    public String toString() {
        return "Login{" +
                "User_Pass=" + Arrays.toString(User_Pass) +
                ", admin1_user='" + admin1_user + '\'' +
                ", admin2_user='" + admin2_user + '\'' +
                ", admin3_user='" + admin3_user + '\'' +
                ", admin1_pass='" + admin1_pass + '\'' +
                ", admin2_pass='" + admin2_pass + '\'' +
                ", admin3_pass='" + admin3_pass + '\'' +
                '}';
    }

}
