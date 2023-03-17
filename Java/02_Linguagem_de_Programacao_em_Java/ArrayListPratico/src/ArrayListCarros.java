import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        //Contruindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();

        //adicionando Carros ao arraylist
        carros.add("Kombi");
        carros.add("Chevete");
        carros.add("Fusca");
        carros.add("Gurgel");
        carros.add("Monza");
        carros.add("Opala");

        //Mostra array
        System.out.println(carros);

        //Substituir Monza por Brasília
        carros.set(4, "Brasília");
        //Mostra array
        System.out.println(carros);

        //Remover Brasília
        carros.remove("Brasília");
        //mostra array
        System.out.println(carros);

        //adicionando Carros ao arraylist com JOPtionPane
        carros.add(JOptionPane.showInputDialog("Informe o modelo do carro:"));
        //mostra array
        System.out.println(carros);

        /*
        //esvaziando o array
        carros.clear();
        //mostra array
        System.out.println(carros);

        //verificar se o array está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio.");
        }
        */

        if (carros.contains("Variante")) {
            //substituindo quando não se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if ("Variante".equals(carros.get(i))) {
                    carros.set(i, "Pampa");
                    //break;
                }
            }
        } else {
            System.out.println("Não foi encontrado nenhuma Variante no arraylist.");
        }
        //mostra array
        System.out.println(carros);


    }
}