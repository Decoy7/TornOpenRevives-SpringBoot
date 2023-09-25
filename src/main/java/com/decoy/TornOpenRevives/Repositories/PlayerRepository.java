package com.decoy.TornOpenRevives.Repositories;

import com.decoy.TornOpenRevives.Entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    @Query(value = "SELECT * FROM players WHERE time_stamp = ( SELECT MAX(time_stamp) FROM players);",nativeQuery = true)
    List<Player> findLatestRevivable();
}
