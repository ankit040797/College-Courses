package com.geekster.College.courses.repo;

import com.geekster.College.courses.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
