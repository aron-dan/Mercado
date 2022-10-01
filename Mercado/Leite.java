package Mercado;

public class Leite extends Produto {
  private Integer duracaoDias;

  public Leite(String nome, Double preco, Integer duracaoDias){
    super(nome, preco);
    this.duracaoDias = duracaoDias;
  }

  public Integer getDuracaoDias() {
    return duracaoDias;
  }

  public void setDuracaoDias(Integer duracaoDias) {
    this.duracaoDias = duracaoDias;
  }

  @Override
  public String toString(){
    return "Produto : Leite, Preço: "+getPreco()+",Duração em Dias: "+duracaoDias;
  }
}
