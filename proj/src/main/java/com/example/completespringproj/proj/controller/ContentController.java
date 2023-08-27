package controller;

import com.example.dan.completespring.repository.ContentCollectionRepository;
import model.Content;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
	private final ContentCollectionRepository repository;
	
	public ContentController(ContentCollectionRepository repository) {
		
		this.repository = repository;
	}

	@GetMapping("")
	public List<Content> findAll(){
		return repository.findAll();
	}
	
	
}
	
