package Runtime;

import java.util.ArrayList;

public class TimeSorting {
    public static void sortTasksByTime(ArrayList<String> taskList){
        taskList.sort((a, b) -> {
            // Extract time strings within parentheses for both entries
            String timeA = a.substring(a.indexOf('(') + 1, a.indexOf(')'));
            String timeB = b.substring(b.indexOf('(') + 1, b.indexOf(')'));

            // Return the comparison result
            return timeA.compareTo(timeB);
        });
    }//EoM
}//EoC
