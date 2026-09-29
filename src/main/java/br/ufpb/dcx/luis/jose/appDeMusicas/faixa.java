package br.ufpb.dcx.luis.jose.appDeMusicas;

public class faixa
{
    public String nome;
    public Float tempo;
    public album album;
    public banda banda;

    public faixa(String nome, Float tempo, album album, banda banda)
    {
        this.nome = nome;
        this.tempo = tempo;
        this.album = album;
        this.banda = banda;
    }

    public faixa()
    {
        this("null", -1f, new album(), new banda());
    }

}
