import java.util.Scanner;

class Main {
    public static void Main(String[] args){
        // scans for user input
        int x, y ;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        // prints  and reads x var 
        System.out.println("insert x value");
        x = in.nextInt();
        // prints and reads y var 
        System.out.println("insert y value");
        y = in2.nextInt();
       // number

       
        double result = x + y;
        //  Prints results 
         System.out.println(result);
       
    }
}