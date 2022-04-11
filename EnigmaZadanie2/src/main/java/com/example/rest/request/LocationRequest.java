package com.example.rest.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationRequest {
    private long deviceId;
    private int latitiude;
    private int longitude;
}
