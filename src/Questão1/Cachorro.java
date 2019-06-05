/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;


public class Cachorro extends Mamifero{
    
    private boolean LateAlto;
    
    public boolean getLateAlto(){
        return this.LateAlto;
    }
    
    public void setLateAlto(boolean l){
        this.LateAlto = l;
    }
    public void talk(){
        System.out.println("Au, Au");
    }
    
    public boolean isLateAlto(){
        return true;
    }
    public Cachorro(String n, int p, boolean l){
        super(n, p);
        this.setLateAlto(l);
    }
}
