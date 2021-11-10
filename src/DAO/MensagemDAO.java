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

    File arquivo = new File("mensagens.txt");

    public void escreverArquivo(List<String> mensagens){
        int i ;
        if (!arquivo.isFile()) {
            try {
                this.arquivo.createNewFile();
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        }
        try {
            FileWriter writer = new FileWriter("mensagens.txt");
            PrintWriter escreve = new PrintWriter(writer);
            for(i = 0; i < mensagens.size();i++){
                escreve.println(mensagens.get(i));
            }
            writer.close();
        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }
    public List<Mensagem> lerArquivo() throws IOException {
        List<Mensagem> listaDeMensagens = new ArrayList<>();
        List<String> listaDoArquivo;
        if (arquivo.isFile()){
            Path path = Paths.get("mensagens.txt");
            listaDoArquivo = Files.readAllLines(path);
            for (int i = 0; i < listaDoArquivo.size(); i++) {
                listaDeMensagens.add(new Mensagem(Long.parseLong(listaDoArquivo.get(i))));
            }

        }
        return listaDeMensagens;
    }
}
