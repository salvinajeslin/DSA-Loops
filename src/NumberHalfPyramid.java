import java.util.Scanner;
public class NumberHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num for right Triangle");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Enter num for left Triangle");
        int n2 = sc.nextInt();
        for(int i=1;i<=n2;i++) {
            for (int j = i; j <= n2; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
