package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1165
{
    public static boolean ehPrimo(int x)
    {
        if (x < 2)
        {
            return false;
        }
        if (x == 2)
        {
            return true;
        }
        if (x % 2 == 0)
        {
            return false;
        }

        for (int i = 3; i * i <= x; i += 2)
        {
            if (x % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int k = 0; k < n; k++)
        {
            int x = Integer.parseInt(sc.nextLine());

            if (ehPrimo(x))
            {
                System.out.println(x + " eh primo");
            }
            else
            {
                System.out.println(x + " nao eh primo");
            }
        }

        sc.close();
    }
}