package Mercado;

import java.util.List;

public class Calculos {
  public double media(List<? extends Produto>list){
    double soma = 0;
    for(int i = 0;i<list.size();i++){
      soma += list.get(i).getPreco();
    }
    return soma/list.size();
  }

  public double maisCaro(List<? extends Produto>list){
    double maisCaro = list.get(0).getPreco();
    for(int i=0;i<list.size();i++){
      if(list.get(i).getPreco()>maisCaro){
        maisCaro = list.get(i).getPreco();
      }
    }
    return maisCaro;
  }

  public double maisBarato(List<? extends Produto>list){
    double maisBarato = list.get(0).getPreco();
    for(int i=0;i<list.size();i++){
      if(list.get(i).getPreco()<maisBarato){
        maisBarato = list.get(i).getPreco();
      }
    }
    return maisBarato;
  }
}
