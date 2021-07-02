package io.amey.myapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.amey.myapp.entity.Task;

public interface TaskRepo extends MongoRepository<Task, Integer> {
    
}
