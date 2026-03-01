create table sessions(
    id uuid primary key ,
    player_id uuid not null,
    level_id uuid not null ,
    started_at timestamp,
    ended_at timestamp,
    status varchar(50),

    constraint fk_player_id
        foreign key (player_id)
            references players(id),

    constraint fk_level_id
        foreign key (level_id)
            references levels(id)
);