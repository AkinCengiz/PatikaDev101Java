import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgen kaç basamaklı olsun : ");
        int step = input.nextInt();
        int[][] triangle = new int[step][step*2+1];
        for(int i = 0; i < step; i++)
        {
            for(int j = 0; j < step*2-1; j++)
            {
                if(i == 0)
                {
                    triangle[i][j] = 1;
                }
                if(i == j)
                {
                    triangle[i][j] = 1;
                }
                if(j == step-1)
                {
                    triangle[i][j] = 1;
                }
                if((i <= step - 1 && j > step - 1) && (j + i > step - 1 && j + i <= (step - 1) * 2))
                {
                    triangle[i][j] = 1;
                }
                if((j >= i && j < step - 1)&&(j - i >0 && j - i < step - 1))
                {
                    triangle[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < step; i++)
        {
            for(int j = 0; j < step*2-1; j++)
            {
                if(triangle[i][j]== 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}