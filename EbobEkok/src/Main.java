import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int number1,number2;
        int obeb=1,okek=1;
        System.out.print("Birinci sayıyı giriniz : ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz  : ");
        number2 = input.nextInt();
        int bigNumber = number1>number2?number1:number2;
        for(int i = 2; i <= bigNumber/2;i++)
        {
            if(number1 % i == 0 && number2 % i == 0)
            {
                obeb = i;
            }
        }

        okek = (number1*number2)/obeb;
        System.out.println(number1 + " ile "+number2 +" sayılarının obebi : "+obeb+" okeki : "+okek);
    }
}
