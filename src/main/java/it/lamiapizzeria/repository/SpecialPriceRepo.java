package it.lamiapizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 import it.lamiapizzeria.model.ModelOfSpecialPrice;

public interface SpecialPriceRepo extends JpaRepository<ModelOfSpecialPrice,Integer> {
    
}
