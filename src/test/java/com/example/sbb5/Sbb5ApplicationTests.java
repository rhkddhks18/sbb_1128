package com.example.sbb5;

import com.example.sbb5.article.Article;
import com.example.sbb5.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Sbb5ApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testJpa() {
		Article q1 = new Article();
		q1.setTitle("안녕하세요");
		q1.setContent("ㅎㅇ");
		q1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(q1);

	}
}
