/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprovardespesa;

/**
 *
 * @author gabri
 */
public abstract class Aprovador {
    protected static final double valorDefault = 300;
    private Aprovador aprovadorSuperior;
    
    public abstract String getNivelGerencial();
    public abstract double getValorPermitido();
    
    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }
    
    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }
    
    public void aprovarDespesa(Despesa despesa){
        if(despesa.getDespesa() < this.getValorPermitido()){
            System.out.println("O " + this.getNivelGerencial() + " irá aprovar a despesa"
                    + "de valor "+despesa.getDespesa() + ".");
        }else{
            if(aprovadorSuperior != null){
                aprovadorSuperior.aprovarDespesa(despesa);
            }else{
                System.out.println("Valor alto demais para ser aprovado.");
            }
        }
    }
}
