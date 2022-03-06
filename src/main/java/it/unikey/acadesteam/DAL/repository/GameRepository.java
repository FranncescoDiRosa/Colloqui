package it.unikey.acadesteam.DAL.repository;

import it.unikey.acadesteam.DAL.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface GameRepository extends JpaRepository<GameEntity, Integer> {
}