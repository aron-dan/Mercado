package Mercado;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Mercado {

  public static void main(String[] args) {

    Calculos cal = new Calculos();

    List<Shampo> shampo = new ArrayList<>();
    shampo.add(new Shampo("Dove", 15.99, 2));
    shampo.add(new Shampo("Skala", 29.99, 0));
    shampo.add(new Shampo("SaloonLine", 12.99, 4));
    

    List<Biscoito> biscoito = new ArrayList<>();
    biscoito.add(new Biscoito("Trakinas", 1.99, 6));
    biscoito.add(new Biscoito("Baudoco", 3.69, 2));
    biscoito.add(new Biscoito("CreamCkack", 0.99, 0));

    List<Leite> leite = new ArrayList<>();
    leite.add(new Leite("Longa Vida", 5.49, 3));
    leite.add(new Leite("Betim", 3.99, 5));
    leite.add(new Leite("BH", 5.45, 4));


    JOptionPane.showMessageDialog(null,"Media Shampo:"+cal.media(shampo)+
    "\n"+"Media Biscoito: "+cal.media(biscoito)+
    "\n"+"Media Leite: "+cal.media(leite)+
    "\n"+"Shampo Mais Caro: "+cal.maisCaro(shampo)+
    "\n"+"Biscoito Mais Caro: "+cal.maisCaro(biscoito)+
    "\n"+"Leite Mais Caro: "+cal.maisCaro(leite)+
    "\n"+"Sahampo Mais Barato: "+cal.maisBarato(shampo)+
    "\n"+"Biscoito Mais Barato: "+cal.maisBarato(biscoito)+
    "\n"+"Leite Mais Barato: "+cal.maisBarato(leite));
  }

  
}
