package com.flight.repository;

import com.flight.model.flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface flightRepository extends JpaRepository<flight,Long>{

}
