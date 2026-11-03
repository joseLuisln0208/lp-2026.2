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
            System.out.printf("%nO que deseja fazer agora?%n1 - Criar%n2 - pesquisar%n3 - salvar%n4 - sair%n");
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
                System.out.printf("%nEssa não é uma resposta válida%n");
            }
        }
        leitor.close();
    }

    public static void criar(Scanner leitor)
    {
        System.out.printf("%nO que você quer criar?%n1 - Banda%n2 - Album%n3 - musica%n4 - sair%n");
        String nome = leitor.nextLine();
        return;
    }

    public static Album criadorDeAlbum(Scanner leitor)
    {
        System.out.println("Insira o nome do Álbum:");
        String nomeDoAlbum = leitor.nextLine();

        System.out.println("Insira a data de lancamento do Álbum(DD/MM/AAAA):");
        String dataDeLancamento = leitor.nextLine();

        return new Album(nomeDoAlbum, dataDeLancamento, criadorDeBanda(leitor));
    }
    public static Banda criadorDeBanda(Scanner leitor)
    {
        System.out.println("Insira o nome da banda:");
        String nomeDaBanda = leitor.nextLine();

        System.out.println("Insira a data de estreia da Banda(DD/MM/AAAA):");
        String dataDeEstreiaDaBanda = leitor.nextLine();

        return new Banda(nomeDaBanda, dataDeEstreiaDaBanda, criadorDeArrayDeMembro(leitor));
    }
    public static Membro[] criadorDeArrayDeMembro(Scanner leitor)
    {
        System.out.println("Insira quantos membros tem a banda:");
        int quantMembrosDaBanda = Integer.parseInt(leitor.nextLine());

        Membro[] membros = new Membro[quantMembrosDaBanda];

        for(int i = 0; i < quantMembrosDaBanda; i++)
        {
            System.out.println("Insira o nome do membro" + (i + 1));
            String nomeDoMembro = leitor.nextLine();

            System.out.println("Insira o pais de nascimento do membro" + (i + 1));
            String paisDeNascimentoDoMembro = leitor.nextLine();

            System.out.println("Insira a data de nascimento do membro" + (i + 1) + "(DD/MM/AAAA):");
            String dataDeNascimento = leitor.nextLine();

            membros[i] = new Membro(nomeDoMembro, dataDeNascimento, paisDeNascimentoDoMembro);
        }

        return membros;
    }
}
