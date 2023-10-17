import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n for factorial");
        int n = scanner.nextInt();
        System.out.println("Enter n for Sumofseries");
        int n1 = scanner.nextInt();
        System.out.println("Enter n for multiplication");
        int n2 = scanner.nextInt();
        Factorial fact = new Factorial(n);
        SumOfSeries sos = new SumOfSeries(n1);
        MultiplicationTable mt = new MultiplicationTable(n2);
        fact.start();
        sos.start();
        mt.start();
    }
}
