package com.example.dan.completespring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import model.Content;

@Repository
public class ContentCollectionRepository {
	
	private final List<Content> content = new ArrayList<Content>();
	
	public ContentCollectionRepository() {
		
	}
	
	public List<Content> findAll(){
		return content;
	}
	
	public Optional<Content> findById(Integer id){
		return content.stream().filter(c->c.id().equals(id)).findFirst();
	}
	
}
