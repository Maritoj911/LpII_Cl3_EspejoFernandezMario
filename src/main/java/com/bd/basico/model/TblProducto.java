package com.bd.basico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTOCL3")
public class TblProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproductocl3;

    private String nombrecl3;
    private double precioventacl3;
    private int stock;
    private double preciocompcl3;
    private String estadocl3;
    private String descripcl3;

    public TblProducto() {
    }

    public int getIdproductocl3() {
        return this.idproductocl3;
    }

    public void setIdproductocl3(int idproductocl3) {
        this.idproductocl3 = idproductocl3;
    }

    public String getNombrecl3() {
        return this.nombrecl3;
    }

    public void setNombrecl3(String nombrecl3) {
        this.nombrecl3 = nombrecl3;
    }

    public double getPrecioventacl3() {
        return this.precioventacl3;
    }

    public void setPrecioventacl3(double precioventacl3) {
        this.precioventacl3 = precioventacl3;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPreciocompcl3() {
        return this.preciocompcl3;
    }

    public void setPreciocompcl3(double preciocompcl3) {
        this.preciocompcl3 = preciocompcl3;
    }

    public String getEstadocl3() {
        return this.estadocl3;
    }

    public void setEstadocl3(String estadocl3) {
        this.estadocl3 = estadocl3;
    }

    public String getDescripcl3() {
        return this.descripcl3;
    }

    public void setDescripcl3(String descripcl3) {
        this.descripcl3 = descripcl3;
    }

	@Override
	public String toString() {
		return "TblProducto [idproductocl3=" + idproductocl3 + ", nombrecl3=" + nombrecl3 + ", precioventacl3="
				+ precioventacl3 + ", stock=" + stock + ", preciocompcl3=" + preciocompcl3 + ", estadocl3=" + estadocl3
				+ ", descripcl3=" + descripcl3 + "]";
	} //fin del metodo toString
	
    
    
}