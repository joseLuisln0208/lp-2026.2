package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Banda
{
    public String nomeDaBanda;
    public String dataDeEstreia;
    public Membro[] membrosDaBanda;

    public Banda(String nomeDaBanda, String dataDeEstreia, Membro[] membrosDaBanda)
    {
        this.nomeDaBanda = nomeDaBanda;
        this.membrosDaBanda = membrosDaBanda;
        this.dataDeEstreia = dataDeEstreia;
    }
    public Banda()
    {
        this("null", "DD/MM/AAAA", new Membro[0]);
    }
}
