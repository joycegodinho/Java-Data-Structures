package EstruturasDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// java.util.Queue - Fila
// java.util.LinkedList

// garante ordem de inserção
// permite adição, leitura, remoção considerando a regra básica de uma fila: primeiro que entra é o primeiro que sai
// Não permite mudança de ordenação

public class ExemploLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavia");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("Fila - Primeiro que entra, primeiro que sai");
        System.out.println(filaBanco); //[Patricia, Roberto, Flavia, Pamela, Anderson]

        //Poll - Retorna o primeiro o retirando da fila
        System.out.println();
        System.out.println("Poll - Retorna o primeiro o retirando da fila");

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido); //Patricia
        System.out.println(filaBanco); //[Roberto, Flavia, Pamela, Anderson]

        //Peek - Retorna o primeiro sem o retirar da fila
        System.out.println();
        System.out.println("Peek - Retorna o primeiro sem o retirar da fila - Null para vazia");

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente); //Roberto
        System.out.println(filaBanco); //[Roberto, Flavia, Pamela, Anderson]

        //Element - Retorna o primeiro sem o retirar da fila
        System.out.println();
        System.out.println("Element - Retorna o primeiro sem o retirar da fila - NoSuchElementException para vazia");

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro); //Roberto
        System.out.println(filaBanco); //[Roberto, Flavia, Pamela, Anderson]

        //Size
        System.out.println();
        System.out.println("Size");

        int tamanho = filaBanco.size();
        System.out.println(tamanho); //4

        //isEmpty
        System.out.println();
        System.out.println("isEmpty - boolean");

        boolean listaEstaVazia = filaBanco.isEmpty();
        System.out.println(listaEstaVazia); // false

        // Iteração - For
        System.out.println();
        System.out.println("Iteração - For");

        for(String cliente: filaBanco){
            System.out.println("-->" + cliente);
        }

        /*
        -->Roberto
        -->Flavia
        -->Pamela
        -->Anderson
         */

        // Interação - Iteraitor - hasNext / Next
        System.out.println();
        System.out.println("Interação - Iteraitor");

        Iterator<String> iterator = filaBanco.iterator();
        while (iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }
        /*
        ---->Roberto
        ---->Flavia
        ---->Pamela
        ---->Anderson
         */



    }
}
