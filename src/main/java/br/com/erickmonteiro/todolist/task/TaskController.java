package br.com.erickmonteiro.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;
    private br.com.erickmonteiro.todolist.task.TaskModel TaskModel;

    @PostMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel) {
        System.out.println("Chegou no controller");
        var task = this.taskRepository.save(TaskModel);
        return taskRepository.save(taskModel);
    }
}
