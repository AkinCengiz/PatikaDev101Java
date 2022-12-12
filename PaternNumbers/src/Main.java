
import java.util.Scanner;
public class Main {

    static void RecursivePatern(int number, int num, boolean islem)
    {
        if((islem == false) && (num <= number && num > 0))
        {
            System.out.print(num + " ");
            num -= 5;
            if(num <= 0)
            {
                RecursivePatern(number, num, true);
            }else
            {
                RecursivePatern(number, num, false);
            }
        }
        else if((islem == true) && num <= number)
        {
            System.out.print(num + " ");
            num += 5;
            RecursivePatern(number, num, true);
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = scan.nextInt();
        boolean islem = false;
        RecursivePatern(number,number, islem);
    }
}
