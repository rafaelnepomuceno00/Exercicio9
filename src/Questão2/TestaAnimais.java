/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;
import Questão1.Papagaio;
import Questão1.Arara;
import Questão1.Cachorro;
import Questão1.Vaca;

public class TestaAnimais {
 public static void main(String[] args) {
        Papagaio p1 = new Papagaio("Loro", true, "Biscoito!");
        p1.imprime();
        p1.talk();
        
        Arara a1 = new Arara("Ara", true);
        a1.imprime();
        a1.talk();
        
        Cachorro c1 = new Cachorro("Hunter", 4, true);
        c1.imprime();
        c1.talk();
        
        Vaca v1 = new Vaca("Pachola", 4, true);
        v1.imprime();
        v1.talk();
    }   
}
