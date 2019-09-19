/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprovardespesa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gabri
 */
public class AprovarDespesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AprovadorDiretor diretor = new AprovadorDiretor(null);
        AprovadorCoordenador coordenador = new AprovadorCoordenador(diretor);
        AprovadorGerente gerente = new AprovadorGerente(coordenador);
        AprovadorSupervisor supervisor = new AprovadorSupervisor(gerente);
        
        try
        {
            while (true)
            {
                System.out.print("Digite o valor a ser aprovado: ");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                supervisor.aprovarDespesa(new Despesa(d, "Viagem"));
                System.out.print("\n");
            }
        } catch (IOException | NumberFormatException e)
        {
            System.exit(1);
        }
    }  
}
