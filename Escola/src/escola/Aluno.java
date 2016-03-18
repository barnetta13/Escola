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
public class Aluno extends Pessoa{
    
    private int numeroMatricula;
    
    private static final int NUMERO_MATRICULA_POR_OMISSAO = 0;
    
    public Aluno(String nome, int matricula)
    {
        super(nome);
        this.numeroMatricula = matricula;
    }
    
    public Aluno()
    {
        super();
        this.numeroMatricula = NUMERO_MATRICULA_POR_OMISSAO;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nNúmero Matrícula: " + numeroMatricula;
    }
}
