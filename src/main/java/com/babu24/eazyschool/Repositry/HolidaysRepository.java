package com.babu24.eazyschool.Repositry;

import com.babu24.eazyschool.Model.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends JpaRepository<Holiday,String> {
}
