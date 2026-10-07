package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1074
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.close();

        for (int i = 0; i < n; i++)
        {
            int x = sc.nextInt();

            if (x == 0)
            {
                System.out.println("NULL");
            }
            else
            {
                if (x % 2 == 0)
                {
                    if (x > 0)
                    {
                        System.out.println("EVEN POSITIVE");
                    }
                    else
                    {
                        System.out.println("EVEN NEGATIVE");
                    }
                }
                else
                {
                    if (x > 0)
                    {
                        System.out.println("ODD POSITIVE");
                    }
                    else
                    {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }
    }
}