package DAO;

import Model.Cliente;
import Model.Mensagem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MensagemDAO {

    public MensagemDAO() {
    }

    List<Mensagem> lista = new ArrayList<>();
    public List<Mensagem> listarMensagens(Cliente cliente) {
        return lista;
    }
    public void cadastrarMensagens(Long id, Cliente cliente, String pergunta) {

        lista.add(new Mensagem(id,cliente.getId(),pergunta));

    }
    File arquivo = new File("logs.txt");


}
