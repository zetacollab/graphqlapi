package com.ap.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ap.Model.Author;
import com.ap.Model.Tutorial;
import com.ap.repository.AuthorRepository;
import com.ap.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private TutorialRepository tutorialRepository;
	
	
	public Iterable<Author> findAllAuthors() {
	    return authorRepository.findAll();
	  }
	  public Iterable<Tutorial> findAllTutorials() {
	    return tutorialRepository.findAll();
	  }
	  public long countAuthors() {
	    return authorRepository.count();
	  }
	  public long countTutorials() {
	    return tutorialRepository.count();
	  }
	
	
	
	

}
