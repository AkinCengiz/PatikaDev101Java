import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double acilisUcret = 10.0, birimUcret = 2.2, odenecekTutar, hesaplananUcret, gidilenKm;
        System.out.print("Kaç km yol gidildi : ");
        gidilenKm = input.nextDouble();
        hesaplananUcret = acilisUcret + gidilenKm * birimUcret;
        odenecekTutar = hesaplananUcret <= 20.0 ? 20.0 : hesaplananUcret;

        System.out.println("Açılış ücreti : " + acilisUcret + " TL");
        System.out.println("Gidilen yol : " + gidilenKm + " km");
        System.out.println("Hesaplanan ücret : " + hesaplananUcret + " TL");
        System.out.println("Ödenecek ücret : " + odenecekTutar + " TL");

    }
}
