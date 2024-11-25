package Runtime;

import static Runtime.Program.*;

public class WeekView {
    public static void drawcal () {

        System.out.println ("________________________________________________________________");
        System.out.println("|00:00                         TIME                         23:59|");
        System.out.println("|________________________________________________________________|");
        System.out.println("| Sunday: " + sunTask                                              );
        System.out.println("| *************************************************************  |");
        System.out.println ("| Monday: " + monTask                                              );
        System.out.println("| *************************************************************  |");
        System.out.println("| Tuesday: " + tueTask                                             );
        System.out.println("| *************************************************************  |");
        System.out.println("| Wednesday: " + wedTask                                           );
        System.out.println("| *************************************************************  |");
        System.out.println("| Thursday: " + thuTask                                            );
        System.out.println("| *************************************************************  |");
        System.out.println("| Friday: " + friTask                                              );
        System.out.println("| *************************************************************  |");
        System.out.println("| Saturday: " + satTask                                            );
        System.out.println("|________________________________________________________________|");

    } //EoM
} //EoC
