package com.paulovictor.CRUDchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulovictor.CRUDchallenge.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
