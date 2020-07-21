package com.hmhs.hmkvitals.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;


@NamedNativeQuery(name = "HeartRate.getLatestRead",query = "select * from heartRate  where readDate = (select max(readDate) from heartRate)", resultClass=HeartRate.class)

@Entity(name="HeartRate")
@Table(name="heartRate")


public class HeartRate implements Serializable {

    @Id
    private Integer id;
    private Integer deviceId;
    private Integer readValue;
    private Integer readDate;

    public HeartRate() {
        ;
    }

    public HeartRate(Integer id, Integer deviceId, Integer readValue, Integer readDate) {
        this.id  = id;
        this.deviceId = deviceId;
        this.readValue = readValue;
        this.readDate = readDate;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getReadDate() {
        return readDate;
    }
    public void setReadDate(Integer readDate) {
        this.readDate = readDate;
    }

    public Integer getReadValue() {
        return readValue;
    }
    public void setReadValue(Integer readValue) {
        this.readValue = readValue;
    }




}
