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
public class Impostos {
    
    public static double deduzirImposto(CLT objetoCLT){
        return objetoCLT.calcINSS() - objetoCLT.calcFundoGarantia() - objetoCLT.calcIR(10);
    }
    
    public static double adicionalObrigatorio(HomeOffice objetoHomeOffice){
        
       objetoHomeOffice.imprimirDados();
       return objetoHomeOffice.addCustos(8, 12);
    }
    
}
