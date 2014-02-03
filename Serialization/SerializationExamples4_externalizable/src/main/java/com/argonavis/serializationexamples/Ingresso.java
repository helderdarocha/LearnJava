/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argonavis.serializationexamples;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author helderdarocha
 */
class Ingresso implements java.io.Externalizable {
    private int numero;

    public Ingresso() {}
    
    public Ingresso(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "numero=" + numero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingresso other = (Ingresso) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readObject();
    }
    
    
}
