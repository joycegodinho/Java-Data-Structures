package EstruturasDados;

// n�o mantem a ordem
//linked hash map mantem a ordem

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeaoMundialFifa = new HashMap<>();

        campeaoMundialFifa.put("Brasil", 5);
        campeaoMundialFifa.put("Alemanha", 4);
        campeaoMundialFifa.put("Itália", 4);
        campeaoMundialFifa.put("Uruguai", 2);
        campeaoMundialFifa.put("Argentina", 2);
        campeaoMundialFifa.put("França", 2);
        campeaoMundialFifa.put("Inglaterra", 1);
        campeaoMundialFifa.put("Espanha", 1);

        //HashMap
        System.out.println("HashMap");
        System.out.println(campeaoMundialFifa);
        //{Brasil=5, Argentina=2, Inglaterra=1, Itália=4, Uruguai=2, Espanha=1, França=2, Alemanha=4}

        // Substituir
        System.out.println();
        System.out.println("Put - Substituição");

        campeaoMundialFifa.put("Brasil", 6);
        System.out.println(campeaoMundialFifa);
        //{Brasil=6, Argentina=2, Inglaterra=1, Itália=4, Uruguai=2, Espanha=1, França=2, Alemanha=4}

        //Get
        System.out.println();
        System.out.println("Get");

        System.out.println(campeaoMundialFifa.get("Argentina")); //2

        //containsKey
        System.out.println();
        System.out.println("containsKey");

        System.out.println(campeaoMundialFifa.containsKey("França"));//true

        //Remove
        System.out.println();
        System.out.println("Remove");

        campeaoMundialFifa.remove("França");
        System.out.println(campeaoMundialFifa.containsKey("França"));//false
        System.out.println(campeaoMundialFifa);
        //{Brasil=6, Argentina=2, Inglaterra=1, Itália=4, Uruguai=2, Espanha=1, Alemanha=4}

        //containsValue
        System.out.println();
        System.out.println("containsValue");

        System.out.println(campeaoMundialFifa.containsValue(6)); //true

        //Size
        System.out.println();
        System.out.println("Size");

        System.out.println(campeaoMundialFifa.size()); //7

        // Iteração for 01
        System.out.println();
        System.out.println("Iteração for 01");

        for(Map.Entry<String,Integer> entry : campeaoMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "---" +entry.getValue());
        }

        //Iteração for 02
        System.out.println();
        System.out.println("Iteração for 02");

        for(String key : campeaoMundialFifa.keySet()){
            System.out.println(key + "---" +campeaoMundialFifa.get(key));

        }



    }
}
