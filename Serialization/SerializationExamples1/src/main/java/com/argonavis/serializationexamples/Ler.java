package com.argonavis.serializationexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Hello world!
 *
 */
public class Ler {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Lendo!");
        File pasta = new File("/Users/helderdarocha/arquivos");
        File pessoa = new File(pasta, "Pessoa_1.prod");
        FileInputStream fis = new FileInputStream(pessoa);
        ObjectInputStream in = new ObjectInputStream(fis);
        
        Pessoa p = (Pessoa)in.readObject();
        in.close();
        
        System.out.println("Resultado: " + p);

    }
}
