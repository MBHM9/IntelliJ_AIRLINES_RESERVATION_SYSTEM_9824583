import java.util.Arrays;

public class Login {

    private User_Pass[] User_Pass;

    public Login(User_Pass[] user_Pass) {
        User_Pass = user_Pass;
    }

    public User_Pass[] getUser_Pass() {
        return User_Pass;
    }

    public void setUser_Pass(User_Pass[] user_Pass) {
        User_Pass = user_Pass;
    }



    public User_Pass find_user (String user_f, String pass_f){
        for (int i = 0; i < User_Pass.length; i++) {
            if(User_Pass[i]!=null && user_f == User_Pass[i].getUser()  && pass_f == User_Pass[i].getPass() ){
                return User_Pass[i];
            }
        }
        return null;
    }







}
