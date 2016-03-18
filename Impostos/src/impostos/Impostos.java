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
public class Impostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contribuinte[] contentor = new Contribuinte[10];
        
        Desempregado d1 = new Desempregado("José","Rua 20",500,12);
        contentor[0] = d1;
        Desempregado d2 = new Desempregado("Ana","Rua 50",100,6);
        contentor[1] = d2;
        
        Reformado r1 = new Reformado("António","Travessa 10",100,1000);
        contentor[2] = r1;
        Reformado r2 = new Reformado("Lurdes","Travessa 70",50,700);
        contentor[3] = r2;
        
        TContProp cp1 = new TContProp("João","Avenida 25",30,1300);
        contentor[4] = cp1;
        TContProp cp2 = new TContProp("Anabela","Avenida 80",15,650);
        contentor[5] = cp2;
        
        TContOutrem co1= new TContOutrem("Luís","Largo 40",150,950);
        contentor[6] = co1;
        TContOutrem co2= new TContOutrem("Sara","Largo 90",250,1250);
        contentor[7] = co2;
        
        System.out.println("Listagem de todos os contribuintes e respectivo imposto extraordinário:");
        System.out.println();
        for(int i = 0 ; i < contentor.length ; i++)
        {
            if (contentor[i]!=null)
            {
                System.out.println(contentor[i]);
                System.out.println("Imposto a pagar (em €): " + contentor[i].calculaImposto());
                System.out.println();
            }
        }
        
        System.out.println("Listagem dos contribuintes desempregados e respectivo imposto extraordinário:");
        System.out.println();
        for(int i = 0 ; i < contentor.length ; i++)
        {
            if (contentor[i] instanceof Desempregado)
            {
                System.out.println(contentor[i]);
                System.out.println("Imposto a pagar (em €): " + contentor[i].calculaImposto());
                System.out.println();
            }
        }
    }
    
}
