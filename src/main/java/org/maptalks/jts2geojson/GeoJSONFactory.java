package org.maptalks.jts2geojson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.maptalks.geojson.Feature;
import org.maptalks.geojson.FeatureCollection;
import org.maptalks.geojson.GeoJSON;
import org.maptalks.geojson.Geometry;


public class GeoJSONFactory {

    public static GeoJSON create(String json) {
        JSONObject node = JSON.parseObject(json);
        String type = node.getString("type");
        if (type.equals("FeatureCollection")) {
            return readFeatureCollection(node);
        } else if (type.equals("Feature")) {
            return readFeature(node);
        } else {
            return readGeometry(node, type);
        }

    }
    
    private static FeatureCollection readFeatureCollection(JSONObject node) {
        return JSON.toJavaObject(node,FeatureCollection.class);
    }
    
    private static Feature readFeature(JSONObject node) {
        return JSON.toJavaObject(node, Feature.class);
    }
    
    private static Geometry readGeometry(JSONObject node, String type) {
        Object obj;
        try {
            obj = JSON.toJavaObject(node, Class.forName("org.maptalks.geojson." + type));
        } catch (ClassNotFoundException e) {
            return null;
        }
        return ((Geometry) obj);
    }
}
