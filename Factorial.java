public class Factorial extends Thread {
    int n;
    Factorial(int n)
    {
        this.n = n;
    }
    public void run()
    {
        int f = 1;
        for(int i=1;i<=n;i++) {
            f = f * i;
            System.out.println("Factorial of " + i + "=" + f);
            try {
                sleep(300);
            } catch (InterruptedException ie) {
            }
        }
    }
}
