package tributaveis;

public class TesteTributaveis {

    public static void main(String[] args) {
        // ponto 2
        Veiculo v1 = new Veiculo("22-33-CC",1000,"encarnado");
        System.out.println(v1);
        // ponto 4
        Veiculo v2 = new Veiculo("44-55-BB",1500,Cores.AZUL);
        System.out.println(v2);
        // ponto 7
        Veiculo v3 = new Veiculo("11-22-BB",1400,Veiculo.VERDE);
        System.out.println(v3);
        // ponto 11
        Moradia m1 = new Moradia("Rua do Bocage",90,Moradia.CINZENTO);
        System.out.println(m1);
        // ponto 12
        Object obj = v1;
        obj = m1;
        
        Cores c = v1;
        c = m1;
        
        Tributavel[] tributaveis = new Tributavel[10];
        tributaveis[0]=v1;
        tributaveis[1]=v2;
        tributaveis[2]=v3;
        tributaveis[3]=m1;
        
        float total = 0;
        
        for ( int i = 0 ; i < tributaveis.length ; i++)
        {
            if (tributaveis[i]!= null)
            {
                total += tributaveis[i].calcularImposto();
            }
        }
        System.out.println("Total= " + total);
    }
    
}
