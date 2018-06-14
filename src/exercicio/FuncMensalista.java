/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author Qwerty
 */
public class FuncMensalista extends Funcionario implements CLT{
   
    private double salarioBase;

    public FuncMensalista(int codigo, String nome, double cargaHoraria, double salarioBase) {
        super(codigo, nome, cargaHoraria);
        setSalarioBase(salarioBase);
    }
    
    public double CalcSalario() {    
        return salarioBase;
    }
 
    
    
    //==========================SET===============================

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    //===========================GET==============================

    public double getSalarioBase() {
        return salarioBase;
    }
    
    //============================================================
    //Interface

    @Override
    public double calcINSS() {
        return salarioBase * 0.09;
    }

    @Override
    public double calcFundoGarantia() {
        if(salarioBase > 1000)
            return salarioBase * 0.12;
        else
            return salarioBase;
    }

    @Override
    public double calcIR(double aliquota) {
        return (salarioBase - calcINSS() * (aliquota / 100));
    }
    
    
}
