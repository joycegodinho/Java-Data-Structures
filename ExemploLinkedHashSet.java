package EstruturasDados;

import java.util.Iterator;
import java.util.LinkedHashSet;

//java.util.LinkedHashSet
// utilizar quando � necessário manter a ordem de insercao
// mais lento pois mantém a ordem

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        //sequenciaNumerica.add(23);

        //// LinkedHashSet - mantem a ordem de inserção
        System.out.println("LinkedHashSet");
        System.out.println(sequenciaNumerica);
        //[1, 2, 4, 8, 16]

        ///Remove
        System.out.println();
        System.out.println("Remove");
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);
        //[1, 2, 8, 16]

        ///Size
        System.out.println();
        System.out.println("Size");
        System.out.println(sequenciaNumerica.size()); //4

        // Iteração - Iterator
        System.out.println();
        System.out.println("Iteração - Iterator");

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Iteração - For
        System.out.println();
        System.out.println("Iteração - For");

        for(Integer numero:sequenciaNumerica){
            System.out.println(numero);
        }

        // Clear + isEmpty
        System.out.println();
        System.out.println("Clear + isEmpty");

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty()); //true


    }


}
