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
public class Professor extends Pessoa implements Pagamento
{
    private Professor categoria;
    
    private static Professor assistente;
    private static Professor adjunto;
    private static Professor coordenador;
    
    private static float taxaAdjunto = 1.20f;
    private static float taxaCoordenador = 1.50f;
    private static float vencimentoAssistente = 1500;
    private static float vencimentoAdjunto = vencimentoAssistente * taxaAdjunto;
    private static float VencimentoCoordenador = vencimentoAssistente * taxaCoordenador;
    
    private static final Professor CATEGORIA_POR_OMISSAO = assistente;
    
    
    public Professor(String nome, Professor categoria)
    {
        super(nome);
        this.categoria = categoria;
    }
    
    public Professor()
    {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }

    public Professor getCategoria() {
        return categoria;
    }

    public void setCategoria(Professor categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nCategoria: " + categoria;
    }

    @Override
    public float calculaPagamento() {
        
    }
}
