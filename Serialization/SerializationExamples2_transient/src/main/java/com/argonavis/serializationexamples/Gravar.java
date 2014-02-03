package com.argonavis.serializationexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 *
 */
public class Gravar {

    public static void main(String[] args) throws IOException {
        System.out.println("Gravando!");
        File pasta = new File("/Users/helderdarocha/arquivos");
        File pessoa = new File(pasta, "Pessoa_1.prod");
        FileOutputStream fos = new FileOutputStream(pessoa);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        
        Pessoa p = new Pessoa("Marilyn", 22);
        Endereco e = new Endereco("East St.", 123);
        Ingresso i = new Ingresso(123);
        p.setIngresso(i);
        p.setEndereco(e);
        
        out.writeObject(p);
        out.close();

    }
}
