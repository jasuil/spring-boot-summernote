package kr.hwb.example.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hwb.example.entity.Article;
import kr.hwb.example.repository.ArticleRepository;

@RestController
@RequestMapping(value="/rest")
public class RestArticleController {

	Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
    @Autowired
    private ArticleRepository articleRepository;
    
	@RequestMapping(value="/article/{id}")
	public Map<String,String> Article(@PathVariable int id){
		Article article = articleRepository.findOne(id);
		
		Map<String,String> art = new HashMap<>();
		art.put("content", article.getContent());
		art.put("subject", article.getSubject());
		
		logger.info("article ---- {}", article.toString());
		return art;
	}
}
