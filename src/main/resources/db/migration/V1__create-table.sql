create table logs (
    id SERIAL PRIMARY KEY,
    datetime timestamp,
    cep VARCHAR(9),
    tipocep VARCHAR(50),
    subtipocep VARCHAR(50),
    uf VARCHAR(2),
    cidade VARCHAR(150),
    bairro VARCHAR(150),
    endereco VARCHAR(150),
    numero VARCHAR(50),
    complemento VARCHAR(150),
    codigoibge VARCHAR(50),
    sucesso boolean
);

create table enderecos (
    id SERIAL PRIMARY KEY,
    cep VARCHAR(9),
    tipocep VARCHAR(50),
    subtipocep VARCHAR(50),
    uf VARCHAR(2),
    cidade VARCHAR(150),
    bairro VARCHAR(150),
    endereco VARCHAR(150),
    numero VARCHAR(50),
    complemento VARCHAR(150),
    codigoibge VARCHAR(50)
);