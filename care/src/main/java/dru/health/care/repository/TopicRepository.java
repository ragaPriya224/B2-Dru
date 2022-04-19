package dru.health.care.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dru.health.care.entity.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
