ALTER TABLE users
    ADD account_locked BOOLEAN;

ALTER TABLE users
    ALTER COLUMN account_locked SET NOT NULL;

ALTER TABLE user_roles
    ADD id UUID;

ALTER TABLE user_roles
    ADD CONSTRAINT pk_user_roles PRIMARY KEY (id);

ALTER TABLE enemies
    DROP COLUMN complexity;

ALTER TABLE enemies
    DROP COLUMN damage;

ALTER TABLE users
    DROP COLUMN is_locked;

ALTER TABLE player_achievements
    ALTER COLUMN achievement_id DROP NOT NULL;

ALTER TABLE towers
    ALTER COLUMN base_attack_speed DROP NOT NULL;

ALTER TABLE towers
    ALTER COLUMN base_cost DROP NOT NULL;

ALTER TABLE towers
    ALTER COLUMN base_damage DROP NOT NULL;

ALTER TABLE progress
    ALTER COLUMN completed SET NOT NULL;

ALTER TABLE levels
    ALTER COLUMN complexity TYPE VARCHAR(255) USING (complexity::VARCHAR(255));

ALTER TABLE tower_upgrades
    ALTER COLUMN cost DROP NOT NULL;

ALTER TABLE tower_upgrades
    ALTER COLUMN damage_increased DROP NOT NULL;

ALTER TABLE achievements
    ALTER COLUMN description TYPE VARCHAR(255) USING (description::VARCHAR(255));

ALTER TABLE enemies
    ALTER COLUMN description TYPE VARCHAR(255) USING (description::VARCHAR(255));

ALTER TABLE levels
    ALTER COLUMN description TYPE VARCHAR(255) USING (description::VARCHAR(255));

ALTER TABLE users
    ALTER COLUMN enabled SET NOT NULL;

ALTER TABLE game_results
    ALTER COLUMN level_id DROP NOT NULL;

ALTER TABLE progress
    ALTER COLUMN level_id DROP NOT NULL;

ALTER TABLE sessions
    ALTER COLUMN level_id DROP NOT NULL;

ALTER TABLE achievements
    ALTER COLUMN name TYPE VARCHAR(255) USING (name::VARCHAR(255));

ALTER TABLE enemies
    ALTER COLUMN name DROP NOT NULL;

ALTER TABLE roles
    ALTER COLUMN name TYPE VARCHAR(255) USING (name::VARCHAR(255));

ALTER TABLE roles
    ALTER COLUMN name DROP NOT NULL;

ALTER TABLE towers
    ALTER COLUMN name DROP NOT NULL;

ALTER TABLE game_results
    ALTER COLUMN player_id DROP NOT NULL;

ALTER TABLE player_achievements
    ALTER COLUMN player_id DROP NOT NULL;

ALTER TABLE progress
    ALTER COLUMN player_id DROP NOT NULL;

ALTER TABLE sessions
    ALTER COLUMN player_id DROP NOT NULL;

ALTER TABLE towers
    ALTER COLUMN range DROP NOT NULL;

ALTER TABLE game_results
    ALTER COLUMN result TYPE VARCHAR(255) USING (result::VARCHAR(255));

ALTER TABLE user_roles
    ALTER COLUMN role_id DROP NOT NULL;

ALTER TABLE sessions
    ALTER COLUMN status TYPE VARCHAR(255) USING (status::VARCHAR(255));

ALTER TABLE levels
    ALTER COLUMN title TYPE VARCHAR(255) USING (title::VARCHAR(255));

ALTER TABLE tower_upgrades
    ALTER COLUMN tower_id DROP NOT NULL;

ALTER TABLE user_roles
    ALTER COLUMN user_id DROP NOT NULL;