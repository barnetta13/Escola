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
public class TContOutrem extends ContComRT{
    
    private float taxaRT1 = 0.01f;
    private float taxaRT2 = 0.02f;
    private float taxaOR = 0.02f;
    
    private static int delimitador = 30000;
    
    public TContOutrem(String nome, String morada, float outrosRendimentos, float rendimentoTrabalho)
    {
        super(nome,morada,outrosRendimentos,rendimentoTrabalho);
    }
    
    public TContOutrem()
    {
        super();
    }
    
    @Override
    public float getTaxaRT() {
        if(getRendimentoTrabalho() <= delimitador)
        {
            return taxaRT1;
        }
        else
            return taxaRT2;
    }

    @Override
    public float getTaxaOR() {
        return taxaOR;
    }

    public void setTaxaRT1(float taxaRT1) {
        this.taxaRT1 = taxaRT1/100;
    }

    public void setTaxaRT2(float taxaRT2) {
        this.taxaRT2 = taxaRT2/100;
    }

    public void setTaxaOR(float taxaOR) {
        this.taxaOR = taxaOR/100;
    }
    
    public static void setDelimitador(int Delimitador) {
        delimitador = Delimitador;
    }
    
}
