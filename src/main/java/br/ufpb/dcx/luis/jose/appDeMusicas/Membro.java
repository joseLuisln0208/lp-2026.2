package br.ufpb.dcx.luis.jose.appDeMusicas;

public class Membro
{
    public String nomeDoMembro;
    public String dataDeNascimento;
    public String paisDeNascimento;

    public Membro(String nomeDoMembro, String dataDeNascimento, String paisDeNascimento)
    {
        this.nomeDoMembro = nomeDoMembro;
        this.dataDeNascimento = dataDeNascimento;
        this.paisDeNascimento = paisDeNascimento;
    }
    public Membro()
    {
        this("null", "DD/MM/AAAA","null");
    }
}
