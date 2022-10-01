package Mercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mercado 
{
  private static Scanner input = new Scanner(System.in);
  private static ArrayList<Produto> produtos;
  private static Map<Produto, Integer> carrinho;

  public static void main(String[] args) 
  {
    
    produtos = new ArrayList<>();
    carrinho = new HashMap<>();

    /*
     * Produto produto1 = new Produto(1, "Sabonete", 1.99);
     * produtos.add(produto1);
     * 
     * Produto produto2 = new Produto(2, "Coca-Cola", 10.99);
     * produtos.add(produto2);
     * 
     * Produto produto3 = new Produto(3, "Peito de Frango", 7.69);
     * produtos.add(produto3);
     */

    menu();
  }

  private static void menu() 
  {
    System.out.println("1 - cadastrar");
    System.out.println("2 - listar ");
    System.out.println("3 - comprar");
    System.out.println("4 - carrinho");
    System.out.println("5 - Finalizar compra");
    System.out.println("6 - Sair do programa");

    int option = input.nextInt();

    switch (option) 
    {
      case 1:
        cadastrarProdutos();
        break;

      case 2:
        listarProdutos();
        break;

      case 3:
        comprarProdutos();
        break;

      case 4:
        verCarrinho();
        break;

      case 5:
      finalizarCompra();
        break;

      case 6:
        System.exit(0);

      default:
        System.out.println("Opção invalida");
        menu();
        break;
    }
  }



  private static void cadastrarProdutos() 
  {

    System.out.println("Id do produto");
    int id = input.nextInt();

    System.out.println("Nome do produto");
    String nome = input.next();

    System.out.println("Preco do produto");
    Double preco = input.nextDouble();

    Produto produto = new Produto(id, nome, preco);
    produtos.add(produto);

    System.out.println(produto.getNome() + " Cadastrado com sucesso");
    menu();

  }

  private static void listarProdutos() 
  {
    for (Produto p : produtos) {
      System.out.println(p);
    }
    menu();
  }

  private static void comprarProdutos() 
  {
    System.out.println("Codigo dos produtos");

    for (Produto p : produtos) 
    {
      System.out.println(p);
    }
    int id = Integer.parseInt(input.next());
    boolean isPresent = false;

    for (Produto p : produtos) 
    {
      if (p.getId() == id) {
        int qtd = 0;
        try 
        {
          qtd = carrinho.get(p);
          carrinho.put(p, qtd + 1);
        } 
        catch (NullPointerException e) 
        {
          carrinho.put(p, 1);
        }
        System.out.println(p.getNome() + " adicionado ao carrinho");
        isPresent = true;

        if (isPresent) 
        {
          System.out.println("Deseja adicionar masi itens? y/n");
          String option = input.next();

          if (option == "y") 
          {
            comprarProdutos();
          } 
          else 
          {
            System.exit(id);
          }
        }

      } 
      else 
      {
        System.out.println("Produto não encontrado");
        menu();
      }
    }
  }

  private static void verCarrinho() 
  {
    System.out.println("Produtos no carrinho");

    if(carrinho.size()>0)
    {
      for (Produto p : carrinho.keySet())
        {
          System.out.println("Produto: "+ p +" Quantidade: "+ carrinho.get(p));
        }
    }
    else
    {
      System.out.println("Não há itens no carrinho");
    }
    menu();
  }

  public static void finalizarCompra()
  {
    Double valorDaCompra = 0.0;
    System.out.println("Lista de produtos:");

    for(Produto p : carrinho.keySet())
    {
      int qtd = carrinho.get(p);
      valorDaCompra += p.getPreco()* qtd;
      System.out.println("quantidade: "+qtd);
      System.out.println("Valor da compra: "+ Utils.doubleToString(valorDaCompra));
      carrinho.clear();
      menu();
    }
  }
  
}
