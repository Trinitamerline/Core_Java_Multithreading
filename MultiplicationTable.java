public class MultiplicationTable extends Thread{
    int n;

    MultiplicationTable(int n) {
        this.n = n;
    }

    public void run()
    {
        for(int i = 1;i<=n;i++) {
            System.out.println(n + "X" + i + "=" + n * i);
            try {
                sleep(300);
            } catch (InterruptedException ie) {
            }
        }
    }
}
