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
public abstract class ContComRT extends Contribuinte {
    
    private float rendimentoTrabalho;
    
    private static final float RENDIMENTO_TRABALHO_POR_OMISSAO = 0;
    
    
    public ContComRT(String nome, String morada, float outrosRendimentos, float rendimentoTrabalho)
    {
        super(nome,morada,outrosRendimentos);
        this.rendimentoTrabalho = rendimentoTrabalho;
        
    }
    
    public ContComRT()
    {
        super();
        this.rendimentoTrabalho = RENDIMENTO_TRABALHO_POR_OMISSAO;
    }
    
    public float getRendimentoTrabalho() {
        return rendimentoTrabalho;
    }

    public void setRendimentoTrabalho(float rendimentoTrabalho) {
        this.rendimentoTrabalho = rendimentoTrabalho;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nRendimentos Trabalho: " + getRendimentoTrabalho();    
    }
    
    @Override
    public float calculaImposto()
    {
        float impostoRT = rendimentoTrabalho * getTaxaRT();
        float impostoOR = getOutrosRendimentos() * getTaxaOR();
        return impostoRT + impostoOR ;
    };

    public abstract float getTaxaRT();
    public abstract float getTaxaOR();
}
