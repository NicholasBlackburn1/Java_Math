import java.util.Scanner;

class Main {
    public static void Main(String[] args){
        // scans for user input
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        // prints  and reads x var 
        System.out.println("insert x value");
        x.nextInt();
        // prints and reads y var 
        System.out.println("insert y value");
        y.nextInt();
       // numbers
        String x1 = x;
        String y1 = y;

        int n1 = Integer.parseInt(x1);
        int n2 = Integer.parseInt(y1);
        double result = n1 + n2;
        //  Prints results 
         System.out.println(result);
       
    }
}