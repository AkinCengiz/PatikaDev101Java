import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isPerfect;
        System.out.print("Mükemmel mi sorgusunu yapacağınız sayıyı giriniz : ");
        int number = input.nextInt();
        int totalDivision = 0;

        for(int i = 1; i<= number/2;i++)
        {
            if(number % i == 0)
            {
                totalDivision += i;
            }
        }

        isPerfect = totalDivision==number ? true : false;

        if(isPerfect == true)
        {
            System.out.println(number + " Mükemmel Sayıdır!!!");
        }else
        {
            System.out.println(number+" Mükemmel Sayı Değildir...");
        }

    }
}