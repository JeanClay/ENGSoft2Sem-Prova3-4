package Model;

import java.util.List;

public class Mensagem {
    private Long id;
    private Long idCliente;
    private String Mensagem;

    public Mensagem() {
    }

    public Mensagem(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Mensagem(Long id, Long idCliente, String mensagem) {
        this.id = id;
        this.idCliente = idCliente;
        Mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }

    @Override
    public String toString() {
        return id + ";" + idCliente + ";" + Mensagem + "\n";
    }
}
