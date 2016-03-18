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
public class Pessoa {
    
    private String nome;
    
    private static final String NOME_POR_OMISSAO = "N/A";
    
    public Pessoa(String nome)
    {
        this.nome = nome;
    }
    
    public Pessoa()
    {
        this.nome = NOME_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + nome;
    }
    
}
