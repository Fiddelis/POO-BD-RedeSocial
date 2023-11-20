-- -----------------------------------------------------
-- Schema redeSocialBD
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `redeSocialBD` DEFAULT CHARACTER SET utf8 ;
USE `redeSocialBD` ;

-- -----------------------------------------------------
-- Table `redeSocialBD`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redeSocialBD`.`usuario` (
  `email` VARCHAR(45) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  PRIMARY KEY (`email`));


-- -----------------------------------------------------
-- Table `redeSocialBD`.`postagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redeSocialBD`.`postagem` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data_publicacao` DATE NOT NULL,
  `conteudo` VARCHAR(100) NOT NULL,
  `usuario_email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_postagem_usuario1_idx` (`usuario_email` ASC) VISIBLE,
  CONSTRAINT `fk_postagem_usuario1`
    FOREIGN KEY (`usuario_email`)
    REFERENCES `redeSocialBD`.`usuario` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `redeSocialBD`.`Amigos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redeSocialBD`.`amigos` (
  `usuario_email` VARCHAR(45) NOT NULL,
  `usuario_email1` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`usuario_email`, `usuario_email1`),
  INDEX `fk_usuario_has_usuario_usuario2_idx` (`usuario_email1` ASC) VISIBLE,
  INDEX `fk_usuario_has_usuario_usuario1_idx` (`usuario_email` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_has_usuario_usuario1`
    FOREIGN KEY (`usuario_email`)
    REFERENCES `redeSocialBD`.`Usuario` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_has_usuario_usuario2`
    FOREIGN KEY (`usuario_email1`)
    REFERENCES `redeSocialBD`.`usuario` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `redeSocialBD`.`Perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redeSocialBD`.`perfil` (
  `usuario_email` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(200) NULL,
  `localizacao` VARCHAR(45) NULL,
  PRIMARY KEY (`usuario_email`),
  INDEX `fk_perfil_usuario1_idx` (`usuario_email` ASC) VISIBLE,
  CONSTRAINT `fk_perfil_usuario1`
    FOREIGN KEY (`usuario_email`)
    REFERENCES `redeSocialBD`.`usuario` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);