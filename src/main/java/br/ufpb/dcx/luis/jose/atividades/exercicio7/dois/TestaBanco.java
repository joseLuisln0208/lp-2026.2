package br.ufpb.dcx.luis.jose.atividades.exercicio7.dois;
import java.util.ArrayList;

public class TestaBanco
{
    public static void main(String[] args)
    {
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));

        meuBanco.abrirConta("222.222.222-22", "444-4", "333-3", 50.0);
        meuBanco.transferir("222-2", "333-3", "444-4", "333-3", 100.0);

        System.out.println("Saldo da conta 444-4: R$ " + meuBanco.consultarSaldoDeConta("444-4", "333-3"));

        ArrayList<Conta> contasNegativas = meuBanco.pesquisarContasComSaldoNegativo();
        System.out.println("Contas com saldo negativo:");
        for (Conta c : contasNegativas)
        {
            System.out.println(c);
        }
    }
}
