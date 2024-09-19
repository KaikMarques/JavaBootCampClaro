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
    // Método para remover um item do carrinho com base no nome do item
    public void removerItem(String nome) {

        // Cria uma lista temporária para armazenar os itens que serão removidos
        List<Item> itensParaRemover = new ArrayList<>();
        // Verifica se a lista de itens (itemList) não está vazia
        if (!itemList.isEmpty()) {
            // Percorre a lista de itens do carrinho (itemList)
            for (Item i : itemList) {
                // Verifica se o nome do item atual é igual ao nome passado como argumento
                // O método equalsIgnoreCase() compara os nomes ignorando diferenças de maiúsculas e minúsculas
                if (i.getNome().equalsIgnoreCase(nome)) {

                    // Se o nome coincidir, o item é adicionado à lista temporária de itens a serem removidos
                    itensParaRemover.add(i);
                }
            }
            // Remove todos os itens da lista original (itemList) que estão presentes na lista temporária (itensParaRemover)
            itemList.removeAll(itensParaRemover);
        } else {
            // Se a lista de itens estiver vazia, imprime uma mensagem informando que não há itens para remover
            System.out.println("A lista está vazia!");
        }
    }





}
