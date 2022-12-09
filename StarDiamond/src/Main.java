import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Şeklin merkez uzunluğu : ");
        int lenghtOrigin = input.nextInt();
        int arrayLenght;
        if(lenghtOrigin %2 == 0)
        {
            arrayLenght = lenghtOrigin+1;
        }
        else
        {
            arrayLenght = lenghtOrigin;
        }
        int yaricap = lenghtOrigin/2;
        int[][] diamond = new int[arrayLenght][arrayLenght];
        for(int i = 0; i< arrayLenght; i++) {
            for (int j = 0; j < arrayLenght; j++) {
                if (i == yaricap || j == yaricap) {
                    diamond[i][j] = 1;
                }
                if (i + j == yaricap) {
                    diamond[i][j] = 1;
                }
                if( (i< yaricap && j < yaricap) & i + j > yaricap)
                {
                    diamond[i][j] = 1;
                }
                if( (i> yaricap && j > yaricap))
                {
                    if(i - j < yaricap && i+j <= yaricap * 3)
                    {
                        diamond[i][j] = 1;
                    }
                }
                if(i<yaricap && j > yaricap)
                {
                    if(j-i <= yaricap)
                    {
                        diamond[i][j] = 1;
                    }
                }
                if(i>yaricap && j < yaricap)
                {
                    if(i-j <= yaricap)
                    {
                        diamond[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < arrayLenght; i++)
        {
            for (int j = 0; j < arrayLenght; j++)
            {
                if(diamond[i][j]==1)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
