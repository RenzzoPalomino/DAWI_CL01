package com.cl1.palomino.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_autos")
public class Autos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_Auto")
	private Integer codigo;
	@Column(name="descripcion_Auto")
	private String descripcion;
	@Column(name="precio_Auto")
	private Double precio;
	@Column(name="stock_auto")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name="codigo_Marca")
	private Marca marca;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	//
	
	
	
}
