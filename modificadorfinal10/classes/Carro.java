package modificadorfinal10.classes;

public final class Carro {
    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador(); //variável do tipo reference
    private String nome;
    private String marca;



    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
