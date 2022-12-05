import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int km;
        byte yas, yolculukTipi;
        double normalTutar, gidisDonusIndirim = 0.2, tutar, indirimMiktari=0;

        while (true)
        {
            System.out.print("Mesafeyi km türünden giriniz : ");
            km = input.nextInt();
            if(km<0)
            {
                System.out.print("Hatalı veri girişi yaptınız...\n");
                continue;
            }
            System.out.print("Yaşınızı giriniz : ");
            yas = input.nextByte();
            if(yas<0)
            {
                System.out.print("Hatalı veri girişi yaptınız...\n");
                continue;
            }
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön - 2 => Gidiş - Dönüş) : ");
            yolculukTipi = input.nextByte();
            if(yolculukTipi < 1 || yolculukTipi > 2)
            {
                System.out.print("Hatalı veri girişi yaptınız...\n");
                continue;
            }
            break;
        }
        normalTutar = km * 0.1;
        if(yas<12)
        {
            indirimMiktari = normalTutar*0.5;
            normalTutar -= indirimMiktari;
        }
        else if(yas >= 12 && yas <=24)
        {
            indirimMiktari = normalTutar * 0.1;
            normalTutar -= indirimMiktari;
        }
        else if(yas>65)
        {
            indirimMiktari = normalTutar*0.3;
            normalTutar -= indirimMiktari;
        }
        else
        {
            indirimMiktari = normalTutar*0;
            normalTutar -= indirimMiktari;
        }

        if(yolculukTipi == 2)
        {
            tutar = (normalTutar - (normalTutar * 0.2)) * 2;
        }
        else
        {
            tutar = normalTutar;
        }
        System.out.println("Tutar : "+tutar + " TL");
    }
}
