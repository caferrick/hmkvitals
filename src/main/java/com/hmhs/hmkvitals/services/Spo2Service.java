package com.hmhs.hmkvitals.services;

import com.hmhs.hmkvitals.model.HeartRate;
import com.hmhs.hmkvitals.model.Spo2;
import com.hmhs.hmkvitals.repository.HeartRateRepository;
import com.hmhs.hmkvitals.repository.Spo2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Spo2Service {


    private Spo2Repository spo2Repository;

    @Autowired
    public Spo2Service(Spo2Repository spo2Repository) {
        this.spo2Repository = spo2Repository;
    }

  
    public Spo2 getLatestRead() {
        Spo2 spo2 = new Spo2();
        spo2 = spo2Repository.getLatestRead();
        return spo2;
    }


} //end class
