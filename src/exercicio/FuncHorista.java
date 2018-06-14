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
public class FuncHorista extends Funcionario{

    private double valorHora;

    public FuncHorista(int codigo, String nome, double cargaHoraria, double valorHora) {
        super(codigo, nome, cargaHoraria);
        setValorHora(valorHora);
    }
    
    @Override
    public double CalcSalario() {
        return valorHora * getCargaHorario();
    }
    
    //============================SET===============================

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    //============================GET===============================

    public double getValorHora() {
        return valorHora;
    }
    
    
}
