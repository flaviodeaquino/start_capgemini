import javax.swing.*;

public class EntradaDados {
    public static void main(String[] args) {
        // Entrada de dados via JOPtionPane

        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa:"));
        System.out.println("A pessoa tem " + idade + " anos de idade.");
        JOptionPane.showMessageDialog(null,"A pessoa tem " + idade + " anos de idade.");
    }
}