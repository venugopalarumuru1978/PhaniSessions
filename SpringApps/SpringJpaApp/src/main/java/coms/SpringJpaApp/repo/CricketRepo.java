package coms.SpringJpaApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import coms.SpringJpaApp.beans.Cricket;

@Repository
public interface CricketRepo extends JpaRepository<Cricket, Integer> {

	@Query("SELECT c FROM Cricket c WHERE c.crgame = :game")
	List<Cricket>  SearchCrkBasedGame(@Param("game") String game);
	
	
}
