package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Banda
{
    public String nomeDaBanda;
    public Membro[] membrosDaBanda;
    public String dataDeEstreia;

    public Banda(String nomeDaBanda, Membro[] membrosDaBanda, String dataDeEstreia)
    {
        this.nomeDaBanda = nomeDaBanda;
        this.membrosDaBanda = membrosDaBanda;
        this.dataDeEstreia = dataDeEstreia;
    }
    public Banda()
    {
        this("null", new Membro[0], "DD/MM/AAAA");
    }
}
