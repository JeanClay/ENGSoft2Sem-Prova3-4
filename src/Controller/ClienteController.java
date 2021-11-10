package Controller;

import DAO.ClienteDAO;
import Model.Cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    ClienteDAO dao = new ClienteDAO();
    List<Cliente> lista = new ArrayList<>();
    public List<Cliente> listarClientes() throws IOException {

        lista = dao.lerArquivo();

        return lista;
    }
    public Cliente selecionarCliente(int escolha) throws IOException {
        lista = dao.lerArquivo();
        for (int i = 0 ; i < lista.size() ; i++){
            if (escolha == lista.get(i).getId())return lista.get(i);
        }return null;
    }
    public void cadastrarCliente(List<Cliente> clientes, long id){
        int i;
        Cliente novo = new Cliente(id);
        for (i = 0; clientes.size() > i ; i++){
            if (clientes.get(i).getId() == id){
                System.out.println("ID existente");
                return;
            }
        }
        clientes.add(novo);
        dao.escreveArquivo(clientes);
    }


}
