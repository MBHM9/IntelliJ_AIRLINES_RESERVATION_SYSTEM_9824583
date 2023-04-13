public class User_Pass_admin {
    private String user_admin;
    private String pass_admin;

    public User_Pass_admin(String user_admin, String pass_admin) {
        this.user_admin = user_admin;
        this.pass_admin = pass_admin;
    }

    public String getUser_admin() {
        return user_admin;
    }

    public void setUser_admin(String user_admin) {
        this.user_admin = user_admin;
    }

    public String getPass_admin() {
        return pass_admin;
    }

    public void setPass_admin(String pass_admin) {
        this.pass_admin = pass_admin;
    }

    @Override
    public String toString() {
        return "User_Pass_admin{" +
                "user_admin='" + user_admin + '\'' +
                ", pass_admin='" + pass_admin + '\'' +
                '}';
    }
}
