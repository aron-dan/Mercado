package Mercado;

public class Biscoito extends Produto {
  public Integer compCancer;

  public Biscoito(String nome, Double preco, Integer compCancer){
    super(nome, preco);
    this.compCancer = compCancer;
  }

  public Integer getCompCancer() {
    return compCancer;
  }

  public void setCompCancer(Integer compCancer) {
    this.compCancer = compCancer;
  }

  @Override
  public String toString(){
    return "Produto: Biscoito, Preço: "+getPreco()+"Componentes Cancerigenos: "+compCancer;
  }

}
