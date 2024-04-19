package com.babu24.eazyschool.Repositry;


import com.babu24.eazyschool.Model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}
