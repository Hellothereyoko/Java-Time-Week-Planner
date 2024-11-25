package Runtime;

// Module Imports
import java.time.DayOfWeek;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;

// Package Imports
import boot.Animation;
import static CurrentTaskList.CurrentTasks.printCurrentTasks;
import static Runtime.TimeSorting.sortTasksByTime;


public class Program {

    // Global Variable Storage
    static boolean menu = true;

    //Task Lists Storage
    static ArrayList<String> monTask = new ArrayList<>();
    static ArrayList<String> tueTask = new ArrayList<>();
    static ArrayList<String> wedTask = new ArrayList<>();
    static ArrayList<String> thuTask = new ArrayList<>();
    static ArrayList<String> friTask = new ArrayList<>();
    static ArrayList<String> satTask = new ArrayList<>();
    static ArrayList<String> sunTask = new ArrayList<>();


    public static void main(String[] args ) throws InterruptedException {

        // Boot Animation Called
        Animation.sequence();

        // Scanner Declaration
        Scanner input = new Scanner(System.in);


        // Help Prompts
        String help1 = "Enter task with time in format 'Task name (HH:mm)'";


        // Regular expression pattern for validating time format (HH:mm)
        String timeFormatRegex = "^.* \\(\\d{2}:\\d{2}\\)$";



        // Fetch current date/time from system
        // Just orients the user for now might implement more functionality if there's time
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek(); // Maybe use for alt msg later depending on DOW
        System.out.println('\n');


        // TASKS OUTPUT
        System.out.println('\n');
        System.out.println("Let's get this week planned out :)");
        System.out.println('\n');
        Thread.sleep(3500); // Make sure you can read msg before bumping to program




        // MAIN-MENU
        while (menu) {

            // PRINT TIME/DATE
            System.out.print('\n');
            System.out.println("                                Today's date: " + date);
            System.out.println("                                Today is: " + dayOfWeek);
            System.out.println("                                Current Local Time: " + time);
            System.out.println();

            //noinspection BusyWait
            Thread.sleep(950);


            // Import from Module to show after every modification
            printCurrentTasks(sunTask, monTask, tueTask, wedTask, thuTask, friTask, satTask);


            // SELECT PROMPT
            System.out.println('\n');
            System.out.println("|1. Add Task to Week|            " + "|2. Delete Task|            " + "|3. Build Week|            " + "|4. Quit|            ");

            System.out.println("_____________________");


        // Program Err Handling
        try {

            // OPERATION SELECT
            System.out.println("Please Choose an Operation: ");
            int usrChoice = input.nextInt();

            input.nextLine(); // Clear the newline bc java is mean to me
            int taskDay; // Declared outside of switch to save dup declaration

        // OPERATIONS LIST

            // ADD TASK
            if (usrChoice == 1) {
                System.out.println("1. Add Task to Week: ");
                System.out.println("Using 1-7 for days, what day is the task?: ");
                taskDay = input.nextInt();
                input.nextLine(); // Clear the newline after reading taskDay


                // Slapped In vars for functioning will move later
                String tskVal;
                String add;

                // Used for additional add in each taskDay
                boolean tsklist1;
                boolean tsklist2;
                boolean tsklist3;
                boolean tsklist4;
                boolean tsklist5;
                boolean tsklist6;
                boolean tsklist7;


                //Sub-routine for each day (sun = 1)
                switch (taskDay) {
                    case 1:
                        tsklist1 = true;
                        while (tsklist1) {

                            System.out.println(help1);
                            tskVal = input.nextLine();


                            // Validate if the input matches the expected format
                            if (!tskVal.matches(timeFormatRegex)) {
                                System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                                continue;
                            }

                            // If it passes the check add otherwise yeet that sucker
                            else{
                                sunTask.add(tskVal);
                            }

                            // Add another task?
                            System.out.println("Add another? (y or n):");
                            add = input.next();


                            if (add.equals("y")) {
                                // Kick Back to Add More
                            }

                            if (add.equals("n")) {
                                tsklist1 = false;
                                sortTasksByTime(sunTask);
                                // Sort the tasks in place (assuming task format "Task (HH:mm)")
                                // Set
                                // Move-on and sort if they don't want to add more
                            }
                            else{System.out.println("Please only use y or n");}

                            input.nextLine();// nom-nom extra line

                        } //EoT1
                        break;


                    case 2:
                        tsklist2 = true;
                        while (tsklist2) {

                            System.out.println(help1);
                            tskVal = input.nextLine();


                            // Validate if the input matches the expected format
                            if (!tskVal.matches(timeFormatRegex)) {
                                System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                                continue;
                            }

                            else{
                                monTask.add(tskVal);
                            }

                            // Add another task
                            System.out.println("Add another? (y or n):");
                            add = input.next();

                            if (add.equals("y")) {
                                // Kick Back to Add More
                            }if (add.equals("n")) {
                                tsklist2 = false;
                                sortTasksByTime(monTask);

                            }
                            else{System.out.println("Please only use y or n");}

                            input.nextLine();// nom-nom extra line
                        }// EoT2

                        break;


                    case 3:
                        tsklist3 = true;
                        while (tsklist3) {

                        System.out.println(help1);
                        tskVal = input.nextLine();

                        // Validate if the input matches the expected format
                        if (!tskVal.matches(timeFormatRegex)) {
                            System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                            continue;
                        }

                        else{
                            tueTask.add(tskVal);
                        }

                        // Add another task
                        System.out.println("Add another? (y or n):");
                        add = input.next();

                        if (add.equals("y")) {
                            // Kick Back to Add More

                        }if (add.equals("n")) {
                            tsklist3 = false;
                            sortTasksByTime(tueTask);
                        }
                        else{System.out.println("Please only use y or n");}

                        input.nextLine();// nom-nom extra line
                    }// EoT3
                        break;


                    case 4:
                        tsklist4 = true;
                        while (tsklist4) {

                        System.out.println(help1);
                        tskVal = input.nextLine();

                        // Validate if the input matches the expected format
                        if (!tskVal.matches(timeFormatRegex)) {
                            System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                            continue;
                        }

                        else{
                            wedTask.add(tskVal);
                        }

                        // Add another task
                        System.out.println("Add another? (y or n):");
                        add = input.next();

                        if (add.equals("y")) {
                            // Kick Back to Add More

                        }if (add.equals("n")) {
                            tsklist4 = false;
                            sortTasksByTime(wedTask);
                            System.out.println(wedTask);
                        }
                        else{System.out.println("Please only use y or n");}

                        input.nextLine();// nom-nom extra line
                     }// EoT4
                        break;


                    case 5:
                        tsklist5 = true;
                        while (tsklist5) {

                            System.out.println(help1);
                            tskVal = input.nextLine();

                            // Validate if the input matches the expected format
                            if (!tskVal.matches(timeFormatRegex)) {
                                System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                                continue;
                            }

                            else{
                                thuTask.add(tskVal);
                            }

                            // Add another task
                            System.out.println("Add another? (y or n):");
                            add = input.next();

                            if (add.equals("y")) {
                                // Kick Back to Add More
                            }if (add.equals("n")) {
                                tsklist5 = false;
                                sortTasksByTime(thuTask);
                            }
                            else{System.out.println("Please only use y or n");}

                            input.nextLine();// nom-nom extra line
                        }// EoT5
                        break;

                    case 6:
                        tsklist6 = true;
                        while (tsklist6) {

                            System.out.println(help1);
                            tskVal = input.nextLine();

                            // Validate if the input matches the expected format
                            if (!tskVal.matches(timeFormatRegex)) {
                                System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                                continue;
                            }

                            else{
                                friTask.add(tskVal);
                            }

                            // Add another task
                            System.out.println("Add another? (y or n):");
                            add = input.next();

                            if (add.equals("y")) {
                                // Kick Back to Add More
                            }if (add.equals("n")) {
                                tsklist6 = false;
                                sortTasksByTime(friTask);
                            }
                            else{System.out.println("Please only use y or n");}
                            input.nextLine();// nom-nom extra line

                        }// EoT6
                        break;

                    case 7:
                        tsklist7 = true;
                        while (tsklist7) {

                            System.out.println(help1);
                            tskVal = input.nextLine();

                            // Validate if the input matches the expected format
                            if (!tskVal.matches(timeFormatRegex)) {
                                System.out.println("Invalid format. Please follow the format 'Task description (HH:mm)'. Example: 'Meeting (14:30)'");
                                continue;
                            }

                            else{
                                satTask.add(tskVal);
                            }

                            // Add another task
                            System.out.println("Add another? (y or n):");
                            add = input.next();

                            if (add.equals("y")) {
                                // Kick Back to Add More
                            }if (add.equals("n")) {
                                tsklist7 = false;
                                sortTasksByTime(satTask);
                                // Sort the tasks in place (assuming task format "Task (HH:mm)")
                                // Set
                                // Move-on and sort if they don't want to add more
                            }
                            else{System.out.println("Please only use y or n");}
                            input.nextLine();// nom-nom extra line

                        }// EoT7
                        break;

                    default:
                        break;
                }


            }

            // DELETE TASK
            else if (usrChoice == 2) {
                System.out.println("What Day Do You Want To Delete? (1-7): ");
                taskDay = input.nextInt();

                int taskElement;
                switch (taskDay) {
                    case 1:
                        System.out.println(sunTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        sunTask.remove(taskElement);
                        break;

                    case 2:
                        System.out.println(monTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        monTask.remove(taskElement);
                        break;


                    case 3:
                        System.out.println(tueTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        tueTask.remove(taskElement);
                        break;

                    case 4:
                        System.out.println(wedTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        wedTask.remove(taskElement);
                        break;

                    case 5:
                        System.out.println(thuTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        thuTask.remove(taskElement);
                        break;

                    case 6:
                        System.out.println(friTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        friTask.remove(taskElement);
                        break;

                    case 7:
                        System.out.println(satTask);
                        System.out.println("Which Task?(Use Array Position Starting at 0): ");
                        taskElement = input.nextInt();
                        satTask.remove(taskElement);
                        break;


                    default:
                        break;
                }
            }

            // CALENDAR INSERT (Module Complete)
            else if (usrChoice == 3) {

                // Call Calendar Module
                WeekView.drawcal();
            }

            // QUIT (Module Complete)
            else if (usrChoice == 4) {
                menu = false; // Exit the loop
            }

        }//EoTry



        // Ruh-Roh Raggy! Something broke!
        catch (Exception e) {
            
                System.out.println("Invalid input. Please try again.");
                input.nextLine(); // Clear the invalid input from the buffer
                System.out.println("_____________________");

            }//EoCatch

        }//EoMenu

    }//EoMain

    }//EoProgram









