package com.atlis.panoramio.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.atlis.location.model.impl.Address;
import com.atlis.location.model.impl.MapPoint;
import com.atlis.location.nominatim.NominatimAPI;
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
        Address address = new Address();
        address.setCity("New York");
        MapPoint mapPoint = NominatimAPI.with(endpointUrl).getMapPointFromAddress(address, 5);
        assertNotNull("Map point object is bad.", mapPoint);
    }

    @Test
    public void testMapPointToAddress() {
        Double latitude = 40.7470;
        Double longitude = -73.9860;
        MapPoint mapPoint = new MapPoint().buildMapPoint(latitude, longitude);
        Address address = NominatimAPI.with(endpointUrl).getAddressFromMapPoint(mapPoint);
        assertNotNull("Address object is bad.", address);
        assertEquals("New York City", address.getCity());
    }
}
