package View;

import Controller.MensagemController;
import Model.Cliente;

import java.io.IOException;
import java.util.Scanner;

public class MensagemView {
    MensagemController controller = new MensagemController();

    public void menu(Cliente cliente) {
        while (true) {
            System.out.println("1 - Cadastrar Perguntas");
            System.out.println("2 - Listar Pergunta");
            Scanner ler = new Scanner(System.in);
            int escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    cadastrarPergunta(cliente);
                    break;
                case 2:
                    listarPerguntas(cliente);
                    break;
                default:
                    return;
            }
        }

    }

    public void listarPerguntas(Cliente cliente) {
        System.out.println(controller.listarMensagens(cliente));
    }

    private void cadastrarPergunta(Cliente cliente) {
        Scanner ler = new Scanner(System.in);
        System.out.println("ID da pergunta");
        Long id = ler.nextLong();
        System.out.println("Pergunta");
        String pergunta = ler.nextLine();
        controller.cadastrarMensagens(id,cliente,pergunta);
    }
}
