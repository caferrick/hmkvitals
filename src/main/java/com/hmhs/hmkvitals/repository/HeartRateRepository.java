package com.hmhs.hmkvitals.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hmhs.hmkvitals.model.HeartRate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQuery;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface HeartRateRepository extends JpaRepository <HeartRate, Long>{
//public interface HeartRateRepository extends CrudRepository<HeartRate, Long> {


   // @Query("select a from heartRate a where a.readDate = 1592961513")
    HeartRate getLatestRead();


}
