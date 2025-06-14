
package com.wellsfargo.counselor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.counselor.entity.Advisor;

@Repository
public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
    
}

