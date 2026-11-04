package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Banda
{
    public String nomeDaBanda;
    public String dataDeEstreia;
    public Membro[] membrosDaBanda;
    public Album[] albuns;

    public Banda(String nomeDaBanda, String dataDeEstreia, Membro[] membrosDaBanda, Album[] albuns)
    {
        this.nomeDaBanda = nomeDaBanda;
        this.membrosDaBanda = membrosDaBanda;
        this.dataDeEstreia = dataDeEstreia;
        this.albuns = albuns;
    }
    public Banda()
    {
        this("null", "DD/MM/AAAA", new Membro[0], new Album[0]);
    }
}
