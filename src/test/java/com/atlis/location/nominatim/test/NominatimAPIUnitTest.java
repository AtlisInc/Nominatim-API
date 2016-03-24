package com.atlis.location.nominatim.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.atlis.location.model.impl.Address;
import com.atlis.location.model.impl.MapPoint;
import com.atlis.location.nominatim.NominatimAPI;
import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michaelassraf
 */
public class NominatimAPIUnitTest {

    String endpointUrl = "http://nominatim.openstreetmap.org/";

    @Test
    public void testAddressToMapPoint() {

        List<String> cities = Arrays.asList("New York", "Berlin", "Jerusalem", "Tel Aviv", "Rome");

        for (String city : cities) {
            Address address = new Address();
            address.setCity(city);
            MapPoint mapPoint = NominatimAPI.with(endpointUrl).getMapPointFromAddress(address, 5);
            assertNotNull("Map point object is bad.", mapPoint);
        }
    }

    @Test
    public void testMapPointToAddress() {
        List<Pair<Double, Double>> points
                = Arrays.asList(new Pair<>(40.7470, -73.9860),
                        new Pair<>(25.778135, -80.179100),
                        new Pair<>(31.853431, 35.233367),
                        new Pair<>(55.751244, 37.618423),
                        new Pair<>(33.510414, 36.278336),
                        new Pair<>(35.715298, 51.404343));
        for (Pair<Double, Double> point : points) {
            MapPoint mapPoint = new MapPoint().buildMapPoint(point.getKey(), point.getValue());
            Address address = NominatimAPI.with(endpointUrl).getAddressFromMapPoint(mapPoint);
            assertNotNull("Address object is bad.", address);
        }
    }
}
