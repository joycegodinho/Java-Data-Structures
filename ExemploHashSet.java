package EstruturasDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//java.util.Set
//java.util.HashSet
// utilizar quando não é necessário manter uma ordenação
// não permite repetidos
// mais perfomático

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        Set<Double> notasTrabalho = new HashSet<>();
        notasTrabalho.add(5.8);
        notasTrabalho.add(9.3);
        notasTrabalho.add(6.5);
        notasTrabalho.add(10.0);

        //// HashSet - não garante a ordem de inserção
        System.out.println("HashSet");
        System.out.println("Notas prova: " + notasAlunos);
        //[4.0, 5.8, 10.0, 9.3, 3.8, 6.5, 7.3, 5.4]
        // mudou a ordem de inserção
        System.out.println("Notas trabalho: " + notasTrabalho);
        
        // Intersecao
        System.out.println();
        System.out.println("Intersecao");   
        
        Set<Double> intersecao = new HashSet<>(notasAlunos);
        intersecao.retainAll(notasTrabalho);
        System.out.println(intersecao);
        
        //Uniao
        System.out.println();
        System.out.println("Uniao");
        
        Set<Double> uniao = new HashSet<>(notasAlunos);
        uniao.addAll(notasTrabalho);
        System.out.println(uniao);
        
        //diferenca
        System.out.println();
        System.out.println("Diferenca");
        
        Set<Double> diferenca = new HashSet<>(notasAlunos);
        diferenca.removeAll(notasTrabalho);
        System.out.println(diferenca);
        
        ///Remove
        System.out.println();
        System.out.println("Remove");
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);
        //[4.0, 5.8, 10.0, 9.3, 6.5, 7.3, 5.4]

        ///Size
        System.out.println();
        System.out.println("Size");
        System.out.println(notasAlunos.size()); //7

        // Iteração - Iterator
        System.out.println();
        System.out.println("Iteração - Iterator");

        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Iteração - For
        System.out.println();
        System.out.println("Iteração - For");

        for(Double nota:notasAlunos){
            System.out.println(nota);
        }

        // Clear + isEmpty
        System.out.println();
        System.out.println("Clear + isEmpty");

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty()); //true


    }
}
