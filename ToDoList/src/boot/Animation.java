//package dec
package boot;



public class Animation {
    public static void sequence () throws InterruptedException{

        // Program Logo
        System.out.println('\n');
        System.out.println("         )");
        System.out.println("        (  (                                                                               ");
        Thread.sleep(500);
        System.out.println("         )  )                                                                              ");
        Thread.sleep(500);
        System.out.println("       ---------                                                                           ");
        Thread.sleep(500);
        System.out.println("      |         |>>           *    ***   *   *   ***    *******  ******  *      *  ******* ");
        Thread.sleep(500);
        System.out.println("      | V:1.0.1 |  >          *   *   *  *   *  *   *      *       *     * *  * *  *_____  ");
        Thread.sleep(500);
        System.out.println("      |         |  >      *   *   *****  *   *  *****      *       *     *  **  *  *       ");
        Thread.sleep(500);
        System.out.println("      |         |>>        ***    *   *   ***   *   *      *     ******  *      *  ******* ");
        Thread.sleep(500);
        System.out.println("       ---------                          Designed by: Yoko Parks                          ");
        Thread.sleep(500);
        System.out.println("    _______________                                                                        ");
        Thread.sleep(500);
        System.out.println("      ^^^^^^^^^^^                                                                          ");


        // BOOT & INIT SEQUENCE
        Thread.sleep(1000);
        System.out.print("Booting Program");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
    }
}
