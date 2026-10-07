package br.ufpb.dcx.luis.jose.atividades.beecrowd;
import java.util.Scanner;

public class BC1009
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        sc.close();

        double totalAReceber = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalAReceber);
    }
}
