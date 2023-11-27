/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enumeraciones.TipoCasa;

/**
 *
 * @author santi
 */
public class Casa {
    private Integer id;
    private String direccion;
    private TipoCasa tipoCasa;
    private Area area;

    public Casa(Integer id, String direccion, TipoCasa tipoCasa, Area area) {
        this.id = id;
        this.direccion = direccion;
        this.tipoCasa = tipoCasa;
        this.area = area;
    }

    public Casa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public TipoCasa getTipoCasa() {
        return tipoCasa;
    }

    public void setTipoCasa(Integer index) {
        if (index == 0) {
            tipoCasa = TipoCasa.CONCRETO;
        }else if(index == 1){
            tipoCasa = TipoCasa.LADRILLO;
        }else{
            tipoCasa = TipoCasa.MADERA;
        }
    }
    
}
