create unique index uk_active_session_per_player
    on sessions(player_id)
    where status = 'ACTIVE';

create index idx_sessions_level_id on sessions(level_id);
create index idx_sessions_player_status
    on sessions(player_id, status);

create index idx_results_player_id on game_results(player_id);
create index idx_results_level_id on game_results(level_id);