package org.kenneth;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students, Integer> {


    List<Students> book(String book);
}
