# Nominatim-API
Java library for reverse geocoding for Nominatim [nominatim.openstreetmap.org](https://nominatim.openstreetmap.org/)

## Maven Dependency
```
<dependency>
  <groupId>me.atlis</groupId>
  <artifactId>nominatim-api</artifactId>
  <version>RELEASE</version>
</dependency>
```

## Usage

Very simple.

```
Double latitude = 40.7470;
Double longitude = -73.9860;
Double radius = 5.0;
MapRegion mapRegion = new MapRegion().buildMapRegion(latitude, longitude, radius);
PanoramioImages panoramioImages = PanoramioAPI.with().getImagesForLocation(Arrays.asList(mapRegion));
List<PanoramioImage> images = panoramioImages.getPhotos();
```

PanoramioAPI is thread safe singleton.

## Dependencies

* [Google GSON](https://github.com/google/gson)
* [Apache Commons Lang](http://commons.apache.org/proper/commons-lang/)
* [Apache Log4J](http://logging.apache.org/log4j/2.x/)

## License

LGPL. See LICENSE file for details.


