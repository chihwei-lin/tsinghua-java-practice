import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ForTester {
    public static void main(String[] args) {
        Enumeration<String> days;
        List<String> dayNames = new ArrayList<String>();

        dayNames.add("Sunday");
        dayNames.add("Tuesday");
        dayNames.add("Monday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        for ( String day : dayNames){
            System.out.println(day);
        }

    }
}
