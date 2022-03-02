package com.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.Model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
