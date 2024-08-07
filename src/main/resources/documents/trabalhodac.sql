CREATE DATABASE trabalhodac;

USE trabalhodac;

CREATE TABLE Usuarios (
    id int,
    login varchar(255),
    email varchar(255),
    nome varchar(255),
    afiliacao varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE Eventos (
    id int,
    nome varchar(255),
    sigla varchar(255),
    descricao varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE Edicoes (
    id int,
    numero varchar(255),
    ano varchar(255),
    data_inicial date,
    data_final date,
    cidade varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE Atividades (
    id int,
    nome varchar(255),
    tipo varchar(255),
    descricao varchar(255),
    data date,
    horario_inicial Time,
    horario_final Time,
    PRIMARY KEY (id)
);

CREATE TABLE Espacos (
    id int,
    nome varchar(255),
    localizacao varchar(255),
    capacidade int,
    recursos varchar(255),
    PRIMARY KEY (id)
);