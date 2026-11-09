package br.ufpb.dcx.luis.jose.atividades.exercicio6.dois;
import java.util.Scanner;

public class GastoAlmocoRU
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade N de refeições do tipo ALMOÇO:");
        int n = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o preço de cada refeição do tipo ALMOÇO:");
        double precoRefeicao = Double.parseDouble(leitor.nextLine());

        double totalGasto = n * precoRefeicao;

        System.out.printf("Valor total gasto pelo RU com almoços: R$ %.2f\n", totalGasto);

        leitor.close();
    }
}