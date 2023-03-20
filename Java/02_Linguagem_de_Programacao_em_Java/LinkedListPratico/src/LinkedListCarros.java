import java.util.LinkedList;

public class LinkedListCarros {
    public static void main(String[] args) {
        /*
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst
        getLast
         */
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Del Rey");
        cars.add("Santana");
        cars.add("D10");
        System.out.println(cars);

        //incluindo Pampa no início
        cars.addFirst("Pampa");
        System.out.println(cars);

        //incluindo Fusca no final
        cars.addLast("Fusca");
        System.out.println(cars);

        String carro = cars.get(3);
        System.out.println(carro);

        //removendo Pampa
        cars.removeFirst();
        System.out.println(cars);

        //removendo Fusca
        cars.removeLast();
        System.out.println(cars);

        //pega o primeiro
        System.out.println(cars.getFirst());
        System.out.println(cars);

        //pega o ultimo
        System.out.println(cars.getLast());
        System.out.println(cars);
    }
}