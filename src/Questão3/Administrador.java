/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

public class Administrador extends Empregado{    
    private double AjudadeCusto;
    
    public double getAjudadeCusto(){
    return this.AjudadeCusto;
    }
    
    public void setAjudadeCusto(double a){
    this.AjudadeCusto = a;
    }
    
    public Administrador(String n, String e, String t, String c, double b, double i, double a){
    super(n, e, t, c, b, i);
    this.setAjudadeCusto(a);
    }
    
    public double CalcularSalario(double s){
    s = this.getSalarioBase() + this.AjudadeCusto -(((this.getSalarioBase()+this.AjudadeCusto)/100)*this.getImposto());
    return s;
    }
}
