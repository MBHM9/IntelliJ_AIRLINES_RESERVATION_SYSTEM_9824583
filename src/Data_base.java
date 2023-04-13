import java.util.Arrays;

public class Data_base {

    private Flight_schedule[] Flight_schedule;

    public Data_base(Flight_schedule[] flight_schedule) {
        Flight_schedule = flight_schedule;
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
                "Flight_schedule=" + Arrays.toString(Flight_schedule) +
                '}';
    }
}
