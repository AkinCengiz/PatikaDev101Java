import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number, counter = 0, total = 0;
        boolean isEven = true;
        double average = 0;
        while(isEven)
        {
            System.out.print("Çift sayı giriniz : ");
            number = input.nextInt();
            if(number%2==1)
            {
                isEven= false;
            }
            if(number % 4 == 0)
            {
                counter++;
                total+=number;
            }
        }
        if(counter > 0)
        {
            average = total / counter;
        }
        System.out.print("Dörde tam bölünen sayıların toplamı : "+total);
        System.out.print("\nDörde tam bölünen sayıların adedi : "+counter);
        System.out.print("\nDörde tam bölünen sayıların ortalaması : "+ average);
    }
}
