import javax.swing.*;

public class TrabalhandoArray {
    public static void main(String[] args) {
        //declarando o array de países
        String[] paises = new String[4];

        //declarando o array de números inteiros
        int[] numeros = new int[10];

        /*

        //abastecendo o array de países
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Informe um país:");
        }

        // listando o array de países
        for (String listaPaises : paises) {
            System.out.println(listaPaises);
        }
        */

        //abastecendo o array de números
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
        }

        //listando o array de números antes da modificação
        for (Integer listaNumeros : numeros) {
            System.out.println(listaNumeros);
        }

        int novoValor = 11;
        numeros[8] = novoValor + 4;

        //listando o array de números depois da modificação
        for (Integer listaNumeros : numeros) {
            System.out.println(listaNumeros);
        }
    }
}