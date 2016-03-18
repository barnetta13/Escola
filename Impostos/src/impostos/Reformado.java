/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos;

/**
 *
 * @author Daniel
 */
public class Reformado extends ContComRT{
    
    private float taxaRT = 0.01f;
    private float taxaOT = 0.03f;

    public Reformado(String nome, String morada, float outrosRendimentos, float rendimentoTrabalho)
    {
        super(nome,morada,outrosRendimentos,rendimentoTrabalho);
    }
    
    public Reformado()
    {
        super();
    }
    
    @Override
    public float getTaxaRT() {
        return taxaRT;
    }

    @Override
    public float getTaxaOR() {
        return taxaOT;
    }

    public void setTaxaRT(float taxaRT) {
        this.taxaRT = taxaRT;
    }

    public void setTaxaOT(float taxaOT) {
        this.taxaOT = taxaOT;
    }
    
}
