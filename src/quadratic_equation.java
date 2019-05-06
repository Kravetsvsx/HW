import java.util.Scanner;

public class quadratic_equation{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = in.nextFloat();
        System.out.println("Enter b:");
        float b = in.nextFloat();
        System.out.println("Enter c:");
        float c = in.nextFloat();
        double d=(b * b)-(4*a*c);
        float e;
        float f;
        if(d==0){
            e=-1*(b/(2*a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + e);
        }
        else {
            if(d>0){
                e=((-1*b)+(float)Math.sqrt(d))/(2 * a);
                f=((-1*b)-(float)Math.sqrt(d))/(2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + e + " и " + f);
            }
            else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}


