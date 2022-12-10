import java.util.Scanner;
public class Main {

    static void plus()
    {
        Scanner input = new Scanner(System.in);
        int number;
        int result = 0;
        for(int i = 1; true; i++)
        {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            if(number == 0)
            {
                break;
            }
            result += number;
        }
        System.out.println("Toplam : "+result);
    }
    static void subtraction()
    {
        Scanner input = new Scanner(System.in);
        int number, result = 0;
        for(int i = 1; true; i++)
        {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            if(number == 0)
            {
                break;
            }
            if(i==1)
            {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void multiply()
    {
        Scanner input = new Scanner(System.in);
        int number, result = 1;
        for(int i = 1; true; i++)
        {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            if(number==0)
            {
                result = 0;
                break;
            }
            if(number==1)
            {
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void divide()
    {
        Scanner input = new Scanner(System.in);
        int number;
        double result =0.0d;
        for(int i = 1; true; i++)
        {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            if(i==1)
            {
                result = (double) number;
                continue;
            }
            if(number == 0)
            {
                System.out.println("Bölen 0 olamaz. Farklı bir sayı giriniz...");
                continue;
            }
            if(number == 1)
            {
                break;
            }
            result /= number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void factorial()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyeli hesaplanacak sayıyı giriniz : ");
        int number = input.nextInt();
        int result=1;
        for(int i = 2; i<= number; i++)
        {
            result *= i;
        }
        System.out.println("Sonuç : "+result);

    }

    static void power()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayı giriniz : ");
        int baseNumber = input.nextInt();
        System.out.print("Üs sayı giriniz : ");
        int powNumber = input.nextInt();
        int result = 1;
        for(int i = 0; i < powNumber; i++)
        {
            if(powNumber == 0)
            {
                result = 1;
            }
            if(powNumber == 1)
            {
                result = baseNumber;
            }
            result *= baseNumber;
        }
        System.out.println(baseNumber + " sayısının "+ powNumber + ". kuvveti : "+ result);
    }
    static void mode()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Bölünecek sayıyı giriniz : ");
        int dividingNumber = input.nextInt();
        int divideNumber = 1;
        while (true)
        {

            System.out.print("Bölen sayıyı giriniz : ");
            divideNumber = input.nextInt();
            if(divideNumber <= dividingNumber)
            {
                break;
            }
        }

        int result = dividingNumber % divideNumber;
        System.out.println("Sonuç : "+result);
    }
    static void rectangleArea()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin eni : ");
        int width = input.nextInt();
        System.out.print("Dikdörtgenin yüksekliği : ");
        int height = input.nextInt();
        int area = height * width;
        int cevre = (height+width)*2;
        System.out.print("Eni : "+width+" Yüksekliği : "+height+" olan diktörtgenin\nAlanı\t: "+area+" birim kare\nÇevresi\t: "+cevre+" birimdir...\n");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7 :
                    mode();
                    break;
                case 8 :
                    rectangleArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}