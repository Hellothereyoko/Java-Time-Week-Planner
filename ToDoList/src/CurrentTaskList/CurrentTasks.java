package CurrentTaskList;

import java.util.ArrayList;

public class CurrentTasks {
    public static void printCurrentTasks(ArrayList<String> sunTask, ArrayList<String> monTask, ArrayList<String> tueTask, ArrayList<String> wedTask, ArrayList<String> thuTask, ArrayList<String> friTask, ArrayList<String> satTask) {

        System.out.println("Current Tasks: ");
        System.out.println("_____________________");
        System.out.println("Sunday: " + sunTask);
        System.out.println("Monday: " + monTask);
        System.out.println("Tuesday: " + tueTask);
        System.out.println("Wednesday: " + wedTask); // Example empty list for other days
        System.out.println("Thursday: " + thuTask);
        System.out.println("Friday: " + friTask);
        System.out.println("Saturday: " + satTask);
        System.out.println("_____________________");
    } //EoM

} //EoC
