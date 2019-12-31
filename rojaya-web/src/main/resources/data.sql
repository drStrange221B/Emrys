insert into users ( username, password, enabled)
values ( 'user','pass',true);

insert into users ( username, password, enabled)
values ( 'admin','admin',true);

Insert Into authorities ( username, authority)
values ('user', 'ROLE_USER');

Insert Into authorities ( username, authority)
values ('admin', 'ROLE_ADMIN');
