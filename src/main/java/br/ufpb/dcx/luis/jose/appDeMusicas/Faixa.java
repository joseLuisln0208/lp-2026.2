package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Faixa
{
    private String nomeDaFaixa;
    private String tempo;
    private Album album;

    public Faixa(String nomeDaFaixa, String tempo, Album album)
    {
        this.nomeDaFaixa = nomeDaFaixa;
        this.tempo = tempo;
        this.album = album;
    }

    public Faixa()
    {
        this("null", "--:--", new Album());
    }
}
