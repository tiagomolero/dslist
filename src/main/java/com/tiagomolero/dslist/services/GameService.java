package com.tiagomolero.dslist.services;

import com.tiagomolero.dslist.dto.GameMinDTO;
import com.tiagomolero.dslist.entities.Game;
import com.tiagomolero.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> todosGames = gameRepository.findAll();
        List<GameMinDTO> dtoGames = todosGames.stream().map(x -> new GameMinDTO(x)).toList();
        return dtoGames;
    }

}
