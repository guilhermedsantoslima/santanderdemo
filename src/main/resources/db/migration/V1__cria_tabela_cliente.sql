CREATE TABLE cliente(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    cpf varchar(20) NOT NULL,
    rg varchar(15) NOT NULL,
    agencia varchar(30) NOT NULL,
    conta varchar(30) NOT NULL,
    gerente varchar(255) NOT NULL,

    primary key(id)
)