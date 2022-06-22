import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
         int a , b ;
         double c, u, x;

         Scanner girdi = new Scanner (System.in);
         System.out.print("1. Kenarı Giriniz : ");
         a = girdi.nextInt();
         System.out.print("2. Kenarı Giriniz : ");
         b = girdi.nextInt();

         c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " +c);

         u = ((a+b+c)/2);
         x = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin Alanı : " + x);
    }
}
