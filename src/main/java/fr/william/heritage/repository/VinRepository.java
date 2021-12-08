package fr.william.heritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.william.heritage.model.Vin;

public interface VinRepository extends JpaRepository<Vin, Integer> {

}
