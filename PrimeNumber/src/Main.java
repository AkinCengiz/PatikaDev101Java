import java.util.Scanner;
public class Main {

    static boolean isPrime(int number, int i)
    {
        if(i == 1)
        {
            return true;
        }
        else
        {
            if(number % i == 0)
            {
                return false;
            }
            else
            {
                return isPrime(number,i-1);
            }
        }

    }
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Asal mı sorgulaması yapılacak sayıyı giriniz : ");
        int number = input.nextInt();
        boolean result = isPrime(number,number/2);
        if(result)
        {
            System.out.print(number+ " asal sayıdır...");
        }
        else
        {
            System.out.print(number+ " asal sayı değildir...");
        }
    }
}
