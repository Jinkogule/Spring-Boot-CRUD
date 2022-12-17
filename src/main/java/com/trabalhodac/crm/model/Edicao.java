package com.trabalhodac.crm.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Edicao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private int numero;
	@Column
	private int ano;
	@Column
	private String data_inicial;
	@Column
	private String data_final;
	@Column
	private String cidade;
	
	public Edicao(int numero, int ano, String data_inicial, String data_final, String cidade) {
		super();
		this.numero = numero;
		this.ano = ano;
		this.data_inicial = data_inicial;
		this.data_final = data_final;
		this.cidade = cidade;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getData_inicial() {
		return data_inicial;
	}
	public void setData_inicial(String data_inicial) {
		this.data_inicial = data_inicial;
	}
	public String getData_final() {
		return data_final;
	}
	public void setData_final(String data_final) {
		this.data_final = data_final;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edicao other = (Edicao) obj;
		return id == other.id;
	}
}
