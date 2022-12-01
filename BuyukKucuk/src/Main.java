import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayiA, sayiB, sayiC;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz : ");
        sayiA = input.nextInt();
        System.out.print("B sayısını giriniz : ");
        sayiB = input.nextInt();
        System.out.print("C sayısını giriniz : ");
        sayiC = input.nextInt();

        if(sayiA > sayiB)
        {
            if(sayiA > sayiC)
            {
                if(sayiB > sayiC)
                {
                    System.out.println("A > B > C");
                }
                else
                {
                    System.out.println("A > C > B");
                }
            }
            else
            {
                System.out.println("C > A > B");
            }
        }
        else if(sayiB > sayiC)
        {
            if(sayiA > sayiC)
            {
                System.out.println("B > A > C");
            }
            else
            {
                System.out.println("B > C > A");
            }
        }
        else
        {
            System.out.println("C > B > A");
        }


    }
}