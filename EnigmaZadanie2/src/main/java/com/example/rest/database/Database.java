package com.example.rest.database;

import com.example.rest.model.Location;
import com.example.rest.response.LocationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Database {

    private HashMap<Long, LocationResponse> locationResponseHashMap;
    private static long index = 1;

    public Database(){
        locationResponseHashMap = new HashMap<>();
    }



    public void put(LocationResponse locationResponse){
        locationResponseHashMap.put(index, locationResponse);
        index++;
    }

    public LocationResponse getSingle(long index){
        return locationResponseHashMap.get(index);
    }

    public ArrayList<LocationResponse> getAll(){
        return new ArrayList<>(locationResponseHashMap.values());
    }


}
