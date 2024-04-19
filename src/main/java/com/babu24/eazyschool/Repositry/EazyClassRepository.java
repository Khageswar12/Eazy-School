package com.babu24.eazyschool.Repositry;


import com.babu24.eazyschool.Model.EazyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EazyClassRepository extends JpaRepository<EazyClass, Integer> {

}
