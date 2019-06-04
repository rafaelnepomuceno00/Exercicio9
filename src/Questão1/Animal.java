/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;


public class Animal {
    private String NomeAnimal;
    
    public String getNomeAnimal(){
    return this.NomeAnimal;
    }
    public void setNomeAnimal(String n){
    this.NomeAnimal = n;
    }
    public void imprime(){
        System.err.println("nome" +this.getNomeAnimal());
    }
    
    void talk(){}
}   
