package org.upiita.spring.formas;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PostForma {
	private Integer id;
	@NotEmpty
	private String titulo;
	@Size(min=5)
	private String contenido;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
