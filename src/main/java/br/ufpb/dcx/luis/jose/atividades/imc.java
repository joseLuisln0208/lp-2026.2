package br.ufpb.dcx.luis.jose.atividades;
import javax.swing.*;

public class imc {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite o seu peso em kg:");
        String alturaStr = JOptionPane.showInputDialog("Digite a sua altura em metros:");

        double peso = Double.parseDouble(pesoStr.replace(',', '.'));
        double altura = Double.parseDouble(alturaStr.replace(',', '.'));

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "O seu IMC é: " + String.format("%.2f", imc));
    }
}