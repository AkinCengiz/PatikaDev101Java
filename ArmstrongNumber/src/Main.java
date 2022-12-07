import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int stepNumber=0;
        System.out.print("Kontrol edilecek sayı : ");
        int number = input.nextInt();
        int stepValue, result=0;
        int tempNumber=number;

        while (tempNumber>0)
        {
            tempNumber/=10;
            stepNumber++;
        }
        tempNumber=number;
        System.out.print("Basamak Sayısı : "+stepNumber+"\n");
        while(tempNumber>0)
        {
            stepValue=tempNumber%10;
            System.out.print("Basamak Değeri : "+stepValue+" ==> "+stepValue+" üzeri "+stepNumber+" : "+Math.pow(stepValue,stepNumber)+"\n");
            tempNumber/=10;
            result += Math.pow(stepValue,stepNumber);
        }
        System.out.println("Toplam___________________________= "+result);
        if(number == result)
        {
            System.out.println(number + " sayısı armstrong sayıdır...");
        }
        else
        {
            System.out.println(number + " sayısı armstrong sayı değildir...");
        }
    }
}
