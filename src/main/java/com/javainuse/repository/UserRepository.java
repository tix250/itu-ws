package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.entities.UtilisateurMobile;

public interface UserRepository extends JpaRepository<UtilisateurMobile, Integer> {
	/*@Query("select u from UtilisateurMobile where u.nom=:x")
	public ArrayList<UtilisateurMobile> findUser (@Param("x") String nom );
	//public Page<UtilisateurMobile> chercher(@Param(":x") String mc , Pageable pageable);*/
}
