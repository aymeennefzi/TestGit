package com.example.testgit.Repo;

import com.example.testgit.Entity.Test1;
import com.example.testgit.Entity.Test2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITEST2repo extends JpaRepository<Test2, Integer> {
}
