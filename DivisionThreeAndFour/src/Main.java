import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int number, total=0, counter=0;
        double average;
        System.out.print("Kaça kadar olan sayılar denetlenecek : ");
        number = input.nextInt();
        for(int i = 1; i<= number;i++)
        {
            if(i%3==0 && i%4==0)
            {
                counter++;
                total+=i;
            }
        }
        average = total / counter;
        System.out.println("3 ile 4 e tam bölünen sayıların toplamı : "+total);
        System.out.println("3 ile 4 e tam bölünen sayıların adedi : "+counter);
        System.out.println("3 ile 4 e tam bölünen sayıların ortalaması : " + average);
    }
}
