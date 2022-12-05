import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak olan yılı giriniz : ");
        int year = input.nextInt();
        boolean isLeapYear = (year%4==0) ? true : false;

        if(isLeapYear == true)
        {
            System.out.println(year + " yılı artık yıldır...");
        }else
        {
            System.out.println(year + " yılı artık yıl değildir...");
        }
    }
}
