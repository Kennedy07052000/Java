package interfaces13.test;

import interfaces13.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",4, 3000);
        p.calculaimposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
