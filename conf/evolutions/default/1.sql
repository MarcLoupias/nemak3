
# --- !Ups

create table User (
  id                        bigint auto_increment not null,
  login                     varchar(255),
  pwd                       varchar(255),
  email                     varchar(255),
  constraint pk_user primary key (id))
;

INSERT INTO User (id, login, pwd, email) VALUES (1, 'marco', 'marco', 'junk@marc-loupias.fr');


# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

