import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Taban sayısını giriniz : ");
        int taban = input.nextInt();
        System.out.print("Us sayısını giriniz : ");
        int us = input.nextInt();
        for(int i =0; i<=us; i++)
        {
            if(i==0)
            {
                result =1;
                continue;
            }
            result *= taban;
        }
        System.out.print(taban+" sayısının "+us+". kuvveti : "+result);
    }
}
