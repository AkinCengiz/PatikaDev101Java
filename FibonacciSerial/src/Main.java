import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci serisi yazılmasını istersiniz : ");
        int size = input.nextInt();
        int temp = 0,preNumber=0, sufNumber=0;

        for( int i = 0; i < size; i++)
        {
            if(i==0)
            {
                System.out.print(i+" ");
                preNumber = i;
                continue;
            }
            if(i == 1)
            {
                sufNumber = i + preNumber;
                System.out.print(i+" ");
                continue;
            }
            temp = sufNumber;
            sufNumber += preNumber;
            preNumber = temp;
            System.out.print(sufNumber+" ");
        }
    }
}