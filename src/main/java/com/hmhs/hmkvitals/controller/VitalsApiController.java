package com.hmhs.hmkvitals.controller;

import com.hmhs.hmkvitals.model.HeartRate;
import com.hmhs.hmkvitals.model.Spo2;
import com.hmhs.hmkvitals.services.HeartRateService;
import com.hmhs.hmkvitals.services.Spo2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HMKVitals/rest")

public class VitalsApiController {

    public static final Logger logger = LoggerFactory.getLogger(VitalsApiController.class);


    private HeartRateService heartRateService;
    private Spo2Service spo2Service;

    @Autowired
    public VitalsApiController(Spo2Service spo2Service, HeartRateService heartRateService) {
        this.spo2Service = spo2Service;
        this.heartRateService = heartRateService;
    }




    // -------------------Retrieve Vital ------------------------------------------

    @RequestMapping(value = "/vitals/heartRate", method = RequestMethod.GET)
    public ResponseEntity<?> GetHearRate() {

        HeartRate heartRate = new HeartRate();
        heartRate = heartRateService.getLatestRead();
        return new ResponseEntity<>(heartRate.getReadValue(), HttpStatus.OK);

    }

    @RequestMapping(value = "/vitals/spo2", method = RequestMethod.GET)
    public ResponseEntity<?> GetSpo2() {

        Spo2 spo2 = new Spo2();
        spo2 = spo2Service.getLatestRead();
        return new ResponseEntity<>(spo2.getReadValue(), HttpStatus.OK);

    }







    @RequestMapping(value = "/vitals/save", method = RequestMethod.GET)
    public ResponseEntity<?> Save() {

        HeartRate heartRate = new HeartRate();
        heartRate.setId(9000);
        heartRate.setReadDate(999999);
        heartRate.setReadValue(99999);
        heartRate.setDeviceId(99);
        this.heartRateService.save(heartRate);
        return new ResponseEntity<>("Record Save .....", HttpStatus.OK);

    }





} // end class
