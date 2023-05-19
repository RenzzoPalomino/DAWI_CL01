package com.cl1.palomino.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_marca")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_Marca")
	private Integer codigo;
	@Column(name="nom_Marca")
	private String nombre;
	
	@OneToMany(mappedBy ="marca")
	private List<Autos> listaAutos;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Autos> getListaAutos() {
		return listaAutos;
	}

	public void setListaAutos(List<Autos> listaAutos) {
		this.listaAutos = listaAutos;
	}
	
	//
	
	
	
	
}
