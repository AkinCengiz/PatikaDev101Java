import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int baseNumber = input.nextInt();
        System.out.print("Üs değerini giriniz :");
        int powerNumber = input.nextInt();
        int result=1;
        for(int i = 0; i<= powerNumber;i++)
        {
            if(i==0)
            {
                result = 1;
                continue;
            }
            result *= baseNumber;
        }
        System.out.print("Sonuç : "+result);
    }
}
