package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1134
{
    public static void main(String[] args)
    {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        Scanner sc = new Scanner(System.in);
        int codigo = Integer.parseInt(sc.nextLine());

        while (codigo != 4)
        {
            if (codigo == 1)
            {
                alcool++;
            }
            else if (codigo == 2)
            {
                gasolina++;
            }
            else if (codigo == 3)
            {
                diesel++;
            }

            codigo = Integer.parseInt(sc.nextLine());
        }
        sc.close();

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}