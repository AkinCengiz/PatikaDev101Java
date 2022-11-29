import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String[] meyveSebze = new String[5];
        meyveSebze[0] = "Armut";
        meyveSebze[1] = "Elma";
        meyveSebze[2] = "Domates";
        meyveSebze[3] = "Muz";
        meyveSebze[4] = "Patlıcan";

        double[][] alisverisListesi = new double[5][2];
        double tutar = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j< 2; j++)
            {
                String mesaj = j==0 ? " Birim fiyatı giriniz : " : " Kilogram miktarını giriniz : ";
                System.out.print(meyveSebze[i] + mesaj);
                alisverisListesi[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < 5; i++)
        {
            double birimTutar = 1;
            for (int j = 0; j< 2; j++)
            {
                birimTutar *= alisverisListesi[i][j];
            }
            tutar += birimTutar;
        }
        for (int i = 0; i < 5; i++)
        {
            String etiket=meyveSebze[i]+" - Birim fiyatı : ";
            for (int j = 0; j< 2; j++)
            {
                if(j==0) {
                    etiket += alisverisListesi[i][j] + " TL Miktarı : ";
                }else
                {
                    etiket += alisverisListesi[i][j] + " kg\n";
                }
            }
            System.out.print(etiket);

        }
        System.out.print("Ödenecek tutar : "+tutar);


    }
}
