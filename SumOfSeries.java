public class SumOfSeries extends Thread{
    int n ;
    SumOfSeries(int n)
    {
        this.n = n;
    }
    public void run()
    {
        int s =0;
        for(int i=1;i<=n;i++) {
            s = s + i;
            System.out.println("SumOfSeries of " + i + "=" + s);
            try {
                sleep(300);
            } catch (InterruptedException ie) {
            }
        }
    }
}
