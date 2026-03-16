package coms.SpringRestApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import coms.SpringRestApi.beans.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
	@Query("SELECT p FROM Person p WHERE p.email = :email  and p.pswd=:pwd")
	Person  CheckUserInfo(@Param("email") String uname, @Param("pwd")String pwd);
}
