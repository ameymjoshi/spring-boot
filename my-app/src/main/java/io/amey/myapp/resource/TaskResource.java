package io.amey.myapp.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.amey.myapp.entity.Task;
import io.amey.myapp.repository.TaskRepo;

@RestController
@RequestMapping("/task")
public class TaskResource {

    @Autowired
    public TaskRepo taskRepository;
    
    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable int id){
       return taskRepository.findById(id);
    }

    @GetMapping("/all")
    public List<Task> getAllTasks(){
       return taskRepository.findAll();
    }

    @PostMapping("/add")
    public void addTask(@RequestBody Task taskToAdd){
        taskRepository.insert(taskToAdd);
    }
}
