package Controller;

import DAO.MensagemDAO;
import Model.Cliente;
import Model.Mensagem;

import java.io.IOException;
import java.util.List;

public class MensagemController {
    public MensagemController() {
    }
    MensagemDAO dao = new MensagemDAO();

    public List<Mensagem> listarMensagens(Cliente cliente) {
        return dao.listarMensagens(cliente);
    }

    public void cadastrarMensagens(Long id,Cliente cliente, String pergunta) {
        dao.cadastrarMensagens(id,cliente,pergunta);
    }
}
