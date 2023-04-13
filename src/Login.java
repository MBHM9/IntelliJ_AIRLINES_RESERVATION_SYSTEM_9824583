import java.util.Arrays;

public class Login {

    private User_Pass[] User_Pass;
    private User_Pass_admin[] User_Pass_admin;


    public Login(User_Pass[] user_Pass, User_Pass_admin[] user_Pass_admin) {
        User_Pass = user_Pass;
        User_Pass_admin = user_Pass_admin;
    }

    public User_Pass[] getUser_Pass() {
        return User_Pass;
    }

    public void setUser_Pass(User_Pass[] user_Pass) {
        User_Pass = user_Pass;
    }

    public User_Pass_admin[] getUser_Pass_admin() {
        return User_Pass_admin;
    }

    public void setUser_Pass_admin(User_Pass_admin[] user_Pass_admin) {
        User_Pass_admin = user_Pass_admin;
    }

    public User_Pass find_user (String user_f, String pass_f){
        for (int i = 0; i < User_Pass.length; i++) {
            if(User_Pass[i]!=null && User_Pass[i].getUser().equals(user_f) && User_Pass[i].getPass().equals(pass_f) ){
                return User_Pass[i];
            }
        }
        return null;
    }

    public User_Pass change_pass_user (String user_f, String pass_f){
        for (int i = 0; i < User_Pass.length; i++) {
            if(User_Pass[i]!=null && User_Pass[i].getUser().equals(user_f)){
                User_Pass[i].setPass(pass_f);
                return User_Pass[i];
            }
        }
        return null;
    }

    public User_Pass_admin find_admin (String admin_user_f, String admin_pass_f){
        for (int i = 0; i < User_Pass_admin.length; i++) {
            if(User_Pass_admin[i]!=null && User_Pass_admin[i].getUser_admin().equals(admin_user_f) && User_Pass_admin[i].getPass_admin().equals(admin_pass_f) ){
                return User_Pass_admin[i];
            }
        }
        return null;
    }




    public User_Pass add_user(String user_E, String pass_E) {
        int len = User_Pass.length;
        User_Pass[len].setUser(user_E);
        User_Pass[len].setPass(pass_E);
        User_Pass[len].setCharge(0);
        return User_Pass[len];
    }



}