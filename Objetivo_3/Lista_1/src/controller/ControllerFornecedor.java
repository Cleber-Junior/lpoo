package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControllerFornecedor {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Sabão", 20, 3.55);
        Produto p2 = new Produto(2, "Pão de Forma", 15, 7.25);
        Produto p3 = new Produto(3, "Queijo", 10, 8.75);

        Fornecedor f1 = new Fornecedor("72936591276761","996452619", "Luigi");
        Fornecedor f2 = new Fornecedor("05424214471414", "997085671", "Gabriel");

        Fornecimento forne = new Fornecimento(LocalDate.of(2023,10,4),p1.getPreco() * 10);

        f1.getProdutos().add(p1);
        f1.getProdutos().add(p2);
        f2.getProdutos().add(p3);

        forne.getFornecedores().add(f1);
        forne.getFornecedores().add(f2);
        forne.getProdutos().add(p1);
        forne.getProdutos().add(p2);
        forne.getProdutos().add(p3);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(forne);

        System.out.println("---- Fornecimentos (Lista 1 - E) ----");
        System.out.println(fornecimentoList);
    }
}
