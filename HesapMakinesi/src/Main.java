import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, select;
        System.out.print("İlk Sayıyı giriniz    : ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();
        System.out.print("İşlem seçiniz :\t-\tToplama için : 1\t-\tÇıkarma için : 2\t-\tÇarpma için : 3\t-\tBölme için : 4\n");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama : "+(number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma : " + (number1 * number2));
                break;
            case 4:
                switch (number2){
                    case 0:
                        System.out.println("Bölen 0 olamaz...");
                        break;
                    default:
                        System.out.println("Bölme : "+(number1/number2));
                        break;
                }
                break;
        }
    }
}
