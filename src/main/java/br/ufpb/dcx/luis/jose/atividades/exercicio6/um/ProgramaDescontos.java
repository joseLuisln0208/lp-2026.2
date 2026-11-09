package br.ufpb.dcx.luis.jose.atividades.exercicio6.um;

import java.util.Scanner;

public class ProgramaDescontos {
    public static double calculaValorComDesconto(double valorProduto){
        if (valorProduto < 50){
            return (valorProduto);
        } else if (valorProduto < 100){
            return (valorProduto - (valorProduto * 0.05));
            // 5% de desconto se valor entre 50 e 100 (sem incluir 100)
        } else {
            return (valorProduto - (valorProduto * 0.10));
            // 10% de desconto
        }
    }

    public static double calculaSomatorioDescontos(Produto[] produtos)
    {
        double totalDesconto = 0.0;
        if (produtos != null)
        {
            for (Produto p : produtos)
            {
                if (p != null)
                {
                    double precoOriginal = p.getPreco();
                    double valorComDesconto = calculaValorComDesconto(precoOriginal);
                    totalDesconto += (precoOriginal - valorComDesconto);
                }
            }
        }
        return totalDesconto;
    }

    public static String verificaProdutoComMaiorDesconto(Produto[] produtos)
    {
        if (produtos == null || produtos.length == 0)
        {
            return "";
        }

        double maiorDesconto = -1.0;
        String nomeMaiorDesconto = "";

        for (Produto p : produtos)
        {
            if (p != null) {
                double desconto = p.getPreco() - calculaValorComDesconto(p.getPreco());
                if (desconto > maiorDesconto)
                {
                    maiorDesconto = desconto;
                    nomeMaiorDesconto = p.getNome();
                }
            }
        }

        return nomeMaiorDesconto;
    }

    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());

        Produto[] produtos = new Produto[quant];

        for (int k = 0; k < quant; k++)
        {
            Produto p = new Produto();

            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());

            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));

            double valorComDesconto = calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);

            produtos[k] = p;
        }

        double totalDesconto = calculaSomatorioDescontos(produtos);
        String produtoMaiorDesconto = verificaProdutoComMaiorDesconto(produtos);

        System.out.printf("Somatório dos descontos: R$ %.2f\n", totalDesconto);
        System.out.println("Produto com maior desconto: " + produtoMaiorDesconto);

        leitor.close();
    }
}
