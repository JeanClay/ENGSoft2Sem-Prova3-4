package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private long id;
    private List<Mensagem> mensagens = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
