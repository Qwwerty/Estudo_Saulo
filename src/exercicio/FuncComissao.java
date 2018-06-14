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
public class FuncComissao extends Funcionario implements CLT, HomeOffice{
    
    private double valorBase;
    private double PercComissao;

    public FuncComissao(int codigo, String nome, double cargaHoraria, double valorBase, double PercComissao) {
        super(codigo, nome, cargaHoraria);
        setValorBase(valorBase);
        setPercComissao(PercComissao);
    }

    
    public double CalcSalario(){
        
        return valorBase * (PercComissao / 100); 
    }
    
    //SobreCarga
    public double CalcSalario(double v, double p){
        return v* (p/100);
    }
    
    public double CalcSalario(double fixo){
        return fixo + CalcSalario();
    }
    
    
    //=======================SET===============================

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void setPercComissao(double PercComissao) {
        this.PercComissao = PercComissao;
    }
    
    
    //=========================GET=============================

    public double getValorBase() {
        return valorBase;
    }

    public double getPercComissao() {
        return PercComissao;
    }
    
    //========================================================
    //Interface

    @Override
    public double calcINSS() {
        return CalcSalario() *0.09;
    }

    @Override
    public double calcFundoGarantia() {
        return 0;
    }

    @Override
    public double calcIR(double aliquota) {
        return 0;
    }

    @Override
    public double addCustos(double hora, double kLwHora) {
        return hora * kLwHora;
    }

    @Override
    public void imprimirDados() {
        System.out.println(getNome() + ": " + CalcSalario() );
    }
    
    
}


