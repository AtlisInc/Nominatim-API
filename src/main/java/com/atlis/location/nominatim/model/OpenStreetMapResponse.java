/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlis.location.nominatim.model;

import com.atlis.location.model.impl.Address;

/**
 *
 * @author nf
 */
public class OpenStreetMapResponse {

    private String url;
    private String error;
    private String display_name;
    private String licence;
    private String place_id;
    private Double lon;
    private Address address;
    private String osm_id;
    private String osm_type;
    private Double lat;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(String osm_id) {
        this.osm_id = osm_id;
    }

    public String getOsm_type() {
        return osm_type;
    }

    public void setOsm_type(String osm_type) {
        this.osm_type = osm_type;
    }

    @Override
    public String toString() {
        return "ClassPojo [display_name = " + display_name + ", licence = " + licence + ", place_id = " + place_id + ", lon = " + lon + ", address = " + address + ", osm_id = " + osm_id + ", osm_type = " + osm_type + ", lat = " + lat + "]";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Response example:
     *
     * {
     * "place_id":"63949160", "licence":"Data © OpenStreetMap contributors, ODbL
     * 1.0. http:\/\/www.openstreetmap.org\/copyright", "osm_type":"way",
     * "osm_id":"34958053", "lat":"40.7903088", "lon":"-73.9599513",
     * "display_name":"97th Street Transverse, Park West Village, Manhattan, New
     * York County, New York City, New York, 10029, United States of America",
     * "address":{ "road":"97th Street Transverse", "neighbourhood":"Park West
     * Village", "suburb":"Manhattan", "county":"New York County", "city":"New
     * York City", "state":"New York", "postcode":"10029", "country":"United
     * States of America", "country_code":"us" } }
     */
}
