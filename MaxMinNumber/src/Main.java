import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı girmek istiyorsunuz : ");
        int numberAmount = input.nextInt();
        int maxNumber=0, minNumber=1000;
        int[] numbers = new int[numberAmount];
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print("\n" + (i+1) + ". sayıyı giriniz : ");
            numbers[i] = input.nextInt();
            maxNumber = numbers[i] > maxNumber ? numbers[i] : maxNumber;
            minNumber = numbers[i] < minNumber ? numbers[i] : minNumber;
        }
        System.out.println("Girdiğiniz sayılar içerisinde en büyük sayı : "+maxNumber);
        System.out.println("Girdiğiniz sayılar içerisinde en küçük sayı : "+minNumber);
    }
}