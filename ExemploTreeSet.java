package EstruturasDados;

import java.util.Iterator;
import java.util.TreeSet;

//java.util.TreeSet
// utilizar quando é necessário alterar a ordem através do uso de comparators
// mantem a ordem e pode ser reodernado (mais lento que o linked set)
// toda vez que a estrutura é alterada, é rodado novamente o algorítimo de ordenação, por isso fica mais lento

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        //treeCapitais.add("Belo Horizonte");

        //TreeSet
        System.out.println("TreeSet");
        System.out.println(treeCapitais);
        //[Belo Horizonte, Curitiba, Florianópolis, Porto Alegre, Rio de Janeiro, São Paulo]

        //First - retorna o topo da árvore
        System.out.println();
        System.out.println("First");
        System.out.println(treeCapitais.first()); //Belo Horizonte

        //Last - retorna a última cidade
        System.out.println();
        System.out.println("Last");
        System.out.println(treeCapitais.last()); //São Paulo

        //Lower - retorna a primeira capital abaixo da entrada
        System.out.println();
        System.out.println("Lower");
        System.out.println(treeCapitais.lower("Florianópolis")); //Curitiba

        //Higher - retorna a primeira capital acima da entrada
        System.out.println();
        System.out.println("Higher");
        System.out.println(treeCapitais.higher("Florianópolis")); //Porto Alegre

        //pollFirst - retorna o topo da árvore, removendo-a da árvore
        System.out.println();
        System.out.println("pollFirst");
        System.out.println(treeCapitais.pollFirst()); //Belo Horizonte
        System.out.println(treeCapitais);//[Curitiba, Florianópolis, Porto Alegre, Rio de Janeiro, São Paulo]

        //Last - retorna a última cidade, removendo-a da árvore
        System.out.println();
        System.out.println("pollLast");
        System.out.println(treeCapitais.pollLast()); //São Paulo
        System.out.println(treeCapitais); //[Curitiba, Florianópolis, Porto Alegre, Rio de Janeiro]

        // Iteração - Iterator
        System.out.println();
        System.out.println("Iteração - Iterator");

        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Iteração - For
        System.out.println();
        System.out.println("Iteração - For");

        for(String capital:treeCapitais){
            System.out.println(capital);
        }
    }
}
