public class Main {
    public static void main(String[] args) {

        boolean isPrime = true;
        for(int i = 2; i<=100;i++)
        {
            if(i==2 || i==3)
            {
                System.out.print(i + " ");
                continue;
            }
            isPrime = true;
            for(int j = 2; j <= i/2; j++)
            {
                if( i % j == 0)
                {
                    isPrime = false;
                    break;
                }else
                {
                    isPrime = true;
                    continue;
                }
            }
            if(isPrime == true)
            {
                System.out.print(i+" ");
            }
        }
    }
}