import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number)
    {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0)
        {
            lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber ? true : false;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol edilecek sayıyı girini : ");
        int number = input.nextInt();
        boolean control = isPalindrom(number);
        if(control == true)
        {
            System.out.println(number+" sayısı palindrom bir sayıdır...");
        }
        else
        {
            System.out.println(number+" sayısı palindrom bir sayı değildir...");
        }



    }
}