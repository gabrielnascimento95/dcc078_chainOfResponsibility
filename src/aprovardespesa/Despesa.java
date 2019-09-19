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
public class Despesa {
    private double despesa;
    private String motivo;

    public Despesa(double despesa, String motivo) {
        this.despesa = despesa;
        this.motivo = motivo;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
