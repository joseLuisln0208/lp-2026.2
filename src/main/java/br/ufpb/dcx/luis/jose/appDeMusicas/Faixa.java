package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Faixa
{
    public String nomeDaFaixa;
    public Float tempo;
    public Album album;

    public Faixa(String nomeDaFaixa, Float tempo, Album album)
    {
        this.nomeDaFaixa = nomeDaFaixa;
        this.tempo = tempo;
        this.album = album;
    }

    public Faixa()
    {
        this("null", -1f, new Album());
    }
}
