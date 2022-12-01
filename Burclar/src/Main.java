import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte day, mount;
        System.out.print("Kaçıncı ayda doğdunuz : ");
        mount = input.nextByte();
        System.out.print("Ayın kaçıncı günü doğdunuz : ");
        day = input.nextByte();
        if((mount == 12 && (day >21 && day <= 31)) || (mount==1 && (day > 0 && day <=21)))
        {
            System.out.println("Oğlak Burcu");
        }
        else if((mount == 1 && (day >21 && day <= 31)) || (mount==2 && (day > 0 && day <=19)))
        {
            System.out.println("Kova Burcu");
        }
        else if((mount == 2 && (day >19 && day <= 29)) || (mount==3 && (day > 0 && day <=20)))
        {
            System.out.println("Balık Burcu");
        }
        else if((mount == 3 && (day >20 && day <= 31)) || (mount==4 && (day > 0 && day <=20)))
        {
            System.out.println("Koç Burcu");
        }
        else if((mount == 4 && (day >20 && day <= 30)) || (mount==5 && (day > 0 && day <=21)))
        {
            System.out.println("Boğa Burcu");
        }
        else if((mount == 5 && (day >21 && day <= 31)) || (mount==6 && (day > 0 && day <=22)))
        {
            System.out.println("İkizler Burcu");
        }
        else if((mount == 6 && (day >22 && day <= 30)) || (mount==7 && (day > 0 && day <=22)))
        {
            System.out.println("Yengeç Burcu");
        }
        else if((mount == 7 && (day >22 && day <= 31)) || (mount==8 && (day > 0 && day <=22)))
        {
            System.out.println("Aslan Burcu");
        }
        else if((mount == 8 && (day >22 && day <= 31)) || (mount==9 && (day > 0 && day <=22)))
        {
            System.out.println("Başak Burcu");
        }
        else if((mount == 9 && (day >22 && day <= 30)) || (mount==10 && (day > 0 && day <=22)))
        {
            System.out.println("Terazi Burcu");
        }
        else if((mount == 10 && (day >22 && day <= 31)) || (mount==11 && (day > 0 && day <=21)))
        {
            System.out.println("Akrep Burcu");
        }
        else if((mount == 11 && (day >21 && day <= 30)) || (mount==12 && (day > 0 && day <=21)))
        {
            System.out.println("Yay Burcu");
        }
        else
        {
            System.out.println("Hatalı gün ve ay bilgisi girdiniz...");
        }
    }
}