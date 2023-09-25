package com.decoy.TornOpenRevives.Entities;

import com.decoy.TornOpenRevives.DTO.PlayerDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "index_id")
    private Long index;

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "faction_name")
    private String faction_name;

    @Column(name = "faction_position")
    private String faction_position;

    @Column(name = "revivable")
    private Boolean isRevivable;

    @Column(name = "status")
    private String status;

    @Column(name = "time_stamp")
    private Timestamp time_stamp;

    public Player(PlayerDTO playerDTO){
        this.id = playerDTO.getId();
        this.name = playerDTO.getName();
        this.faction_name = playerDTO.getFaction_name();
        this.faction_position = playerDTO.getFaction_position();
        this.isRevivable = playerDTO.getIsRevivable();
        this.status = playerDTO.getStatus();
        this.time_stamp = playerDTO.getTime_stamp();
    }
}
