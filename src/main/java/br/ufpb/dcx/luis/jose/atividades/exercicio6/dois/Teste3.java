package br.ufpb.dcx.luis.jose.atividades.exercicio6.dois;
import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];

        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR");
            String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());
        }

        int quantidadeAlmoco = 0;
        boolean temCafe = false;

        for (RefeicaoRealizada r : refeicoes)
        {
            if (r != null && r.getTipoRefeicao() != null)
            {
                if (r.getTipoRefeicao().equalsIgnoreCase("ALMOÇO") || r.getTipoRefeicao().equalsIgnoreCase("ALMOCO"))
                {
                    quantidadeAlmoco++;
                }
                if (r.getTipoRefeicao().equalsIgnoreCase("CAFÉ") || r.getTipoRefeicao().equalsIgnoreCase("CAFE"))
                {
                    temCafe = true;
                }
            }
        }

        System.out.println("Quantidade de refeições do tipo ALMOÇO: " + quantidadeAlmoco);

        if (temCafe) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        System.out.printf("FIM DO PROGRAMA");
        leitor.close();
    } // fim do main
} // fim da classe Teste 3
