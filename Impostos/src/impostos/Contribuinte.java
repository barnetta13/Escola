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
public abstract class Contribuinte {
    
    private String nome;
    private String morada;   
    private float outrosRendimentos;
    
    private static final String NOME_POR_OMISSAO = "N/A";
    private static final String MORADA_POR_OMISSAO = "N/A";
    private static final float OUTROS_RENDIMENTOS_POR_OMISSAO = 0;
    
    
    public Contribuinte(String nome, String morada, float outrosRendimentos)
    {
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = outrosRendimentos;  
    }
    
    public Contribuinte()
    {
        this.nome = NOME_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
        this.outrosRendimentos = OUTROS_RENDIMENTOS_POR_OMISSAO;    
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + "\nMorada: " + getMorada() + "\nOutros Rendimentos: " + getOutrosRendimentos();
    }
    
    public abstract float calculaImposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }
    
    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }
    
}
