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
public class TContProp extends ContComRT{

    private float taxaRT = 0.03f;
    private float taxaOT1 = 0.02f;
    private float taxaOT2 = 0.05f;
    
    private static int delimitador = 50000;

    public TContProp(String nome, String morada, float outrosRendimentos, float rendimentoTrabalho)
    {
        super(nome,morada,outrosRendimentos,rendimentoTrabalho);
    }
    
    public TContProp()
    {
        super();
    }
    
    @Override
    public float getTaxaRT() {
        return taxaRT;
    }

    @Override
    public float getTaxaOR() {
        if (getOutrosRendimentos() <= delimitador)
        {
            return taxaOT1;
        }
        else
            return taxaOT2;
    }

    public void setTaxaRT(float taxaRT) {
        this.taxaRT = taxaRT/100;
    }

    public void setTaxaOT1(float taxaOT1) {
        this.taxaOT1 = taxaOT1/100;
    }

    public void setTaxaOT2(float taxaOT2) {
        this.taxaOT2 = taxaOT2/100;
    }
    
        public static void setDelimitador(int aDelimitador) {
        delimitador = aDelimitador;
    }
    
}
