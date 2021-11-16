INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (1, 'Hórus', 'Pré treino', 'https://a-static.mlcdn.com.br/618x463/pre-treino-horus-300g-frutas-vermelhas-max-titanium/rafanutrysuplementos/f92f921cebd111eb93964201ac18500e/4481cb9c9d6dc0aba97e6c2cbc3f1e82.jpg', '2021-09-27', '59.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (2, 'Whey', '100% Proteína', 'https://d2vq4s943o8cb4.cloudfront.net/Custom/Content/Products/50/62/5062966_100-whey-protein-max-titanium-4443_m2_637437988317010154.png', '2021-09-27', '109.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, valorUnitario)
VALUES (3, 'Barra Proteica', 'Totalmente proteica', 'https://cdn.awsli.com.br/1000x1000/151/151011/produto/109639846/ad2fd5072c.jpg', '2021-09-27', '4.90');

INSERT INTO usuario(id, nome, email, senha, fotoUrl)
VALUES (1, 'Caike Pro', 'a@a.com', '123', 'https://esportefitness.com/wp-content/uploads/2020/12/Caike-Pro.jpeg');

INSERT INTO usuario(id, nome, email, senha, fotoUrl)
VALUES (2, 'Ângela Borges', 'b@b.com', '456', 'https://protanbr.com.br/wp-content/uploads/2021/05/Design-sem-nome.png');

INSERT INTO usuario(id, nome, email, senha, fotoUrl)
VALUES (3, 'Julio Balestrin', 'c@c.com', '789', 'https://lojamaxtitanium.vtexassets.com/assets/vtex.file-manager-graphql/images/8dc37043-6f35-4066-baa3-b6ba95a74924___a91f51a1794a3ed7ffd25e6b39fb1872.png');

INSERT INTO cliente(cpf, usuarioId)
VALUES ('72', 1);

INSERT INTO fornecedora(cnpj, usuarioId)
VALUES ('99', 2)