import java.lang.Math;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double aci,yaricap, alan;
        System.out.print("Yarıçap : ");
        yaricap = input.nextDouble();
        System.out.print("Açı ölçüsü : ");
        aci = input.nextDouble();
        alan = (Math.PI * Math.pow(yaricap,2) * aci) / 360;

        System.out.println("Yarıçapı : " + yaricap + "\nMerkez açı ölçüsü : "+aci+" olan daire diliminin\nAlanı : " + alan + "birimkaredir");
    }
}
