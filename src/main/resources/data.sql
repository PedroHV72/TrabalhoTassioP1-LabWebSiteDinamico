INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (1, 'Alloy FPS Pro', 'Teclado mecanico', '', '2021-09-27', '429.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (2, 'G403 Hero 16K', 'Mouse gamer', '', '2021-09-27', '269.90');

INSERT INTO usuario(id, nome, email, senha)
VALUES (1, 'Pedro', 'a@a.com', '123');

INSERT INTO usuario(id, nome, email, senha)
VALUES (2, 'Kabum', 'b@b.com', '456');

INSERT INTO cliente(cpf, usuarioId)
VALUES ('72', 1);

INSERT INTO fornecedora(cnpj, usuarioId)
VALUES ('99', 2)