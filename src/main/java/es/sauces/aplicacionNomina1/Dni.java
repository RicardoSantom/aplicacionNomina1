package es.sauces.aplicacionNomina1;


import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class Dni implements Comparable<Dni>,Serializable{
    private String numero;
    private char letra;

    /**
     *
     */
    public Dni() {
    }

    /**
     *
     * @param numero
     * @param letra
     * @throws DniException
     */
    public Dni(String numero, char letra) throws DniException {
        if(!esValido(numero+letra)){
            throw new DniException("Formato incorrecto DNI");
        }
        this.numero = numero;
        this.letra = letra;
    }

    /**
     *
     * @param dni
     * @throws DniException
     */
    public Dni(String dni) throws DniException {
        if(!esValido(dni)){
            throw new DniException("Formato incorrecto DNI");
        }
        this.numero=(dni.substring(0,8));
        this.letra=(dni.charAt(8));
    }
    
    /**
     *
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public char getLetra() {
        return letra;
    }

    /**
     *
     * @param letra
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numero);
        hash = 47 * hash + this.letra;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dni other = (Dni) obj;
        if (this.letra != other.letra) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Dni o) {
        return this.numero.compareTo(o.numero);
    }
    
    /**
     *
     * @param dni
     * @return
     * @throws DniException
     */
    public static Dni valueOf(String dni) throws DniException{
        return new Dni(dni);
    }

    @Override
    public String toString() {
        return  numero + letra;
    }
    
    /**
     *
     * @param dni
     * @return
     */
    public static boolean esValido(String dni){
        boolean correcto=false;
        int resto;
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        String patron="([0-9]{8})([A-Z])";
        Pattern p=Pattern.compile(patron);
        Matcher m=p.matcher(dni);
        if(m.matches()){
            resto=Integer.parseInt(m.group(1))%23;
            if(letras.charAt(resto) == m.group(2).charAt(0)){
                correcto=true;
            }
        }
        return correcto;
    }
    
}
