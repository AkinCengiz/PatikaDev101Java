import javax.swing.text.html.StyleSheet;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int matematik, fizik, kimya, turkce, tarih, muzik, toplam = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz : ");
        matematik = input.nextInt();
        toplam += matematik;
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        toplam += fizik;
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        toplam += kimya;
        System.out.print("Türkçe notunu giriniz :");
        turkce = input.nextInt();
        toplam += turkce;
        System.out.print("Tarih notunu giriniz : ");
        tarih = input.nextInt();
        toplam += tarih;
        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextInt();
        toplam += muzik;
        ortalama = toplam / 6;
        System.out.println("Ortalamanız : " + ortalama);
        String sonuc = ortalama >= 65 ? "Geçtiniz..." : "Kaldınız...";
        System.out.println(sonuc);
    }
}
