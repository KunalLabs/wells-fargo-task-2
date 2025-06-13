package com.wellsfargo.counselor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.counselor.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
