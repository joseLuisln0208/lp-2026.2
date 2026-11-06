package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Banda
{
    private String nomeDaBanda;
    private String dataDeEstreiaDaBanda;
    private Membro[] membrosDaBanda;
    private Album[] albunsDaBanda;

    public Banda(String nomeDaBanda, String dataDeEstreiaDaBanda, Membro[] membrosDaBanda, Album[] albunsDaBanda)
    {
        this.nomeDaBanda = nomeDaBanda;
        this.membrosDaBanda = membrosDaBanda;
        this.dataDeEstreiaDaBanda = dataDeEstreiaDaBanda;
        this.albunsDaBanda = albunsDaBanda;
    }
    public Banda()
    {
        this("null", "DD/MM/AAAA", new Membro[0], new Album[0]);
    }
}
