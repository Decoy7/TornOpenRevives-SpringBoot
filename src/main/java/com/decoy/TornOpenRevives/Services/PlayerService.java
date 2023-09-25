package com.decoy.TornOpenRevives.Services;

import com.decoy.TornOpenRevives.DTO.PlayerDTO;

import java.util.List;

public interface PlayerService {
    List<PlayerDTO> findLatestRevivable();
}
