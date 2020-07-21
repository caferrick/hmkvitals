package com.hmhs.hmkvitals.services;

import com.hmhs.hmkvitals.model.HeartRate;
import com.hmhs.hmkvitals.repository.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HeartRateService {



    private HeartRateRepository heartRateRepository;

    @Autowired
    public HeartRateService(HeartRateRepository heartRateRepository) {
        this.heartRateRepository = heartRateRepository;
    }


      public HeartRate getLatestRead() {
        HeartRate hr = new HeartRate();
        hr = heartRateRepository.getLatestRead();
        return hr;
      }


    public void save(HeartRate hrRate) {
         heartRateRepository.save(hrRate);
      }



} //end class
