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
public class Desempregado extends Contribuinte{

    private float taxaOR = 0.02f;
    private int mesesDesempregado;
    
    private static final int MESES_DESEMPREGADO_POR_OMISSAO = 0;

    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesDesempregado)
    {
        super(nome, morada, outrosRendimentos);
        this.mesesDesempregado = mesesDesempregado;
    }
    
    public Desempregado()
    {
        super();
        this.mesesDesempregado =MESES_DESEMPREGADO_POR_OMISSAO;
    }
    
    public float getTaxaOR() {
        return taxaOR;
    }
    
    public int getMesesDesempregado() {
        return mesesDesempregado;
    }
    
    public void setTaxaOR(float TaxaOR) {
        taxaOR = TaxaOR/100;
    }
    
    public void setMesesDesempregado(int MesesDesempregado) {
        mesesDesempregado = MesesDesempregado;
    }
    
    @Override
    public float calculaImposto() {
        return getOutrosRendimentos() * getTaxaOR();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nMeses no desemprego: " + getMesesDesempregado();
    }
    
}
