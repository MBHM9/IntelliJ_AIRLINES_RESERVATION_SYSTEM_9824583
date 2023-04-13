import java.util.Arrays;

public class User_Pass {
    private String user;
    private String pass;
    private int charge;
    private Flight_schedule[] Flight_schedules;

    public User_Pass(String user, String pass, int charge, Flight_schedule[] flight_schedules) {
        this.user = user;
        this.pass = pass;
        this.charge = charge;
        Flight_schedules = flight_schedules;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public Flight_schedule[] getFlight_schedules() {
        return Flight_schedules;
    }

    public void setFlight_schedules(Flight_schedule[] flight_schedules) {
        Flight_schedules = flight_schedules;
    }

    @Override
    public String toString() {
        return "User_Pass{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", charge=" + charge +
                ", Flight_schedules=" + Arrays.toString(Flight_schedules) +
                '}';
    }
}
