package Controller;

import Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class VendasController {
    public static void main(String[] args) {
        Produto p1 = new Produto(01, "Guarana 500Ml", 500, 5.50);
        Produto p2 = new Produto(02, "Stikadinho 32g", 200, 2.25);
        Produto p3 = new Produto(03, "Doritos 350g", 350, 7.50);

        Item i1 = new Item(01, 0.5, 2, p1);
        Item i2 = new Item(02, 1.0, 7, p2);
        Item i3 = new Item(03, 3.0, 5, p3);

        Vendedor v1 = new Vendedor(01, "Barnabé", "Rua Barnabeu", "Novo", "72635-090", "Pelotas", "Rs","Mercado Barnabé");
        Vendedor v2 = new Vendedor(02, "Pedro", "Rua Gonzaga", "Pinhos", "82739-545", "Pelotas", "Rs","Mercado 24 Horas");

        Fornecedor f1 = new Fornecedor("Jorge", "73.821.313/0009-62", "9962171-7289");
        Fornecedor f2 = new Fornecedor("Marcos", "62.819.917/0006-09", "9970528-7371");

        Pedido pedido1 = new Pedido(1, LocalDate.of(2023,9,15),i1.getQtItem(),v1,i1,"Atendido");
        Pedido pedido2 = new Pedido(2, LocalDate.of(2023,9,16),i2.getQtItem(),v2,i2,"Atendido");

        p1.getItemList().add(i1);
        p2.getItemList().add(i2);
        p3.getItemList().add(i3);

        pedido1.attQ(i1);
        pedido2.attQ(i2);
        pedido2.attQ(i3);

        List<Pedido> vendas = new ArrayList<>();
        vendas.add(pedido1);
        vendas.add(pedido2);
        System.out.println("\n---- 1.b (Vendas Realizadas)----");
        System.out.println(vendas);

        System.out.println("\n---- 1.b (Atualização do Estoque) ----");
        System.out.println(p1);
        System.out.println(p2);


        p1.getFornecedorList().add(f1);
        p2.getFornecedorList().add(f2);

        Fornecimento forne1 = new Fornecimento(LocalDate.of(2023,8,10), 550.0, f1,p1);
        Fornecimento forne2 = new Fornecimento(LocalDate.of(2023,8,15), 225.0, f2,p2);
        Fornecimento forne3 = new Fornecimento(LocalDate.of(2023,8,20), 750.0, f2,p3);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(forne1);
        fornecimentoList.add(forne2);
        fornecimentoList.add(forne3);

        System.out.println("\n---- 1.c (Fornecimentos) ----");
        System.out.println(fornecimentoList);

        System.out.println("\n---- 1.c (Soma total do Fornecimentos) ----");
        double somaGeral = 0.0;
        for (Fornecimento f: fornecimentoList) {
            somaGeral += f.getValorTotal();
        }

        System.out.println("Valor Total: " + somaGeral);

    }
}