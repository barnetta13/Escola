/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author Daniel
 */
public class Bolseiro extends Aluno implements Pagamento{
    
    private float bolsaMensal;
    
    private static final float BOLSA_MENSAL_POR_OMISSAO = 0;
    
    public Bolseiro(String nome, int matricula, float bolsa)
    {
        super(nome,matricula);
        this.bolsaMensal = bolsa;
    }
    
    public Bolseiro()
    {
        super();
        this.bolsaMensal = BOLSA_MENSAL_POR_OMISSAO;
    }

    public float getBolsaMensal() {
        return bolsaMensal;
    }

    public void setBolsaMensal(float bolsaMensal) {
        this.bolsaMensal = bolsaMensal;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nBolsa Mensal: " + bolsaMensal;
    }

    @Override
    public float calculaPagamento() {
        return bolsaMensal;
    }
}
