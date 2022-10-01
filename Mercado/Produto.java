
package Mercado;
import javax.swing.JOptionPane;

public class Produto {
  public String nome;
  public int quantidade;
  public String unidade;
  public double preco;

  public Produto(String nome, Double preco){
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Double getPreco(){
    return preco;
  }

  public void setNome(Double preco){
    this.preco = preco;
  }

  public void exibirProduto(){
    JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\nQuantidade: "+quantidade+"\nUnidade de Medida: "+unidade+"\nPrço: "+preco);
  }
}
