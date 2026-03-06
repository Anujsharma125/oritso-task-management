package com.anuj.taskmanager.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.anuj.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByTitleContainingIgnoreCase(String keyword);
}