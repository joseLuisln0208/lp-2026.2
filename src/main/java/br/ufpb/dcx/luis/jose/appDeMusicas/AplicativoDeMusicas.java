package br.ufpb.dcx.luis.jose.appDeMusicas;
import java.util.Scanner;

public class AplicativoDeMusicas
{
    public static Banda[] bandas;

    public static void main(String[] args)
    {
        boolean whileFicar = true;
        Scanner leitor = new Scanner(System.in);
        while(whileFicar)
        {
            print("%nO que deseja fazer agora?%n1 - Criar%n2 - alterar%n3 - excluir%n4 - pesquisar%n5 - sair%n");
            char resposta = leitor.nextLine().charAt(0);
            if(resposta == '1')
            {
                criar(leitor);
            }
            else if(resposta == '2')
            {

            }
            else if(resposta == '3')
            {

            }
            else if(resposta == '4')
            {

            }
            else if(resposta == '5')
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
    public static Banda criarBanda(Scanner leitor)
    {
        int numQuantMembros;
        int numQuantAlbuns;
        String nomeDaBanda;
        String dataDeEstreiaDaBanda;
        Membro[] membrosDaBanda;
        Album[] albunsDaBanda;

        print("%nQual é o nome da banda?%n");
        nomeDaBanda = leitor.nextLine();
        print("%nQual é a data de estreia(DD/MM/AAAA)?%n");
        dataDeEstreiaDaBanda = leitor.nextLine();

        print("%nQuantos membros deseja adicionar?%n");
        numQuantMembros = Integer.parseInt(leitor.nextLine());
        membrosDaBanda = new Membro[numQuantMembros];
        if(numQuantMembros > 0)
        {
            for(int i = 0; i > numQuantMembros; i++)
            {
                membrosDaBanda[i] = criarMembro(leitor);
            }
        }

        print("%nQuantos albuns deseja adicionar?%n");
        numQuantAlbuns = Integer.parseInt(leitor.nextLine());
        albunsDaBanda = new Album[numQuantAlbuns];
        if(numQuantMembros > 0)
        {
            for(int i = 0; i > numQuantAlbuns; i++)
            {
                albunsDaBanda[i] = criarAlbum(leitor);
            }
        }

        return new Banda(nomeDaBanda, dataDeEstreiaDaBanda, membrosDaBanda, albunsDaBanda);
    }
    public static Membro criarMembro(Scanner leitor)
    {
        //TODO
        return new Membro();
    }
    public static Album criarAlbum(Scanner leitor)
    {
        //TODO
        return new Album();
    }

    public static void print(String texto)
    {
        System.out.printf(texto);
    }
}
