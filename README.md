## 2015-8-15 by FuZhenn

thanks to bjornharrtell's work: https://github.com/bjornharrtell/jts2geojson

use fastjson instead of jackson to parse json, performance improved for about 2 times.

## Introduction

This Java library can convert JTS geometries to GeoJSON and back. Its API is similar to other io.* classes in JTS.

[![Build Status](https://travis-ci.org/bjornharrtell/jts2geojson.svg?branch=master)](https://travis-ci.org/bjornharrtell/jts2geojson)

## Usage

```java

  GeoJSONWriter writer = new GeoJSONWriter();
  GeoJSON json = writer.write(geometry);
  String jsonstring = json.toString();

  GeoJSONReader reader = new GeoJSONReader();
  Geometry geometry = reader.read(json);
  
```

## Features and FeatureCollections

JTS does not have anything like GeoJSON Feature or FeatureCollection but they can be parsed by this library. Example:

```java

  // parse Feature or FeatureCollection
  Feature feature = (Feature) GeoJSONFactory.create(json);
  FeatureCollection featureCollection = (FeatureCollection) GeoJSONFactory.create(json);
  
  // parse Geometry from Feature
  GeoJSONReader reader = new GeoJSONReader();
  Geometry geometry = reader.read(feature.getGeometry());
  geometry = reader.read(featureCollection.getFeatures()[0].getGeometry());
  
  // create and serialize a FeatureCollection
  List<Features> features = new ArrayList<Features>();
  Map<String, Object> properties = new HashMap<String, Object>();
  features.add(new Feature(geometry, properties);
  GeoJSONWriter writer = new GeoJSONWriter();
  GeoJSON json = writer.write(features);

```
