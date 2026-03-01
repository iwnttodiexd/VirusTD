
create table roles (
       id uuid primary key,
       name varchar(50) unique not null
);

create table user_roles (
        user_id uuid not null,
        role_id uuid not null,

        constraint fk_user_roles_user
            foreign key (user_id)
                references users(id),

        constraint fk_user_roles_role
            foreign key (role_id)
                references roles(id),

        constraint uk_user_role
            unique (user_id, role_id)
);