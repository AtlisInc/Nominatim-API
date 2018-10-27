# Nominatim-API
Java library for reverse geocoding using Nominatim API [nominatim.openstreetmap.org](https://nominatim.openstreetmap.org/)

## Maven Dependency
```
<dependency>
  <groupId>me.atlis</groupId>
  <artifactId>nominatim-api</artifactId>
  <version>RELEASE</version>
</dependency>
```

## Usage

You can use both geocoding and reverse geocoding using this library..

### Reverse Geocoding
```
Address address = new Address();
address.setCity("New York");
MapPoint mapPoint = NominatimAPI.with(endpointUrl).getMapPointFromAddress(address, 5);
```
### Geocoding
```
Double latitude = 40.7470;
Double longitude = -73.9860;
MapPoint mapPoint = new MapPoint().buildMapPoint(latitude, longitude);
Address address = NominatimAPI.with(endpointUrl).getAddressFromMapPoint(mapPoint);
```

NominatimAPI is thread safe singleton. ```String endpointUrl = "https://nominatim.openstreetmap.org/"``` for example.

## Dependencies

* [Google GSON](https://github.com/google/gson)
* [Apache Commons Lang](http://commons.apache.org/proper/commons-lang/)
* [Apache Log4J](http://logging.apache.org/log4j/2.x/)

## License

LGPL. See LICENSE file for details.


