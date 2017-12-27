package com.nandulabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
