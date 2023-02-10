create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
  id bigint auto_increment,
  nacao varchar(100),

  primary key(id)
);

insert into tb_classes(nacao) values
('Alfea'),
('Torre Nebulosa'),
('Fonte Rubra'),
('linphea'),
('Magix')

create table tb_personagens(
  id bigint auto_increment,
  nome varchar(100),
  ataque int not null,
  defesa int not null,
  classe_id bigint,

  primary key(id),
  foreign key(classe_id) references tb_classes(id)
);

insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Musa', 100, 85, 1)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Bloom', 65, 37, 1)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Flora', 68, 85, 1)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Stella', 50, 50, 1)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Tecna', 87, 37, 1)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Icy', 82, 57, 2)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Darcy', 62, 75, 2)
insert into tb_personagens(nome, ataque, defesa, classe_id) values ('Stormy', 78, 82, 2)

select * from tb_personagens where ataque > 20;

select * from tb_personagens where defesa between 10 and 20;

select * from tb_personagens where nome like '%c%';

select * from tb_personagens inner join tb_classes on classe_id = tb_classes.id;

select * from tb_personagens inner join tb_classes on classe_id = tb_classes.id where classe_id = 2;
