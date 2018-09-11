import java.util.Scanner;

class Main {
    public static void Main(String[] args){
        // scans for user input
        int x, y
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        // prints  and reads x var 
        System.out.println("insert x value");
        x.nextInt();
        // prints and reads y var 
        System.out.println("insert y value");
        y.nextInt();
       // number

        int n1 = Integer.parseInt(x);
        int n2 = Integer.parseInt(y);
        double result = n1 + n2;
        //  Prints results 
         System.out.println(result);
       
    }
}