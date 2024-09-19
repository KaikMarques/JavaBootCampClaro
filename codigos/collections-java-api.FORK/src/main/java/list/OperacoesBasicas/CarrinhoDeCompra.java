package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public CarrinhoDeCompra( ) {
        this.itemList = new ArrayList<>();
    }

    // Tarefa 1 - adicionarItem
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    // Tarefa 2 - removerItem(String nome)
    public void removerItem(String nome) {
        // Criando uma lista temporária
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }




}
