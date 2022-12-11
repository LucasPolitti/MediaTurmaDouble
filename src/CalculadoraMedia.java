import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaTurma(alunos, scan);

        System.out.printf("Média da Turma %2f", media);


    }

    private static Double calculaMediaTurma(String[] alunos, Scanner scan) {

        double soma = 0d;

        for (String aluno: alunos) {

            System.out.printf("Nota do aluno %s ", aluno);

            double nota  = Double.parseDouble(scan.nextLine());

            soma += nota;
        }

        return soma/alunos.length;

    }
}
