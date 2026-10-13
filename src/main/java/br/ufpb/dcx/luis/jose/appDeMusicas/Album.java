package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Album
{
    public String nomeDoAlbum;
    public String dataDeLancamento;
    public Banda banda;

    public Album(String nomeDoAlbum, String dataDeLancamento, Banda banda)
    {
        this.nomeDoAlbum = nomeDoAlbum;
        this.dataDeLancamento = dataDeLancamento;
        this.banda = banda;
    }
    public Album()
    {
        this("null", "DD/MM/AAAA", new Banda());
    }
}
