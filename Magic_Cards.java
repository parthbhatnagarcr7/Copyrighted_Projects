import java.util.Scanner;
public class Magic_Cards {
    public static void main(String[] args) {
        int[][] mat = new int[5][3];
        int i,j;
        int c = 0;
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number between 1 to 30 and don't tell anyone");

        System.out.println("Card 1");
        mat[0][0] = 1;
        mat[0][1] = 3;
        mat[0][2] = 5;
        mat[1][0] = 7;
        mat[1][1] = 9;
        mat[1][2] = 11;
        mat[2][0] = 13;
        mat[2][1] = 15;
        mat[2][2] = 17;
        mat[3][0] = 19;
        mat[3][1] = 21;
        mat[3][2] = 23;
        mat[4][0] = 25;
        mat[4][1] = 27;
        mat[4][2] = 29;
        for (i =0; i<=4; i++){
            System.out.println();
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }
        System.out.println("\nThe number you selected is there in Card 1 or not\n" +
                "please give the answer in 1 or 0 (1 is true and 0 is false)");

        int a = sc.nextInt();
        if (a==1){
             c = c+1;
        }

        System.out.println("OK");
        System.out.println("Card 2");
        mat[0][0] = 2;
        mat[0][1] = 3;
        mat[0][2] = 6;
        mat[1][0] = 7;
        mat[1][1] = 10;
        mat[1][2] = 11;
        mat[2][0] = 14;
        mat[2][1] = 15;
        mat[2][2] = 18;
        mat[3][0] = 19;
        mat[3][1] = 22;
        mat[3][2] = 23;
        mat[4][0] = 26;
        mat[4][1] = 27;
        mat[4][2] = 30;
        for (i =0; i<=4; i++){
            System.out.println();
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }
        System.out.println("\nThe number you selected is there in Card 1 or not\n" +
                "please give the answer in 1 or 0 (1 is true and 0 is false)");

        int b = sc.nextInt();
        if (b==1){
             c = c +2;
        }

        System.out.println("OK");
        System.out.println("Card 3");
        mat[0][0] = 4;
        mat[0][1] = 5;
        mat[0][2] = 6;
        mat[1][0] = 7;
        mat[1][1] = 12;
        mat[1][2] = 13;
        mat[2][0] = 14;
        mat[2][1] = 15;
        mat[2][2] = 20;
        mat[3][0] = 21;
        mat[3][1] = 22;
        mat[3][2] = 23;
        mat[4][0] = 28;
        mat[4][1] = 29;
        mat[4][2] = 30;
        for (i =0; i<=4; i++){
            System.out.println();
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }
        System.out.println("\nThe number you selected is there in Card 1 or not\n" +
                "please give the answer in 1 or 0 (1 is true and 0 is false)");

        int d = sc.nextInt();
        if (d==1){
            c = c +4;
        }

        System.out.println("OK");
        System.out.println("Card 4");
        mat[0][0] = 8;
        mat[0][1] = 9;
        mat[0][2] = 10;
        mat[1][0] = 11;
        mat[1][1] = 12;
        mat[1][2] = 13;
        mat[2][0] = 14;
        mat[2][1] = 15;
        mat[2][2] = 24;
        mat[3][0] = 25;
        mat[3][1] = 26;
        mat[3][2] = 27;
        mat[4][0] = 28;
        mat[4][1] = 29;
        mat[4][2] = 30;
        for (i =0; i<=4; i++){
            System.out.println();
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }
        System.out.println("\nThe number you selected is there in Card 1 or not\n" +
                "please give the answer in 1 or 0 (1 is true and 0 is false)");

        int e = sc.nextInt();
        if (e==1){
            c = c +8;
        }

        System.out.println("OK");
        System.out.println("Card 5");
        mat[0][0] = 16;
        mat[0][1] = 17;
        mat[0][2] = 18;
        mat[1][0] = 19;
        mat[1][1] = 20;
        mat[1][2] = 21;
        mat[2][0] = 22;
        mat[2][1] = 23;
        mat[2][2] = 24;
        mat[3][0] = 25;
        mat[3][1] = 26;
        mat[3][2] = 27;
        mat[4][0] = 28;
        mat[4][1] = 29;
        mat[4][2] = 30;
        for (i =0; i<=4; i++){
            System.out.println();
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
        }
        System.out.println("\nThe number you selected is there in Card 1 or not\n" +
                "please give the answer in 1 or 0 (1 is true and 0 is false)");

        int f = sc.nextInt();
        if (f==1){
            c = c +16;
        }

        System.out.println("Your chosen Number is");
        System.out.println(c);

    }
}
