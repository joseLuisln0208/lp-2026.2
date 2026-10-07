package br.ufpb.dcx.luis.jose.atividades;
import java.lang.Math;
import java.util.Scanner;

public class Adivinha
{
    public static int sorteiaNumeroInteiro(int maximo)
    {
        return (int) (Math.random() * (maximo + 1));
    }

    public static void main(String[] args)
    {
        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;

        Scanner leitor = new Scanner(System.in);
        int tentativas = 0;
        while(!acertou)
        {
            System.out.println("Tente adivinhar y [0-100]:");


            int numLido = Integer.parseInt(leitor.nextLine());

            tentativas++;
            if (numLido ==y)
            {
                System.out.printf("Parabéns! Você acertou. Número de tentativas:%d%nQuantidadeDePontos:%d%n", tentativas, pontos);
                acertou = true;
            }
            else
            {
                pontos -= 2;

                System.out.println("Errou! Tente novamente");

                if(numLido > y)
                {
                    System.out.println("O número é menor!");
                }
                else
                {
                    System.out.println("O número é maior!");
                }
            }
        }
        leitor.close();
    }
}