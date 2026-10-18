package br.ufpb.dcx.luis.jose.appDeMusicas;
import java.util.Scanner;

public class AplicativoDeMusicas
{
    public static int quantasMusicas;

    public static void main(String[] args)
    {
        System.out.println("Informe quantas músicas");

        Scanner leitor = new Scanner(System.in);
        quantasMusicas = Integer.parseInt(leitor.nextLine());

        Faixa[] faixas = new Faixa[quantasMusicas];

        for(int i = 0; i < quantasMusicas; i++)
        {
            System.out.println("Insira o nome da FAIXA" + (i + 1) + ":");
            String nomeDaFaixa = leitor.nextLine();

            System.out.println("Insira quanto tempo tem a FAIXA" + (i + 1) + "(MM:SS):");
            String tempoDaFaixa = leitor.nextLine();

            faixas[i] = new Faixa(nomeDaFaixa, tempoDaFaixa, criadorDeAlbum(leitor));
        }
        while(true)
        {
            if(leitor.nextLine().equalsIgnoreCase("s"))
            {
                break;
            }
        }
        leitor.close();
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
