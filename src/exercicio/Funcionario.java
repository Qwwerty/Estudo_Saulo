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
abstract public class Funcionario {
    
    public Funcionario(int codigo, String nome, double cargaHoraria){
        setCodigo(codigo);
        setNome(nome);
        setCargaHorario(cargaHorario);
    }
    
    
    private int codigo;
    private String nome;
    private double cargaHorario;
    
    abstract public double  CalcSalario();
    
    public void imprimirSalario(){
        System.out.println("Funcionário " + nome + " salário " + CalcSalario());
    }
    
    //================================GET===============================

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getCargaHorario() {
        return cargaHorario;
    }
    
    
    //===============================SET================================

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHorario(double cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
    
}
