/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

/**
 *
 * @author rafae
 */
public class Teste {
     public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("A", "Rua x,xxx, x", "xxxx");
        
        Fornecedor f1 = new Fornecedor("B", "Rua y,yyy","yyyyy", 1000.00, 700.00);
        f1.obterSaldo(0);
        
        Empregado e1 = new Empregado("C", "Rua z, zz,", "zzzz", "z18", 1000.00,20.00);
        e1.CalcularSalario(0);
        
        Administrador a1 = new Administrador("D", "Rua W, W WWW", "wwww", "w13", 10000.00, 10.00, 200.00);
        a1.CalcularSalario(0);
        
        Operario o1;
         o1 = new Operario("E", "Rua V, vv, vvv", "vvvv", "v3", 1000.00, 20.00, 3000.00, 40.00);
        o1.CalcularSalario(0, 0);
    }   
}
