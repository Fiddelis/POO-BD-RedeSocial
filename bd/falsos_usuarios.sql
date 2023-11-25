-- Inserir Usuarios para testes
INSERT INTO `redeSocialBD`.`usuario` (`email`, `data_nascimento`, `senha`, `nome`) VALUES
('usuario1@exemplo.com', '1990-01-01', '123456', 'Tom Hanks'),
('usuario2@exemplo.com', '1992-03-15', '123456', 'Angelina Jolie'),
('usuario3@exemplo.com', '1985-07-22', '123456', 'Brad Pitt'),
('usuario4@exemplo.com', '1998-05-10', '123456', 'Jennifer Aniston'),
('usuario5@exemplo.com', '1980-11-30', '123456', 'Leonardo DiCaprio'),
('usuario6@exemplo.com', '1995-09-18', '123456', 'Meryl Streep'),
('usuario7@exemplo.com', '1983-04-05', '123456', 'Denzel Washington'),
('usuario8@exemplo.com', '1991-12-12', '123456', 'Charlize Theron'),
('usuario9@exemplo.com', '1975-08-03', '123456', 'Johnny Depp'),
('usuario10@exemplo.com', '1987-06-25', '123456', 'Nicole Kidman');

-- Inserir postagens para cada usuário com frases aleatórias
INSERT INTO `redeSocialBD`.`postagem` (`data_publicacao`, `conteudo`, `usuario_email`) VALUES
('2023-01-01', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'usuario1@exemplo.com'),
('2023-02-01', 'Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.', 'usuario2@exemplo.com'),
('2023-03-01', 'Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.', 'usuario3@exemplo.com'),
('2023-04-01', 'Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'usuario4@exemplo.com'),
('2023-05-01', 'Curabitur pretium tincidunt lacus. Nulla gravida orci a odio. Nullam varius, turpis et commodo pharetra, est eros bibendum elit.', 'usuario5@exemplo.com'),
('2023-06-01', 'Maecenas tempus tellus eget condimentum rhoncus sem quam semper libero.', 'usuario6@exemplo.com'),
('2023-07-01', 'Interdum velit laoreet id donec ultrices tincidunt arcu non sodales neque sodales ut etiam sit.', 'usuario7@exemplo.com'),
('2023-08-01', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'usuario8@exemplo.com'),
('2023-09-01', 'Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.', 'usuario9@exemplo.com'),
('2023-10-01', 'Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.', 'usuario10@exemplo.com');

-- Criar amizades entre eles
INSERT INTO `redeSocialBD`.`amigos` (`usuario_email`, `usuario_email1`) VALUES
('usuario1@exemplo.com', 'usuario2@exemplo.com'),
('usuario1@exemplo.com', 'usuario3@exemplo.com'),
('usuario2@exemplo.com', 'usuario3@exemplo.com'),
('usuario4@exemplo.com', 'usuario5@exemplo.com'),
('usuario5@exemplo.com', 'usuario6@exemplo.com'),
('usuario7@exemplo.com', 'usuario8@exemplo.com'),
('usuario8@exemplo.com', 'usuario9@exemplo.com'),
('usuario9@exemplo.com', 'usuario10@exemplo.com');

-- Inserindo um perfil para cada Usuario
INSERT INTO `redeSocialBD`.`perfil` (`usuario_email`, `descricao`, `localizacao`) VALUES
('usuario1@exemplo.com', 'Amante de música e cinema. A vida é uma viagem, e eu estou explorando cada nota e cena.', 'Los Angeles'),
('usuario2@exemplo.com', 'Apaixonado por livros e viagens. Sempre em busca da próxima grande aventura literária.', 'Paris'),
('usuario3@exemplo.com', 'Entusiasta de esportes ao ar livre e ecologia. A natureza é minha segunda casa.', 'Vancouver'),
('usuario4@exemplo.com', 'Artista em ascensão. Transformando a imaginação em obras de arte.', 'Nova Iorque'),
('usuario5@exemplo.com', 'Amante da gastronomia. Sempre em busca do próximo sabor extraordinário.', 'Tokyo'),
('usuario6@exemplo.com', 'Aventuras culinárias e fotografia são minhas paixões. Capturando momentos saborosos por todo o mundo.', 'Barcelona'),
('usuario7@exemplo.com', 'Entusiasta de tecnologia e inovação. Sempre buscando a próxima grande descoberta.', 'Silicon Valley'),
('usuario8@exemplo.com', 'Explorador de culturas. Cada viagem é uma oportunidade para aprender algo novo.', 'Londres'),
('usuario9@exemplo.com', 'Defensor dos direitos dos animais e natureza. Trabalhando para um mundo mais verde e ético.', 'Sydney'),
('usuario10@exemplo.com', 'Fotógrafo amador em busca da beleza nas coisas simples da vida.', 'Florença');