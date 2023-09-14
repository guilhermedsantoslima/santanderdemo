CREATE TABLE pessoa(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    email varchar(255) NOT NULL,
    nome varchar(255) NOT NULL,
    senha varchar(255) NOT NULL,
    telefone varchar(255) NOT NULL,

    primary key(id)
)