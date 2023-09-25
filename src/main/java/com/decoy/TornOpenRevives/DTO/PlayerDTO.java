package com.decoy.TornOpenRevives.DTO;

import com.decoy.TornOpenRevives.Entities.Player;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDTO {
    private Long id;
    private String name;
    private String faction_name;
    private String faction_position;
    private Boolean isRevivable;
    private String status;
    private Timestamp time_stamp;

    public PlayerDTO(Player player){
        this.id = player.getId();
        this.name = player.getName();
        this.faction_name = player.getFaction_name();
        this.faction_position = player.getFaction_position();
        this.isRevivable = player.getIsRevivable();
        this.status = player.getStatus();
        this.time_stamp = player.getTime_stamp();
    }
}
