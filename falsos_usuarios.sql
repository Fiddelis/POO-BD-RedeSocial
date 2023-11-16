-- Inserir dados fictícios na tabela `Usuario`
INSERT INTO `Usuario` (`email`, `data_nascimento`, `senha`, `nome`)
VALUES
  ('usuario1@email.com', '1990-01-01', 'senha123', 'Usuario1'),
  ('usuario2@email.com', '1992-05-15', 'senha456', 'Usuario2'),
  ('usuario3@email.com', '1985-09-20', 'senha789', 'Usuario3');

-- Inserir dados fictícios na tabela `postagem`
INSERT INTO `postagem` (`data_publicacao`, `conteudo`, `Usuario_email`)
VALUES
  ('2023-01-01', 'Sob o céu estrelado, seguiu seu caminho com esperança.', 'usuario1@email.com'),
  ('2023-02-15', 'Entre as sombras da cidade, ela encontrou seu refúgio.', 'usuario2@email.com'),
  ('2023-03-20', 'Na encruzilhada da vida, fez uma escolha corajosa.', 'usuario3@email.com'),
  ('2023-04-19', 'No jardim da imaginação, floresceu a criatividade.', 'usuario3@email.com');

-- Inserir dados fictícios na tabela `Amigos`
INSERT INTO `Amigos` (`Usuario_email`, `Usuario_email1`)
VALUES
  ('usuario1@email.com', 'usuario2@email.com'),
  ('usuario1@email.com', 'usuario3@email.com'),
  ('usuario2@email.com', 'usuario3@email.com');

-- Inserir dados fictícios na tabela `Perfil`
INSERT INTO `Perfil` (`Usuario_email`, `descricao`, `localizacao`)
VALUES
  ('usuario1@email.com', 'Aventureiro urbano em busca de experiências autênticas. Amante da música e explorador de cafés aconchegantes.', 'Localizacao1'),
  ('usuario2@email.com', 'Escritor noturno que transforma pensamentos em palavras. Apaixonado por viagens e colecionador de memórias.', 'Localizacao2'),
  ('usuario3@email.com', 'Entusiasta da tecnologia e defensor da sustentabilidade. Sempre em busca de soluções inovadoras para o futuro.', 'Localizacao3');

SELECT * FROM `usuario`;