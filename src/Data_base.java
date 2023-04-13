import java.util.Arrays;

public class Data_base {

    private User_Pass[] User_Pass;
    private Flight_schedule[] Flight_schedule;

    public Data_base(User_Pass[] user_Pass, Flight_schedule[] flight_schedule) {
        User_Pass = user_Pass;
        Flight_schedule = flight_schedule;
    }

    public User_Pass[] getUser_Pass() {
        return User_Pass;
    }

    public void setUser_Pass(User_Pass[] user_Pass) {
        User_Pass = user_Pass;
    }

    public Flight_schedule[] getFlight_schedule() {
        return Flight_schedule;
    }

    public void setFlight_schedule(Flight_schedule[] flight_schedule) {
        Flight_schedule = flight_schedule;
    }











    @Override
    public String toString() {
        return "Data_base{" +
                "User_Pass=" + Arrays.toString(User_Pass) +
                ", Flight_schedule=" + Arrays.toString(Flight_schedule) +
                '}';
    }


}
