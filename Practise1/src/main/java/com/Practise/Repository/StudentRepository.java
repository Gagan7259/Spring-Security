package com.Practise.Repository;

import com.Practise.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, Long> {

}
