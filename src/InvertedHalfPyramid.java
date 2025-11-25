import java.util.Scanner;
public class InvertedHalfPyramid
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Right inverted Half Pyramid : ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            for(int j=i;j<n1;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Enter left inverted Half Pyramid : ");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            for(int j=i;j<n2;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
