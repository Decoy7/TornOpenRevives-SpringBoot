package com.decoy.TornOpenRevives.Services.Implementations;

import com.decoy.TornOpenRevives.DTO.PlayerDTO;
import com.decoy.TornOpenRevives.Entities.Player;
import com.decoy.TornOpenRevives.Repositories.PlayerRepository;
import com.decoy.TornOpenRevives.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<PlayerDTO> findLatestRevivable() {
        return playerRepository.findLatestRevivable().stream()
                .map(PlayerDTO::new)
                .toList();
    }
}
