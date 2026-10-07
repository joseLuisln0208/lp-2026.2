package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1001
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a + b;
        System.out.println(x);
        scanner.close();
    }
}
