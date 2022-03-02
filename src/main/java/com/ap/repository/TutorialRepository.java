package com.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.Model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial,Long> {

}
