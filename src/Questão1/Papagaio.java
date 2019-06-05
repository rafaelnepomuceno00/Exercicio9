/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;


public final class Papagaio extends Ave{
    
   private String Frase;


    public String getFrase() {
        return Frase;
    }

    public void setFrase(String F) {
        this.Frase = F;
    }
 
   @Override
    public void talk(){
        System.out.println(this.getFrase());
    }
    
    
    public Papagaio(String n, boolean v,String f) {
        super(n, v);
        this.setFrase(f);
    }

  

    }
