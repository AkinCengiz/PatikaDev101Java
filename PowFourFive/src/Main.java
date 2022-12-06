import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number, fourPow=0, fivePow=0;
        System.out.print("Kaçıncı Kuvveti Hesaplama İstiyorsunuz : ");
        number = input.nextInt();
        for (int i = 0; i<=number; i++)
        {
            if(i==0)
            {
                fourPow = 1;
                fivePow = 1;
                System.out.print("4 ün "+ i + " kuvveti : "+fourPow+"\n");
                System.out.print("5 in "+ i + " kuvveti : "+fivePow+"\n");
                System.out.println("======================================");
                continue;
            }
            fourPow *= 4;
            fivePow *= 5;
            System.out.print("4 ün "+ i + " kuvveti : "+fourPow+"\n");
            System.out.print("5 in "+ i + " kuvveti : "+fivePow+"\n");
            System.out.println("======================================");
        }
    }
}
