package com.devsuperior.dsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsproject.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
