package com.example.rest.controller;

import com.example.rest.database.Database;
import com.example.rest.model.Location;
import com.example.rest.request.LocationRequest;
import com.example.rest.response.LocationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/locations")
public class LocationController {

    public Database database = new Database();

    @PostMapping()
    public ResponseEntity<LocationResponse> create(@RequestBody LocationRequest locationRequest){
        LocationResponse locationResponse = new LocationResponse(locationRequest);
        database.put(locationResponse);
        return new ResponseEntity<>(locationResponse, HttpStatus.OK);
    }

    @GetMapping()
    public String test(){
        return "Hello World";
    }

//    @GetMapping()
//    public ResponseEntity<ArrayList<LocationResponse>> getAllLocation(){
//        return new ResponseEntity<>(database.getAll(), HttpStatus.OK);
//    }

    @GetMapping("{deviceId}")
    public ResponseEntity<LocationResponse> getSingleLocation(@PathVariable long deviceId){
         return new ResponseEntity<>(database.getSingle(deviceId), HttpStatus.OK);
    }

}
