import javax.swing.*;
import java.sql.SQLOutput;

public class Matrizes {
    public static void main(String[] args) {

        /*
         * Escreva um algoritmo que solicite ao usuário a entrada de 4 notas
         * para cada aluno.
         * Calcular a média dos alunos e exibir em tela.
         * Ao final, mostrar a média da turma.
         * Ao lado da média do aluno, deve seguir a seguinte regra de negócio:
         * Se média >= 7.5 - Aluno aprovado
         * Se média >= 5.5 e < 7.5 - Aluno em recuperação
         * Se média < 5.5 - Aluno reprovado
         */

        //Vetor de alunos
        String [] alunos = {"João", "José","Maria"};

        //Matriz de notas
        float [][] notas = new float[3][4];

        //para controlar o somatório das notas de cada aluno
        //para calcular a media do aluno
        float somaNotas;
        float [] mediaAluno = new float[3];
        //para armazenar o status do aluno e usar para imprimir o boletim depois
        String [] statusAluno = new String[3];

        //informar as notas dos alunos
        //Laço externo para associar o aluno à nota
        for (int i = 0; i < 3; i++) {
            somaNotas = 0;
            mediaAluno[i] = 0;
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog(alunos[i]+ " - " + "Informa a nota da prova " + (j + 1) + ":"));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno[i] = somaNotas / 4;
            if (mediaAluno[i] >= 7.5) {
                statusAluno[i] = "Aluno aprovado.";
            } else if (mediaAluno[i] >= 5.5) {
                statusAluno[i] = "Aluno em recuperação.";
            } else {
                statusAluno[i] = "Aluno reprovado.";
            }
        }

        System.out.println("*** Boletim ***");
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + alunos[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println("Prova " + (j+1) + ": " + notas[i][j]);
            }
            System.out.println("Média: " + mediaAluno[i]);
            System.out.println("Status: " + statusAluno[i]);
            System.out.println("**************************************");
        }


        float mediaTurma = (mediaAluno[0] + mediaAluno[1] + mediaAluno[2]) / 3;
        System.out.println("Média da turma: " + mediaTurma);

    }
}