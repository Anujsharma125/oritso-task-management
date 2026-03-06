package com.anuj.taskmanager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anuj.taskmanager.model.Task;
import com.anuj.taskmanager.repository.TaskRepository;

@Controller
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String listTasks(Model model) {
        model.addAttribute("tasks", repo.findAll());
        return "tasks";
    }

    @GetMapping("/tasks/new")
    public String showAddForm(Model model) {
        model.addAttribute("task", new Task());
        return "task-form";
    }

    @PostMapping("/tasks")
    public String saveTask(@ModelAttribute Task task) {
        repo.save(task);
        return "redirect:/";
    }

    @GetMapping("/tasks/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Task task = repo.findById(id).orElseThrow();
        model.addAttribute("task", task);
        return "task-form";
    }

    @GetMapping("/tasks/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/tasks/search")
    public String searchTask(@RequestParam String keyword, Model model) {
        List<Task> tasks = repo.findByTitleContainingIgnoreCase(keyword);
        model.addAttribute("tasks", tasks);
        model.addAttribute("keyword", keyword);
        return "tasks";
    }
}