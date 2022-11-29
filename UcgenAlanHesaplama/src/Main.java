import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int aKenar, bKenar, cKenar;
        double alan, cevre, u;

        System.out.print("a Kenar Uzunluğu : ");
        aKenar = input.nextInt();
        System.out.print("b Kenar Uzunluğu : ");
        bKenar = input.nextInt();
        System.out.print("c Kenar Uzunluğu : ");
        cKenar = input.nextInt();

        cevre = aKenar + bKenar + cKenar;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - aKenar) * (u - bKenar) * (u - cKenar) );

        System.out.println("Kenar uzunlukları girilen üçgenin\nAlanı : " + alan);
        System.out.println("Çevresi : " + cevre);
    }
}
