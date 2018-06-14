/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Qwerty
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        
        FuncHorista H = new  FuncHorista(1, "H", 10, 100);
        FuncMensalista M = new FuncMensalista(2, "M", 40, 2000);
        FuncComissao C = new FuncComissao(3, "C", 0, 5000, 100);
        
        lista.add(H);
        lista.add(M);
        lista.add(C);
        
        /*for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimirSalario();
        }*/
        
        System.out.println("calcSalario- versão 1 -> " + C.CalcSalario());
        System.out.println("calcSalario- versão 2 -> " + ((FuncComissao)C).CalcSalario(1000, 5));
        System.out.println("calcSalario- versão 3 -> " + ((FuncComissao)C).CalcSalario(1200));
        
        
        Impostos.deduzirImposto(M);
        Impostos.adicionalObrigatorio(C);
        
        
        
        
    }
    
}
