package View;

import Controller.ClienteController;
import DAO.ClienteDAO;
import Model.Cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteView {
    ClienteController controller = new ClienteController();
    ClienteDAO dao = new ClienteDAO();
    MensagemView mensagens = new MensagemView();
    List<Cliente> clientes = new ArrayList<>();

    public void menuInicial() throws IOException {

        this.clientes = dao.lerArquivo();
        while (true) {
            System.out.println("1 - Listar Clientes");
            System.out.println("2 - Selecionar Cliente");
            System.out.println("3 - Cadastrar um Cliente");

            Scanner ler = new Scanner(System.in);

            int escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    listarClientes();
                    break;
                case 2:
                    selecionarCliente();
                    break;
                case 3:
                    cadastrarCliente();
                    break;
                default:
                    return;
            }
        }
    }
    public void listarClientes() throws IOException {
        clientes = controller.listarClientes();
        System.out.println(clientes);
    }
    public void selecionarCliente() throws IOException {
        System.out.print(clientes);
        Scanner ler = new Scanner(System.in);
        int escolha = ler.nextInt();
        mensagens.menu(controller.selecionarCliente(escolha));
    }
    public void cadastrarCliente() {
        Scanner ler = new Scanner(System.in);
        long id = ler.nextLong();
        controller.cadastrarCliente(this.clientes, id);
    }

}
