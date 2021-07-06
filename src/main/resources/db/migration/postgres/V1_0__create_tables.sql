create table users(
      id serial not null primary key,
      username varchar(50) not null,
      password varchar(100) not null,
      enabled boolean not null
);

create table authorities (
     user_id serial not null,
     authority varchar(50) not null,
     constraint fk_authorities_users foreign key(user_id) references users(id)
);
create unique index ix_auth_username on authorities (user_id,authority);