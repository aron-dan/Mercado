package Mercado;

import java.util.ArrayList;
import java.util.List;

public class ItemVenda {
  private List<ItemVenda> item = new ArrayList<>();
  private Integer numero = null;
  private String nome;
  private Double valor;
  private Integer quantidade;

  public ItemVenda(){

  }

  public ItemVenda(Integer numero, String nome, Double valor, Integer quantidade){
    this.numero = numero;
    this.nome = nome;
    this.valor = valor;
    this.quantidade = quantidade;
  }


public double subtotal(){
  return quantidade*valor;
}

@Override
public String toString(){
  return numero + " - " +nome+" R$"+valor+" x "+quantidade+" = R$"+subtotal();
}






  public Integer getNumero(){
    return numero;
  }

  public void setNumero(Integer numero){
    this.numero = numero;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Double getValor(){
    return valor;
  }

  public void setValor(Double valor){
    this.valor = valor;
  }

  public Integer getQuantidade(){
    return quantidade;
  }

  public void setQuantidade(Integer quantidade){
    this.quantidade = quantidade;
  }
}
