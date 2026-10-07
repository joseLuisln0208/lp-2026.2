package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1151
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int anterior = 0;
        int atual = 1;

        for (int i = 0; i < n; i++)
        {
            if (i == n - 1)
            {
                System.out.println(anterior);
            }
            else
            {
                System.out.print(anterior + " ");
            }

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        sc.close();
    }
}