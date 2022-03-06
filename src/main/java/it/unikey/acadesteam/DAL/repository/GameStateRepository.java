package it.unikey.acadesteam.DAL.repository;

import it.unikey.acadesteam.DAL.entity.GameStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//ho tolto l'annotation repository
public interface GameStateRepository extends JpaRepository<GameStateEntity, Integer> {
}