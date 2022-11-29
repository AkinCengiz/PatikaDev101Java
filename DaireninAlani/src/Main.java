import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double yaricap, cevre, alan;
        System.out.print("Dairenin yarıçapı : ");
        yaricap = input.nextDouble();
        cevre = 2 * Math.PI * yaricap;
        alan = Math.PI * Math.pow(yaricap,2);

        System.out.println("Yarıçapı " + yaricap + " olan dairenin\nÇevresi : " + cevre);
        System.out.println("Alanı : " + alan);
    }
}
