package Mercado;

public class Shampo extends Produto {
  private Integer irritabilidade;

  public Shampo(String nome, Double preco, Integer irritabilidade){
    super(nome, preco);
    this.irritabilidade = irritabilidade;
  }

  public Integer getIrritabilidade() {
    return irritabilidade;
  }

  public void setIrritabilidade(Integer irritabilidade) {
    this.irritabilidade = irritabilidade;
  }

  @Override
  public String toString(){
    return "Produto: Sampo, Preço: "+getPreco()+",Irritabilidade: "+irritabilidade;
  }
}
