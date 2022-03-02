package com.ap.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ap.Model.Author;
import com.ap.Model.Tutorial;
import com.ap.repository.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
	
	@Autowired
	private AuthorRepository authorRepository;
	public TutorialResolver(AuthorRepository authorRepository)
	{		
		this.authorRepository=authorRepository;		
	}
	public Author getAuthor(Tutorial tutorial) {
	    return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
	  }
}
