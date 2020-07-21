package com.hmhs.hmkvitals.repository;

import com.hmhs.hmkvitals.model.Spo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Spo2Repository extends JpaRepository <Spo2, Long>{

    Spo2 getLatestRead();


}
