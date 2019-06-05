/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;


public class Mamifero extends Animal{
    private int Patas;

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int p) {
        this.Patas = p;
    }

    public Mamifero(String n, int p) {
        super(n);
        this.setPatas(p);
    }
}
