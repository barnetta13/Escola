package figuras_equals;

import java.util.ArrayList;

public class TesteFiguras {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);  
        
    }

    private static void listarFor(ArrayList<Figura> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Figura figura = lista.get(i);

            System.out.printf("%s Área: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }

    private static void listarForEach(ArrayList<Figura> lista) {
        for (Figura figura : lista) {
            System.out.printf("%s Área: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }

}
