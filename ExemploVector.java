package EstruturasDados;

import java.util.List;
import java.util.Vector;
// java.util.List
// java.util.ArrayList
// java.util.Vector

// garante ordem de inserção
// permite adição, atualização, leitura e remoção sem regras adicionais (dinamicamente, os arrays nativos são estáticos)
// permite comparação atraves de comparators

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tênis");
        esportes.add("Handebol");

        System.out.println("Array");
        System.out.println(esportes); //[Futebol, Basquete, Tênis, Handebol]


        // Set - para alterar a lista dinâmicamente
        System.out.println();
        System.out.println("Set - Troca");

        esportes.set(2, "Ping Pong"); //(int index, String item)- troca o valor do item na posição indicada
        System.out.println(esportes); //[Futebol, Basquete, Ping Pong, Handebol]

        // Remove
        System.out.println();
        System.out.println("Remove - pelo indice ou pelo objeto");

        esportes.remove(2); //(int index) - remove pelo indice
        System.out.println(esportes); //[Futebol, Basquete, Handebol]

        esportes.remove("Handebol"); //(o Object) - remove pelo nome do objeto
        System.out.println(esportes); //[Futebol, Basquete]

        // Get
        System.out.println();
        System.out.println("Get - retorna o objeto do indice dado");

        String esporte = esportes.get(0);
        System.out.println(esporte); //Futebol

        // Iteração - For
        System.out.println();
        System.out.println("Iteração - For");

        for(String nomeDoItem: esportes){
            System.out.println("-->" + nomeDoItem);
        }

        /*
        -->Futebol
        -->Basquete
         */


    }
}
