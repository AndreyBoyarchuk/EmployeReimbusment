create table employee
(
    id          serial
        constraint employee_pk
            primary key,
    full_name   varchar,
    "Email"     varchar,
    "Depatment" varchar,
    "Location"  varchar
);

create unique index employee_id_uindex
    on employee (id);



create table depatment
(
    id serial
        constraint depatment_pk
            primary key
);

create unique index depatment_id_uindex
    on depatment (id);

alter table depatment
    add depatment_name int;

alter table employee
    alter column "Depatment" type int using "Depatment"::int;

alter table employee
    add constraint employee_depatment_id_fk
        foreign key ("Depatment") references depatment;



create table reimbursement
(
    id            serial
        constraint reimbursement_pk
            primary key,
    description   varchar,
    status        int,
    date_approved date,
    date_created  date,
    employee_id   int
        constraint reimbursement_employee_id_fk
            references employee,
    amount        float,
    column_8      int
);

create unique index reimbursement_id_uindex
    on reimbursement (id);

alter table reimbursement
    alter column status type bool using status::bool;

insert into depatment (depatment_name) values ('manager');

insert into employee ("full_name", "Email", "Depatment","Location") VALUES ('Chris', 'cc@gmail.com', 1, 'Boise')

