package br.ufpb.dcx.luis.jose.atividades.exercicio5;
import java.util.Scanner;

public class contaMenor
{
    public static void main(String[] args)
    {
        int[] numerosContagem = new int[5];
        int menor = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            numerosContagem[i] = Integer.parseInt(sc.nextLine());
            if(menor < numerosContagem[i])
            {
                menor = numerosContagem[i];
            }
        }
        sc.close();

        for(int i = 0; i < 5; i++)
        {
            if(menor > numerosContagem[i])
            {
                menor = numerosContagem[i];
            }
        }
        System.out.println(menor);
    }
}
