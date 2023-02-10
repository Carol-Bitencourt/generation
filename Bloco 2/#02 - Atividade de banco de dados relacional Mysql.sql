create database rh_empresa;

use rh_empresa;

create table colaboradores(
  id int not null auto_increment,
  nome varchar(200) not null,
  funcao varchar(200) not null,
  salario decimal(6,2) not null,
  terceirizado tinyint,

  primary key (id)
);

select * from colaboradores;

insert into colaboradores(nome, funcao, salario, terceirizado)
values ('Carol', 'Dev BFF', 12345.67, 0)
insert into colaboradores(nome, funcao, salario, terceirizado)
values ('Anne', 'Dev back-end', 12345.67, 0)
insert into colaboradores(nome, funcao, salario, terceirizado)
values ('Michel', 'Coordenador topíssimo', 12345.67, 0)
insert into colaboradores(nome, funcao, salario, terceirizado)
values ('Thiago', 'Dev BFF topíssimo', 12345.67, 1)
insert into colaboradores(nome, funcao, salario, terceirizado)
values ('Tutti', 'Techlead topíssimo', 12345.67, 0)

select * from colaboradores where salario > 2000
select * from colaboradores where salario < 2000

update colaboradores set salario = 0