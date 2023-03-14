package com.cinnox.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cinnox.demo.model.LineMessageSource;

public interface LineMessageSourceRepository extends MongoRepository<LineMessageSource, String>{

	@Query("{'events':{'$elemMatch':{'webhookEventId':?0}}}")
	public List<LineMessageSource> findByWebhookEventId(String webhookEventId);
}
