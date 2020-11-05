package EstruturasDados;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {
        TreeMap<String,String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println("TreeMap");
        System.out.println(treeCapitais);
        //{MG=Belo Horizonte, PR=Curitiba, RJ=Rio de Janeiro, RS=Porto Alegre, SC=Florianópolis, SP=São Paulo}

        // FirstKey - retorna a key do topo
        System.out.println();
        System.out.println("FirstKey");
        System.out.println(treeCapitais.firstKey()); //MG

        // LastKey - retorna a key do fim
        System.out.println();
        System.out.println("LastKey");
        System.out.println(treeCapitais.lastKey()); //SP

        // lowerKey - retorna o valor abaixo da entrada
        System.out.println();
        System.out.println("LowerKey");
        System.out.println(treeCapitais.lowerKey("SC")); //RS

        // higherKey - retorna o valor acima da entrada
        System.out.println();
        System.out.println("HigherKey");
        System.out.println(treeCapitais.higherKey("SC")); //SP

        // FirstEntry - retorna o valor do topo
        System.out.println();
        System.out.println("FirstEntry");
        System.out.println(treeCapitais.firstEntry().getKey() + "--" + treeCapitais.firstEntry().getValue());
        //MG--Belo Horizonte

        // LastEntry - retorna o valor do fim
        System.out.println();
        System.out.println("LastEntry");
        System.out.println(treeCapitais.lastEntry().getKey() + "--" + treeCapitais.lastEntry().getValue());
        //SP--São Paulo

        // PollFirstEntry - retorna o valor do topo, removendo-o
        System.out.println();
        System.out.println("PoolFirstEntry");

        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + "--" + firstEntry.getValue());
        System.out.println(treeCapitais);
        //MG--Belo Horizonte
        //{PR=Curitiba, RJ=Rio de Janeiro, RS=Porto Alegre, SC=Florianópolis, SP=São Paulo}

        // PollLastEntry - retorna o valor do fim, removendo-o
        System.out.println();
        System.out.println("PoolLastEntry");
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + "--" + lastEntry.getValue());
        System.out.println(treeCapitais);
        //SP--São Paulo
        //{PR=Curitiba, RJ=Rio de Janeiro, RS=Porto Alegre, SC=Florianópolis}

        //Iteração - Itarator
        System.out.println();
        System.out.println("Iteração - Itarator");

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "--" + treeCapitais.get(key));
        }

        //Iteração - For 01
        System.out.println();
        System.out.println("Iteração - For 01");

        for(String capital: treeCapitais.keySet()){
            System.out.println(capital + "--" + treeCapitais.get(capital));
        }

        //Iteração - For 02
        System.out.println();
        System.out.println("Iteração - For 02");

        for (Map.Entry<String,String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + "--" + capital.getValue());
        }


    }
}
