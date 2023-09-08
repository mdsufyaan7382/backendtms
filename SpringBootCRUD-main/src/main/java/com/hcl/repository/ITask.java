package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Task;

public interface ITask extends JpaRepository<Task, Integer> {

}
