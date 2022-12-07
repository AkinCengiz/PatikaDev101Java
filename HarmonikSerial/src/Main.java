import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak harmonik serinin boyutunu giriniz : ");
        int number = input.nextInt();
        double harmonik=0.0;
        for (int i = 1; i<=number;i++)
        {
            harmonik += 1.0 / i;
            System.out.print("1/"+i+" + ");
        }
        System.out.print("\n"+number +" elemanlı serinin harmonik ortalaması : "+harmonik);
    }
}
