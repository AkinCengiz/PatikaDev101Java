import java.util.Scanner;
public class Main {
    public static boolean kontrolEt(int number)
    {
        if (number < 0 || number > 100)
        {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenNot, toplam=0;
        boolean kontrol;
        float ortalama;
        String[] dersler = {"Matematik","Fizik","Kimya","Tarih","Türkçe"};
        for (int i = 0; i<dersler.length;i++)
        {
            System.out.print(dersler[i]+ " notunu giriniz : ");
            girilenNot = input.nextInt();
            kontrol = kontrolEt(girilenNot);

            while (kontrol)
            {
                System.out.print("Yanlış değer girdiniz, tekrar deneyin : ");
                girilenNot = input.nextInt();
                kontrol=kontrolEt(girilenNot);
            }
            toplam += girilenNot;
            System.out.println(dersler[i]+" "+girilenNot);
        }
        ortalama = toplam / dersler.length;
        String sonuc = ortalama > 65 ? "Tebrikler. Sınıfı geçtiniz...":"Daha çok çalışmalısınız. Sınıfta kaldınız...";
        System.out.println("Ortalamanız : "+ortalama+" "+sonuc);

    }
}