import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak yılı giriniz : ");
        int year = input.nextInt();
        if(year % 4 == 0)
        {
            System.out.println(year + " yılı artık yıldır...");
        }
        else
        {
            System.out.println(year + " yılı artık yıl değildir...");
        }
    }
}
