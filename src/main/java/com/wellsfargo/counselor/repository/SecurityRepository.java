package com.wellsfargo.counselor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.counselor.entity.Security;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
}
