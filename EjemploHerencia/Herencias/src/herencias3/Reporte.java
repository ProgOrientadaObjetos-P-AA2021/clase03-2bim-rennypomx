/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Renny
 */
public class Reporte {

    protected String codigo;

    public Reporte(String n) {
        codigo = n;
    }

    public void setCodigo(String n) {
        codigo = n;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", codigo);
        return cadena;
    }

}

