/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;


public class Vaca extends Mamifero{
 private boolean TemLeite;
    
    public boolean getTemLeite(){
       return this.TemLeite;
    }
    
    public void setTemLeite(boolean t){
        this.TemLeite = t;
    }
    
    public boolean xTemLeite(){
        return true;
    }

    public void talk(){
        System.out.println("Muuuuu");
    }
    
    public Vaca(String n, int p, boolean t){
        super(n, p);
        this.setTemLeite(t);
    }   
}
