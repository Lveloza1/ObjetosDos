/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Mixto {
    private int numerador;
    private int denominador;
    private int entero;

    public Mixto(int numerador, int denominador, int entero){ 
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
}

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
     public Mixto sumar(Mixto f2){
        Mixto f;
        int num, den;
        num = this.numerador * f2.denominador + this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Mixto (num, den);
       

    }
    
    
}
