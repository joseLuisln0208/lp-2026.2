package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Album
{
    private String nomeDoAlbum;
    private String dataDeLancamento;

    public Album(String nomeDoAlbum, String dataDeLancamento)
    {
        this.nomeDoAlbum = nomeDoAlbum;
        this.dataDeLancamento = dataDeLancamento;
    }
    public Album()
    {
        this("null", "DD/MM/AAAA");
    }
}
