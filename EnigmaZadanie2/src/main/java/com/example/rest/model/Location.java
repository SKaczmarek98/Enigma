package com.example.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    private long deviceId;
    private int latitiude;
    private int longitude;

    public Location(Location location){
        this.deviceId = location.getDeviceId();
        this.latitiude = location.getLatitiude();
        this.longitude = location.getLongitude();
    }
}
