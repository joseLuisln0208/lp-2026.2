package br.ufpb.dcx.luis.jose.appDeMusicas;
import java.util.Scanner;

public class AplicativoDeMusicas
{
    public static int quantasMusicas;

    public static void main(String[] args)
    {
        boolean whileFicar = true;
        Scanner leitor = new Scanner(System.in);
        while(whileFicar)
        {
            print("%nO que deseja fazer agora?%n1 - Criar%n2 - pesquisar%n3 - salvar%n4 - sair%n");
            int resposta = Integer.parseInt(leitor.nextLine());
            if(resposta == 1)
            {
                criar(leitor);
            }
            else if(resposta == 2)
            {

            }
            else if(resposta == 3)
            {

            }
            else if(resposta == 4)
            {

            }
            else
            {
                print("%nEssa não é uma resposta válida%n");
            }
        }
        leitor.close();
    }

    //Todos os métodos usados pra criar algo novo
    public static void criar(Scanner leitor)
    {
        print("%nO que você quer criar?%n1 - Banda%n2 - Album%n3 - musica%n4 - sair%n");
        char nome = leitor.nextLine().charAt(0);
        if(nome == '1')
        {

        }
        else if(nome == '2')
        {

        }
        else if(nome == '3')
        {

        }
        else if(nome == '4')
        {
            return;
        }
        else
        {
            print("%nEssa não é uma resposta válida%n");
            return;
        }
    }
    public static void print(String texto)
    {
        System.out.printf(texto);
    }
}
