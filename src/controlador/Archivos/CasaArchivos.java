/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Archivos;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import modelo.Casa;

/**
 *
 * @author santi
 */
public class CasaArchivos extends DaoImplement<Casa>{
    private DynamicList<Casa> casas;
    private Casa casa;

    public CasaArchivos() {
        super(Casa.class);
    }

    public DynamicList<Casa> getCasas() {
        casas = all();
        return casas;
    }

    public void setCasas(DynamicList<Casa> personas) {
        this.casas = personas;
    }

    public Casa getCasa() {
        if (casa == null) {
            casa = new Casa();
        }
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    public Boolean persist(){
        casa.setId(all().getLength() + 1);
        return persist(casa);
    }
}
