package com.hmhs.hmkvitals.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import java.io.Serializable;


@NamedNativeQuery(name = "Spo2.getLatestRead",query = "select * from spo2  where readDate = (select max(readDate) from spo2)", resultClass= Spo2.class)

@Entity(name="Spo2")
@Table(name="spo2")

public class Spo2 implements Serializable {

    @Id
    private Integer id;
    private Integer deviceId;
    private Integer readValue;
    private Integer readDate;

    public Spo2() {
        ;
    }

    public Spo2(Integer id, Integer deviceId, Integer readValue, Integer readDate) {
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
