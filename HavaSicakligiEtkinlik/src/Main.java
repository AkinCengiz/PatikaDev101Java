import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığı : ");
        byte sicaklik = input.nextByte();

        if(sicaklik < 5){
            System.out.println("Kayak yapmak için oldukça elverişli bir hava...");
        }
        else if(sicaklik>=5 && sicaklik<=20)
        {
            if(sicaklik < 15)
            {
                System.out.println("Balık tutmaya gidebilirsin...");
            }
            if(sicaklik>10){
                System.out.println("Sinemaya gidebilirsin...");
            }
        }else {
            if(sicaklik>25)
                System.out.println("Yüzmeye gidebilirsin...");
            System.out.println("Pikniğe gidebilirsin...");
        }
    }
}