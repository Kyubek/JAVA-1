package prostokat;
import java.util.Scanner;

public class Prostokat {

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj a:");
        double a=odczyt.nextDouble();
        System.out.println("Podaj b:");
        double b=odczyt.nextDouble();
        Square sq = new Square(a,b);
        System.out.println(sq.pole());
        System.out.println(sq.obw());
    }

   
}
class Square {
        double a;
        double b;
       
     Square(double a,double b)
     {
         this.a=a;
         this.b=b;
     }
        double pole() {
            System.out.println("pole: ");
           return a*b;
        
        }

        double obw() {
            System.out.println("obw: ");
            return  2 * a + 2 * b;
        }
    }