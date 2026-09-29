package br.ufpb.dcx.luis.jose.jogos;

public class jogo
{
    private String nometime1;
    private String nometime2;
    private int numGolsTime1;
    private int numGolsTime2;

    public jogo(String nometime1, String nometime2, int numGolsTime1, int numGolsTime2)
    {
        this.nometime1 = nometime1;
        this.nometime2 = nometime2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }
    public jogo()
    {
        this("null","null",0,0);
    }

    public String getNomeTime1()
    {
        return this.nometime1;
    }
    public String getNomeTime2()
    {
        return this.nometime2;
    }
    public int getNumGolsTime1()
    {
        return this.numGolsTime1;
    }
    public int getNumGolsTime2()
    {
        return this.numGolsTime2;
    }

    public void setNometime1(String nometime1)
    {
        this.nometime1 = nometime1;
    }
    public void setNometime2(String nometime1)
    {
        this.nometime2 = nometime2;
    }
    public void setNumGolsTime1(int numGolsTime1)
    {
        this.numGolsTime1 = numGolsTime1;
    }
    public void setNumGolsTime2(int numGolsTime2)
    {
        this.numGolsTime2 = numGolsTime2;
    }

    public String toString()
    {
        return ("O jogo entre " + nometime1 + " e " + nometime2 + " teve o placar de " + numGolsTime1 + " a "+ numGolsTime2);
    }
}
