package enumeracao11.classes;

public class Cliente {
    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                ", tipo=" + tipoCliente.getNome() +
                ", numero="+ tipoCliente.getTipo() +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente gettipoCliente() {
        return tipoCliente;
    }

    public void settipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
