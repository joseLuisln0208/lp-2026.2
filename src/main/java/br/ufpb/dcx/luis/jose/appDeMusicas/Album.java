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
    public Album() { this("null", "DD/MM/AAAA"); }

    public String getNomeDoAlbum() { return this.nomeDoAlbum; }
    public String getDataDeLancamento() { return this.dataDeLancamento; }

    public void setNomeDoAlbum(String nomeDoAlbum) { this.nomeDoAlbum = nomeDoAlbum; }
    public void setDataDeLancamento(String dataDeLancamento) { this.dataDeLancamento = dataDeLancamento; }

    public String toString() { return ("nome do album: " + nomeDoAlbum + " | data de lançamento: " + dataDeLancamento);}
}
