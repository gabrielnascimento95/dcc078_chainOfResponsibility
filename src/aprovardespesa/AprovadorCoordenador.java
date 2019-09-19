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
public class AprovadorCoordenador extends Aprovador {

    public AprovadorCoordenador(Aprovador superior) {
        setAprovadorSuperior(superior);
    }

    
    @Override
    public String getNivelGerencial() {
        return "Coordenador";
    }

    @Override
    public double getValorPermitido() {
        return valorDefault*5;
    }
    
}
