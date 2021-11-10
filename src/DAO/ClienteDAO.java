package DAO;

import Model.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteDAO {

    public ClienteDAO() {
    }

    File arquivo = new File("clientes.txt");

    public void escreveArquivo(List<Cliente> clientes){
        int i ;
        if (!arquivo.isFile()) {
            try {
                this.arquivo.createNewFile();
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        }
        try {
            FileWriter writer = new FileWriter("clientes.txt");
            PrintWriter escreve = new PrintWriter(writer);
            for(i = 0; i < clientes.size();i++){
                escreve.println(clientes.get(i));
            }
            writer.close();
        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }
    public List<Cliente> lerArquivo() throws IOException {
        List<Cliente> listaDeClientes = new ArrayList<>();
        List<String> listaDoArquivo = new ArrayList<>();
        if (arquivo.isFile()){
            Path path = Paths.get("clientes.txt");
            listaDoArquivo = Files.readAllLines(path);
            for (int i = 0; i < listaDoArquivo.size(); i++) {
                listaDeClientes.add(new Cliente(Long.parseLong(listaDoArquivo.get(i))));
            }

        }
        return listaDeClientes;
    }

}

