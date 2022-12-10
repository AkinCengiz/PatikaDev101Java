import java.util.Scanner;
public class Main {
    static  int getFibonacciNumber(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
    }
    static void getFibonacciSerial(int number)
    {
        int firstNumber = 1, lastNumber = 1, temp = 0;
        for(int i = 1; i <= number; i++)
        {
            if (i==1 || i==2)
            {
                System.out.print("1 ");
                continue;
            }
            temp = firstNumber + lastNumber;
            System.out.print(temp + " ");
            firstNumber = lastNumber;
            lastNumber = temp;


        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaçıncı elemanını yazdırmak istiyorsunuz : ");
        int size = input.nextInt();
        getFibonacciSerial(size);
        System.out.print("\nFibonacci serisinin "+size+". elemanı : "+getFibonacciNumber(size));
    }
}