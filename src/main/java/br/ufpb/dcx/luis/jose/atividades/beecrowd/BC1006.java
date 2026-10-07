package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1006
{
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       double a = Double.parseDouble(sc.nextLine());
       double b = Double.parseDouble(sc.nextLine());
       double c = Double.parseDouble(sc.nextLine());
       sc.close();

       double media = (a * 2 + b * 3 + c * 5) / 10;
       System.out.printf("MEDIA = %.2f%n", media);
    }
}
