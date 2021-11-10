package DAO;

import Model.Cliente;
import Model.Mensagem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MensagemDAO {

    public MensagemDAO() {
    }

    List<Mensagem> lista = new ArrayList<>();
    public List<Mensagem> listarMensagens(Cliente cliente) {
        return lista;
    }
    public List<Mensagem> cadastrarMensagens(Long id, Cliente cliente, String pergunta) {
        Mensagem nova = new Mensagem(id,cliente.getId(),pergunta);
        lista.add(nova);

        return lista;
    }
    File arquivo = new File("logs.txt");


}
