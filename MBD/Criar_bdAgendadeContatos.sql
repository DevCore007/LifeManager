CREATE DATABASE IF NOT EXISTS bdAgendadeContatos;
USE bdAgendadeContatos;

CREATE TABLE IF NOT EXISTS tbContato (
	idContato int NOT NULL AUTO_INCREMENT,
    nomeContato varchar(200) NOT NULL,
    enderecoContato varchar(300),
    telefoneContato varchar(30),
    emailContato varchar(320),
    -- O tipo de dado ENUM exige que o campo assuma apenas um dos valores definidos
    sexoContato ENUM('M', 'F') NULL,
    
    CONSTRAINT PKContato PRIMARY KEY (idContato),
    CONSTRAINT UQTelefone UNIQUE (telefoneContato),
	CONSTRAINT UQEmail UNIQUE (emailContato),
    -- Impede que o campo de telefone e e-mail sejam nulos ao mesmo tempo
    CONSTRAINT CHKMeiodeContato CHECK (emailContato IS NOT NULL OR telefoneContato IS NOT NULL)
);