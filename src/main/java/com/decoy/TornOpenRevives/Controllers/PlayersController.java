package com.decoy.TornOpenRevives.Controllers;

import com.decoy.TornOpenRevives.DTO.PlayerDTO;
import com.decoy.TornOpenRevives.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayersController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/latest")
    public List<PlayerDTO> findLatestRevivable(){
        return playerService.findLatestRevivable();
    }
}
