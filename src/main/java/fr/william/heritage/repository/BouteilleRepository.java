package fr.william.heritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.william.heritage.model.Bouteille;

public interface BouteilleRepository extends JpaRepository<Bouteille, Integer> {

}
