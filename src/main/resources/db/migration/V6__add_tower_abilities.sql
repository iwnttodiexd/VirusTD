CREATE TABLE abilities
(
    id          UUID NOT NULL,
    name        VARCHAR(255),
    description VARCHAR(255),
    CONSTRAINT pk_abilities PRIMARY KEY (id)
);

CREATE TABLE tower_abilities
(
    id         UUID NOT NULL,
    tower_id   UUID,
    ability_id UUID,
    value      FLOAT,
    duration   FLOAT,
    radius     FLOAT,
    CONSTRAINT pk_tower_abilities PRIMARY KEY (id)
);

CREATE TABLE tower_types
(
    id          UUID NOT NULL,
    name        VARCHAR(255),
    description VARCHAR(255),
    CONSTRAINT pk_tower_types PRIMARY KEY (id)
);

ALTER TABLE tower_upgrades
    ADD attack_speed_increased FLOAT;

ALTER TABLE tower_upgrades
    ADD description VARCHAR(255);

ALTER TABLE tower_upgrades
    ADD tower_abilities_id UUID;

ALTER TABLE towers
    ADD tower_types_id UUID;

ALTER TABLE towers
    ADD CONSTRAINT uc_towers_tower_types UNIQUE (tower_types_id);

ALTER TABLE towers
    ADD CONSTRAINT FK_TOWERS_ON_TOWER_TYPES FOREIGN KEY (tower_types_id) REFERENCES tower_types (id);

ALTER TABLE tower_abilities
    ADD CONSTRAINT FK_TOWER_ABILITIES_ON_ABILITY FOREIGN KEY (ability_id) REFERENCES abilities (id);

ALTER TABLE tower_abilities
    ADD CONSTRAINT FK_TOWER_ABILITIES_ON_TOWER FOREIGN KEY (tower_id) REFERENCES towers (id);

ALTER TABLE tower_upgrades
    ADD CONSTRAINT FK_TOWER_UPGRADES_ON_TOWER_ABILITIES FOREIGN KEY (tower_abilities_id) REFERENCES tower_abilities (id);

ALTER TABLE towers
    DROP COLUMN base_attack_speed;

ALTER TABLE towers
    DROP COLUMN base_damage;