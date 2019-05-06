import java.util.Scanner;

public class Home {
    public static void main(String[] args){
        int e = 100;
        int f = 200;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну первого дома");
        int a = in.nextInt();
        System.out.println("Введите ширину первого дома");
        int b = in.nextInt();
        System.out.println("Введите длинну ворого дома");
        int c = in.nextInt();
        System.out.println("Введите ширину ворого дома");
        int d = in.nextInt();


        if (e*f >= a*b + c*d)
            System.out.println("Домв помещаются");
        else
            System.out.println("Дома не помещаются");



    }
}