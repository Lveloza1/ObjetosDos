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

    public Mixto( int entero, int numerador,int denominador) throws DenominadorCeroException{
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
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

    public Mixto sumar(Mixto f2)throws DenominadorCeroException {
        int num1, den1, num2, den2, ntotal, num, den, ent, dtotal;
        Mixto f;

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        ntotal = (num1 * den2) + (den1 * num2);
        dtotal = den1 * den2;

        ent = ntotal / dtotal;
        num = ntotal % ent;
        den = dtotal;

        f = new Mixto(ent, num, den);
        return f;

    }

    public Mixto restar(Mixto f2)throws DenominadorCeroException {
        int num1, den1, num2, den2, ntotal, num, den, ent, dtotal;
        Mixto f;

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        ntotal = (num1 * den2) - (den1 * num2);
        dtotal = den1 * den2;

        
        ent = ntotal / dtotal;
        num = ntotal % ent;
        den = dtotal;

        f = new Mixto(ent, num, den);
        return f;

    }

    public Mixto multiplicar(Mixto f2)throws DenominadorCeroException {
        int num1, den1, num2, den2, ntotal, num,den, ent, dtotal;
        Mixto f;

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        ntotal = (num1 * num2);
        dtotal = (den1 * den2);

        ent = ntotal / dtotal;
        num = ntotal % ent;
        den= dtotal;

        f = new Mixto(ent, num, dtotal);
        return f;

    }
    
    public Mixto dividir(Mixto f2)throws DenominadorCeroException {
        int num1, den1, num2, den2, ntotal, num, den, ent, dtotal;
        Mixto f;

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        ntotal = (num1 * den2);
        dtotal = (den1 * num2);

        ent = ntotal / dtotal;
        num = ntotal % ent;
        den = dtotal;

        f = new Mixto(ent, num, den);
        return f;

    }

}
