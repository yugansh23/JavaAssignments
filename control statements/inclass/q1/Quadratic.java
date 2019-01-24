import java.util.Scanner;
public class Quadratic {

    public static void main(String[] args) {

        double a , b, c;
        double root1, root2;
        System.out.println("enter 3 numbers ");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        b=s1.nextInt();
        c=s1.nextInt();

        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}