
create table users (
       id uuid primary key,
       username varchar(255) unique,
       password varchar(255) not null,
       token varchar(255),
       is_locked boolean,
       enabled boolean,
       created_date timestamp not null default current_timestamp,
       last_modified_date timestamp

);

create table players (
         id uuid primary key,
         user_id uuid not null unique,
         nickname varchar(22) unique,
         enemy_killed bigint,
         settings varchar(255),
         created_at timestamp,

         constraint fk_player_user
             foreign key (user_id)
                 references users(id)
);

create table levels(
       id uuid primary key ,
       title varchar(50) unique ,
       description text,
       complexity varchar(50)
);
create table progress (
      id uuid primary key,
      player_id uuid not null,
      level_id uuid not null,
      completed boolean,
      total_attempts integer,
      first_completed_at timestamp,
      last_played_at timestamp,

      constraint fk_progress_player
          foreign key (player_id)
              references players(id),

      constraint fk_progress_level
          foreign key (level_id)
              references levels(id),

      constraint uk_player_level
          unique (player_id, level_id)
);

create table game_results (
          id uuid primary key,
          player_id uuid not null,
          level_id uuid not null,
          enemies_killed integer,
          towers_built integer,
          result varchar(50),
          played_at timestamp,

          constraint fk_results_player
              foreign key (player_id)
                  references players(id),

          constraint fk_results_level
              foreign key (level_id)
                  references levels(id)
);

create table enemies (
       id uuid primary key,
       name varchar(255) unique not null,
       total_health integer,
       damage float,
       speed float,
       complexity varchar(50),
       reward integer,
       description text
);

create table towers
(
    id uuid primary key,

    name varchar(255) unique not null,

    base_damage integer not null,

    base_attack_speed float not null,

    range float not null,

    base_cost integer not null
);

create table tower_upgrades
(
    id uuid primary key,

    tower_id uuid not null,

    damage_increased integer not null,

    cost integer not null,

    constraint fk_upgrade_tower
        foreign key (tower_id)
            references towers(id)
            on delete cascade
);

create table achievements(
    id uuid primary key ,
    name varchar(50) unique not null ,
    description text
);


create table player_achievements(
    id uuid primary key ,
    player_id uuid not null ,
    achievement_id uuid not null ,
    date_unlocked timestamp,

    constraint fk_player_id
        foreign key (player_id)
            references players(id),

    constraint fk_achievement_id
        foreign key (achievement_id)
            references achievements(id),

    constraint uk_player_achievements
        UNIQUE (player_id, achievement_id)

);