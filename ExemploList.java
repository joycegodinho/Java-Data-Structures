package EstruturasDados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// java.util.List
// java.util.ArrayList
// java.util.Vector

// garante ordem de inserção
// permite adição, atualização, leitura e remoção sem regras adicionais (dinamicamente, os arrays nativos são estáticos)
// permite comparação atraves de comparators

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println("Array");
        System.out.println(nomes); //[Carlos, Pedro, Juliana, Anderson, Maria, João]


        // Set - para alterar a lista dinâmicamente
        System.out.println();
        System.out.println("Set - Troca");
        nomes.set(2, "Larissa"); //(int index, String item)- troca o valor do item na posição indicada
        System.out.println(nomes); //[Carlos, Pedro, Larissa, Anderson, Maria, João]

        // Sort - para ordenar - Collections
        System.out.println();
        System.out.println("Sort - Ordena");

        Collections.sort(nomes); // deixa em ordem alfabética
        System.out.println(nomes); //[Anderson, Carlos, João, Larissa, Maria, Pedro]

        // Remove
        System.out.println();
        System.out.println("Remove - pelo indice ou pelo objeto");

        nomes.remove(4); //(int index) - remove pelo indice
        System.out.println(nomes); //[Anderson, Carlos, João, Larissa, Pedro]

        nomes.remove("Carlos"); //(o Object) - remove pelo nome do objeto
        System.out.println(nomes); //[Anderson, João, Larissa, Pedro]

        // Get
        System.out.println();
        System.out.println("Get - retorna o objeto do indice dado");

        String nome = nomes.get(1);
        System.out.println(nome); //João

        // indexOf - retorna -1 quando não há o elemento
        System.out.println();
        System.out.println("indexOf - retorna o indice do objeto");

        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao); //3

        //Size
        System.out.println();
        System.out.println("Size");

        int tamanho = nomes.size();
        System.out.println(tamanho); //4

        //Contanis
        System.out.println();
        System.out.println("Contais - boolean");

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson); // true

        //isEmpty
        System.out.println();
        System.out.println("isEmpty - boolean");

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia); // false

        // Iteração - For
        System.out.println();
        System.out.println("Iteração - For");

        for(String nomeDoItem: nomes){
            System.out.println("-->" + nomeDoItem);
        }

        /*
         -->Anderson
         -->João
         -->Larissa
         -->Pedro
         */

        // Interação - Iteraitor - hasNext / Next
        System.out.println();
        System.out.println("Interação - Iteraitor");

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }
        /*
         ---->Anderson
         ---->João
         ---->Larissa
         ---->Pedro
         */

        // Clear
        System.out.println();
        System.out.println("Clear + isEmpty");

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia); // true

    }
}
