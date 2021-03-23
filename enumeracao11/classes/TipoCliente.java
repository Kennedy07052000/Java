package enumeracao11.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int tipo;
    private String nome;
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    //Não criamos o SET, pois a pesssoa pode colocar valores diferents de 1 e 2
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
