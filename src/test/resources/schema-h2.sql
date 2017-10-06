drop table if exists public.tb_user;
drop table if exists public.tb_permission;
drop table if exists public.tb_user_permission;
drop table if exists public.tb_tecnologia;
drop table if exists public.tb_risco;
drop table if exists public.tb_pendencia;
drop table if exists public.tb_premissa;
drop table if exists public.tb_pendencia_tecnologia;
drop table if exists public.tb_risco_tecnologia;
drop table if exists public.tb_premissa_tecnologia;


create table public.tb_permission (
pk_id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
role varchar(45)
);

create table public.tb_user (
  pk_id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
  name varchar(45),
  email varchar(255),
  password varchar(80),
  phone varchar(11)
);

create table public.tb_user_permission (
permission_id INT,
user_id INT,
FOREIGN KEY (permission_id) REFERENCES public.tb_permission(pk_id),
FOREIGN KEY (user_id) REFERENCES public.tb_user(pk_id)
);


create table public.tb_tecnologia (
  pk_id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
  desc_tecnologia varchar(255),
  sigla varchar(255)
);

CREATE TABLE public.tb_risco
(
    id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    desc_risco varchar(100),
    texto_risco varchar(255)
);

CREATE TABLE public.tb_pendencia
(
    id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    desc_pendencia varchar(100),
    texto_pendencia varchar(255)
);

CREATE TABLE public.tb_premissa
(
    id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    desc_premissa varchar(100),
    texto_premissa varchar(255)
);

CREATE TABLE public.tb_pendencia_tecnologia
(
    id_tecnologia int),
    id_pendencia int),
 FOREIGN KEY (id_pendencia) REFERENCES public.tb_pendencia(id),
 FOREIGN KEY (id_tecnologia) REFERENCES public.tb_tecnologia(id)
);

CREATE TABLE public.tb_premissa_tecnologia
(
    id_tecnologia int NOT NULL ),
    id_premissa int NOT NULL ),
 FOREIGN KEY (id_premissa) REFERENCES public.tb_premissa(id),
 FOREIGN KEY (id_tecnologia) REFERENCES public.tb_tecnologia(id)
);

CREATE TABLE public.tb_risco_tecnologia
(
    id_tecnologia int NOT NULL ),
    id_risco int NOT NULL ),
 FOREIGN KEY (id_risco) REFERENCES public.tb_risco(id),
 FOREIGN KEY (id_tecnologia) REFERENCES public.tb_tecnologia(id)
);

