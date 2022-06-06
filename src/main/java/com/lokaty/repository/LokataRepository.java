package com.lokaty.repository;

import com.lokaty.model.Lokata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LokataRepository extends JpaRepository<Lokata, Long> {

}
