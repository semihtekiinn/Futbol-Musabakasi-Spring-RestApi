package com.works.uygulama.repositories;

import com.works.uygulama.entities.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballer, Integer> {

    boolean existsByFidEquals(Integer fid);

}