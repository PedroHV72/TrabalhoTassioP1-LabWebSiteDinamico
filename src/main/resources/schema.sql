CREATE TABLE produto (
     id                        INT           NOT NULL,
     nome                      VARCHAR(40)   NOT NULL,
     descricao                 VARCHAR(300),
     fotoUrl                   VARCHAR(1000),
     dataCadastro              DATE,
     valorUnitario             FLOAT(5.2)
);