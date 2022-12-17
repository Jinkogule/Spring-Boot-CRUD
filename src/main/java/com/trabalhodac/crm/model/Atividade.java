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
public class Atividade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nome;
	@Column
	private String tipo;
	@Column
	private String descricao;
	@Column
	private String data;
	@Column
	private String horario_inicial;
	@Column
	private String horario_final;
	
	public Atividade(String nome, String tipo, String descricao, String data, String horario_inicial, String horario_final) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.data = data;
		this.horario_inicial = horario_inicial;
		this.horario_final = horario_final;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario_inicial() {
		return horario_inicial;
	}
	public void setHorario_inicial(String horario_inicial) {
		this.horario_inicial = horario_inicial;
	}
	public String getHorario_final() {
		return horario_final;
	}
	public void setHorario_final(String horario_final) {
		this.horario_final = horario_final;
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
		Atividade other = (Atividade) obj;
		return id == other.id;
	}
}
