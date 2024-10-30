import java.util.Scanner;
public class Magic_Triangle {
    public static void main(String[] args) {


        int A,B,C,D,E,F;

        System.out.println();
        System.out.println("Magic Triangle");
        System.out.println("                       A\n");
        System.out.println("                   B       F\n");
        System.out.print("                C");
        System.out.print("      D");
        System.out.println("       E");
        System.out.println("\nEnter the Values of A,B,C,D,E and F such that the perimeter of each side should be equal.");


        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        E = sc.nextInt();
        F = sc.nextInt();

        int x = A+B+C;

        if (A+B+C==C+D+E && C+D+E==E+F+A){
            System.out.println("The Magic Triangle Obtained is having each perimeter equal to\t"+x);

            System.out.println("\n the Generated Magic Triangle is: ");
            System.out.println("\t\t\t\t\t"+A+"\n");
            System.out.println("\t\t\t\t"+B+"\t\t"+F+"\n");
            System.out.print("\t\t\t"+C);
            System.out.print("\t\t"+D);
            System.out.println("\t\t"+E);
        }
        else {
            System.out.println("The Perimeter of the sides are not equal, Hence the Magic Triangle wont be obtained");
            System.out.println("\n the Generated Magic Triangle is: ");
            System.out.println("\t\t\t\t\t"+A+"\n");
            System.out.println("\t\t\t\t"+B+"\t\t"+F+"\n");
            System.out.print("\t\t\t"+C);
            System.out.print("\t\t"+D);
            System.out.println("\t\t"+E);

        }
    }
}
