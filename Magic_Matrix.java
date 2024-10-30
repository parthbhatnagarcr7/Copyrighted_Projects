import java.util.Scanner;
public class Magic_Matrix {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int i, j;
        System.out.println("In this Magic Matrix there are some rules to be followed make sure\n" +
                "the elements you enter in the rows and columns should have the same common\n" +
                "difference between them otherwise the matrix will no longer contains the magic.\n");

        Scanner sc = new Scanner(System.in);

        mat[0][0] = sc.nextInt();
        mat[0][1] = sc.nextInt();
        mat[0][2] = sc.nextInt();
        mat[1][0] = sc.nextInt();
        mat[1][1] = sc.nextInt();
        mat[1][2] = sc.nextInt();
        mat[2][0] = sc.nextInt();
        mat[2][1] = sc.nextInt();
        mat[2][2] = sc.nextInt();

        for (i =0; i<=2; i++){
            System.out.println();
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }

        System.out.println();
        if (mat[0][1]-mat[0][0] == mat[0][2]-mat[0][1] && mat[1][1]-mat[1][0] == mat[0][2]-mat[0][1] && mat[2][1]-mat[2][0] == mat[2][2]-mat[2][1]){
            System.out.println("the common difference between the columns are same");
        }
        else {
            System.out.println("the common difference between the columns are not same");
        }

        if (mat[1][0]-mat[0][0] == mat[2][0]-mat[1][0] && mat[1][1]-mat[0][1] == mat[2][1]-mat[1][1] && mat[1][2]-mat[0][2] == mat[2][2]-mat[1][2]){
            System.out.println("the common difference between the rows are same");
        }
        else {
            System.out.println("the common difference between the rows are not same");
        }
        System.out.println();

        System.out.println("Now if the common difference between the rows and columns are same\n" +
                "we can observe that 9 X middle element which is in this case is equal to the\n" +
                "sum of all the individual elements present in the matrix.");

        System.out.print("9 X "+ mat[1][1]+" = ");
        System.out.println(9*mat[1][1]);
        System.out.println("which is equal to ");
        System.out.print(mat[0][0]);
        System.out.print("+");
        System.out.print(mat[0][1]);
        System.out.print("+");
        System.out.print(mat[0][2]);
        System.out.print("+");
        System.out.print(mat[1][0]);
        System.out.print("+");
        System.out.print(mat[1][1]);
        System.out.print("+");
        System.out.print(mat[1][2]);
        System.out.print("+");
        System.out.print(mat[2][0]);
        System.out.print("+");
        System.out.print(mat[2][1]);
        System.out.print("+");
        System.out.print(mat[2][2]);
        System.out.print("=");
        System.out.print(mat[0][0] + mat[0][1] + mat[0][2] + mat[1][0] + mat[1][1] + mat[1][2] + mat[2][0] + mat[2][1] + mat[2][2]);

        System.out.println("\nif the result does not match it means the elements you have entered in the\n" +
                "rows and columns does not have the same common difference.");
    }
}
