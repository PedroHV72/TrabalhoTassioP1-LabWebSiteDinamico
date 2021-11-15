INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (1, 'Hórus', 'Pré treino', '', '2021-09-27', '59.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (2, 'Whey', '100% Proteína', '', '2021-09-27', '109.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (3, 'Barra Cereal', 'Totalmente proteica', '', '2021-09-27', '4.90');

INSERT INTO usuario(id, nome, email, senha)
VALUES (1, 'Pedro', 'a@a.com', '123');

INSERT INTO usuario(id, nome, email, senha)
VALUES (2, 'Max Titanium', 'b@b.com', '456');

INSERT INTO cliente(cpf, usuarioId)
VALUES ('72', 1);

INSERT INTO fornecedora(cnpj, usuarioId)
VALUES ('99', 2)