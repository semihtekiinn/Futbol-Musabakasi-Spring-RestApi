package com.works.uygulama.repositories;

import com.works.uygulama.entities.FootTeam;
import com.works.uygulama.utils.TEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

public interface FootTeamRepository extends JpaRepository<FootTeam, Integer> {

    @Query(value = "SELECT t.tid, t.name AS tname, f.fid, f.name, f.surname, f.email, f.age FROM footballer AS f INNER JOIN team AS t ON f.fid=t.fid where t.name=?1 ORDER BY f.age LIMIT 0,11", nativeQuery = true)
    List<FootTeam> teamsAsil(int t);

    @Query(value = "SELECT t.tid, t.name AS tname, f.fid, f.name, f.surname, f.email, f.age FROM footballer AS f INNER JOIN team AS t ON f.fid=t.fid where t.name=?1 ORDER BY f.age LIMIT 11,5", nativeQuery = true)
    List<FootTeam> teamsYedek(int t);

}