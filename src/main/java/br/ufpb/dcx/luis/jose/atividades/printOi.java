package br.ufpb.dcx.luis.jose.atividades;
import javax.swing.*;

public class printOi
{
    public static void main(String [] args)
    {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        String cidade = JOptionPane.showInputDialog("Qual cidade você mora?");

        System.out.println("Oi " + nome + "!  Que legal saber que você é da cidade " + cidade);
    }
}
