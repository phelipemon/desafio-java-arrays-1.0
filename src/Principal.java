import br.com.alura.challenges.challenge1.Aluno;
import br.com.alura.challenges.challenge1.Pessoa;
import br.com.alura.challenges.challenge2.Produto;
import br.com.alura.challenges.challenge2.ProdutoPerecivel;
import br.com.alura.challenges.challenge3.*;
import br.com.alura.challenges.challenge4.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pessoa jubileu = new Pessoa("Jubileu", 48);
        Pessoa pessoa2 = new Pessoa("Astolfo", 28);
        Pessoa pessoa3 = new Pessoa("Aristoteles", 15);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(jubileu);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa2);
        System.out.println("Quantidade de produtos na lista: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas.toString());

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

        Aluno aluno = new Aluno("CBUM", 28,001,"Nutrição");
        System.out.println(aluno.getCurso());
        System.out.println(aluno.toString());

        System.out.println("______________________________________ END CHALLENGE 1 ______________________________________");

        Produto produto = new Produto("Mouse");
        produto.setPreco(149.9);
        produto.setQuantidade(5);

        Produto produto1 = new Produto("Teclado");
        produto1.setPreco(200);
        produto1.setQuantidade(2);


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto1);
        System.out.println("Quantidade de produtos na lista: " + listaDeProdutos.size());
        System.out.println("Primeiro produto da lista é: " + listaDeProdutos.get(0).toString());

        System.out.println("Todos os produtos presentes na lista são : " + listaDeProdutos.toString());

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Pasta Térmica", "01/02/2025");
        perecivel.setPreco(30);
        System.out.println(perecivel.toString());
        System.out.println("Nome: " +
                perecivel.getNome() + " Valor: R$" +
                perecivel.getPreco() + " Data de validade: " +
                perecivel.getDataValidade());
        System.out.println("______________________________________ END CHALLENGE 2 ______________________________________");

        System.out.println("forEach: ");
        for (Produto item : listaDeProdutos
             ) {
            System.out.println(item);
        }
        System.out.println("*************************");

        System.out.println("- Expressão Lambda");
        listaDeProdutos.forEach(item -> System.out.println(item));
        System.out.println("Nesse caso, o método forEach é chamado sobre a lista nomes e recebe como parâmetro uma expressão lambda que realiza a impressão do valor na tela. A expressão lambda nome -> System.out.println(nome) é uma forma compacta de definir uma função que recebe um parâmetro nome e realiza a operação de impressão.");
        System.out.println("*************************");

        System.out.println("- Method Reference: nada mais é do que uma forma reduzida de uma expressão lambda");
        listaDeProdutos.forEach(System.out::println);
        System.out.println("No código anterior, o símbolo :: é a sintaxe do Method Reference, que no exemplo mostrado faz uma referência para o método println.");
        System.out.println("*************************");

        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
        animal.animalMethod();

        if (cachorro instanceof Animal){
            cachorro.animalMethod();
        }

        for (Produto lista: listaDeProdutos) {
            var precoMedio = lista.getPreco() / lista.getQuantidade();
            System.out.println("Preço médio do produto: " + lista + " Valor: " + precoMedio);
        }

        Circulo circulo = new Circulo();
        circulo.calcularArea(2);
        System.out.println(circulo.getArea());

        Quadrado quadrado = new Quadrado();
        var quadradao = quadrado;
        quadradao.calcularArea(10);
        System.out.println(quadradao.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(circulo);
        for (Forma loop: formas ) {

            System.out.println("Área: " + loop.guardaArea());
        }

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroDaConta(999);
        conta1.setSaldo(1000);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumeroDaConta(222);
        conta2.setSaldo(8000);

        ContaBancaria conta3 = new ContaBancaria();
        conta3.setNumeroDaConta(777);
        conta3.setSaldo(10);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta2);
        listaDeContas.add(conta1);
        listaDeContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());

        System.out.println("______________________________________ END CHALLENGE 3 ______________________________________");


        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(23);
        listaNumeros.add(55);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(3);

        System.out.println(listaNumeros);
        Collections.sort(listaNumeros);
        System.out.println("Lista após ordenação:");
        System.out.println(listaNumeros);

        Titulo serie = new Titulo("Arnold");

        Titulo serie2 = new Titulo("Um maluco no pedaço");

        Titulo serie3 = new Titulo("Eu a patroa e as crianças");

        List<Titulo> listaSeries = new ArrayList<>();
        listaSeries.add(serie);
        listaSeries.add(serie2);
        listaSeries.add(serie3);
        System.out.println(listaSeries);

        System.out.println("Lista após ordenação:");
        Collections.sort(listaSeries);
        System.out.println(listaSeries);


        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);


        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}
