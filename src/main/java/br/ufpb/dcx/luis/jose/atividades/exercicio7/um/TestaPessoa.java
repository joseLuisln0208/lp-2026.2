package br.ufpb.dcx.luis.jose.atividades.exercicio7.um;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa
{
    public static void main(String[] args)
    {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int quant = 0;
        Scanner leitor = new Scanner(System.in);
        while(quant < 5)
        {
            System.out.println("Qual o nome? do " + (quant + 1));
            String nome = leitor.nextLine();

            System.out.println("Qual a idade? do " + (quant + 1));
            int idade = Integer.parseInt(leitor.nextLine());
            pessoas.add(new Pessoa(nome, idade));
            quant++;
        }
        quant = 0;
        while(quant < 5)
        {
            System.out.print(pessoas.get(quant).getNome());
            if(pessoas.get(quant).ehDeMaior())
            {
                System.out.printf(" é de maior%n");
            }
            else
            {
                System.out.printf(" é de menor%n");
            }
            quant++;
        }

        leitor.close();
    }
}
