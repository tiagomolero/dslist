package com.tiagomolero.dslist.repositories;

import com.tiagomolero.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
