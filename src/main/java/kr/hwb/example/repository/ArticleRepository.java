package kr.hwb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.hwb.example.entity.Article;
import kr.hwb.example.entity.UploadFile;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    
	 public Article findOneById(String id);
}
