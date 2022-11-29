import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int aKenar, bKenar;
        double hipotenus;
        System.out.print("A kenar ölçüsü : ");
        aKenar = input.nextInt();
        System.out.print("b Kenar Ölçüsü : ");
        bKenar = input.nextInt();
        hipotenus = Math.sqrt(aKenar * aKenar + bKenar * bKenar);
        System.out.println("Hipotenüs : " + hipotenus);

    }
}
