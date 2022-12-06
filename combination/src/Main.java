import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int n,r,result,pay=1,payda=1;

        System.out.print("Kaç elemanlı küme üzerinde işlem yapacaksınız : ");
        n = input.nextInt();
        System.out.print("Kaç elemanlı alt kümelerini hesaplamak istiyorsunuz : ");
        r = input.nextInt();
        for(int i = n; i>=1; i--)
        {
            pay *= i;
        }
        for(int i = r; i>=1;i--)
        {
            payda *= i;
        }
        for (int i = n-r;i>=1;i--)
        {
            payda *= i;
        }
        result = pay/payda;

        System.out.println(n+" elemanlı bir kümenin "+r+" elemanlı alt kümelerinin sayısı : "+result);
    }
}
