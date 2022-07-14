import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> produtos = new ArrayList<>();
        
        Produto p1 = new Produto(1L, "Arroz", 50,  LocalDate.now(), LocalDate.now().plusMonths(3));
        Produto p2 = new Produto(2L, "Feijão", 25, LocalDate.now(), LocalDate.now().plusMonths(4));
        Produto p3 = new Produto(3L, "Açucar", 10, LocalDate.now(), LocalDate.now().plusMonths(5));
        Produto p4 = new Produto(4L, "Macarrão", 20, LocalDate.now(), LocalDate.now().plusMonths(6));

        produtos.addAll(Arrays.asList(p1, p2, p3, p4));

        produtos.stream().forEach(System.out::println);

        p1.addItens(10);
        p2.removeItens(5);

        System.out.println();
        System.out.println("Dados atualizados:");
        produtos.stream().forEach(System.out::println);

        produtos.remove(p3);
        System.out.println();
        System.out.println("Dados atualizados:");
        produtos.stream().forEach(System.out::println);
    }
}
