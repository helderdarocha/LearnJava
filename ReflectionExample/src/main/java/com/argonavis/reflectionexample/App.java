package com.argonavis.reflectionexample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) 
            throws  ClassNotFoundException, 
                    NoSuchMethodException, 
                    InstantiationException,
                    IllegalAccessException,
                    IllegalArgumentException,
                    InvocationTargetException {
        
        //Class classe = Class.forName("com.argonavis.reflectionexample.ClasseNova");
        Class classe = ClasseNova.class;
        Method metodo = classe.getDeclaredMethod("toString");
        Object o = classe.newInstance(); // cria novo objeto
        
        classe = o.getClass();
        
        System.out.println(metodo.invoke(o));

    }
}
