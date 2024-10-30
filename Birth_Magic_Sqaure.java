import java.util.Scanner;
public class Birth_Magic_Sqaure {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int i,j;
        System.out.println();
        System.out.println("Enter Your Birth Date in the format DD/MM/CC/YY\n");
        System.out.println(" DD = Date of Birth\n MM = Month of Birth\n CC = Century of Birth\n YY = Year of Birth\n");

        Scanner sc = new Scanner(System.in);
        int DD = sc.nextInt();
        int MM = sc.nextInt();
        int CC = sc.nextInt();
        int YY = sc.nextInt();

        mat[0][0] = DD;
        mat[0][1] = MM;
        mat[0][2] = CC;
        mat[0][3] = YY;
        mat[1][0] = YY+1;
        mat[1][1] = CC-1;
        mat[1][2] = MM-3;
        mat[1][3] = DD+3;
        mat[2][0] = MM-2;
        mat[2][1] = DD+2;
        mat[2][2] = YY+2;
        mat[2][3] = CC-2;
        mat[3][0] = CC+1;
        mat[3][1] = YY-1;
        mat[3][2] = DD+1;
        mat[3][3] = MM-1;

        System.out.println("Your Birthday Magic Square Is : ");
        for (i =0; i<=3; i++){
            System.out.println();
            for (j=0; j<=3; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }
    }

}
