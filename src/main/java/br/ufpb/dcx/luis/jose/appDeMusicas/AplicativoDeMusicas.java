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
        }
    }

    public static Album criadorDeAlbum()
    {
        String nomeDoAlbum = "";
        String dataDeLancamento = "";
        Banda banda = new Banda();

        for(int i = 0; i < quantasMusicas; i++)
        {
        }

        return new Album(nomeDoAlbum, dataDeLancamento, banda);
    }
    public static Banda criadorDeBanda()
    {
        return new Banda();
    }
    public static Membro[] criadorDeArrayDeMembro()
    {
        return new Membro[1];
    }
}
