package dru.health.care;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dru.health.care.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
