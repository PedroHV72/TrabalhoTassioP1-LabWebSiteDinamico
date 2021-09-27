CREATE TABLE produto (
    id                        INT           NOT NULL,
    nome                      VARCHAR(40)   NOT NULL,
    descricao                 VARCHAR(300),
    fotoUrl                   VARCHAR(1000),
    dataCadastro              DATE,
    valorUnitario             FLOAT(5.2)
);

CREATE TABLE usuario (
    id    INT         NOT NULL,
    nome  VARCHAR(40) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(16) NOT NULL
);

CREATE TABLE cliente (
    cpf VARCHAR(11) NOT NULL,
    FOREIGN KEY (usuarioId) REFERENCES usuario(id),
);

CREATE TABLE fornecedora (
    cnpj VARCHAR(14) NOT NULL,
    FOREIGN KEY (usuarioId) REFERENCES usuario(id),
);