package com.example.rest.response;

import com.example.rest.request.LocationRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationResponse {
    private long deviceId;
    private int latitiude;
    private int longitude;

    public LocationResponse(LocationRequest locationRequest){
        deviceId = locationRequest.getDeviceId();
        latitiude = locationRequest.getLongitude();
        longitude = locationRequest.getLatitiude();
    }
}
