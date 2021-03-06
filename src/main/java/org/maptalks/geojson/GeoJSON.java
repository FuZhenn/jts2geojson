package org.maptalks.geojson;


import com.alibaba.fastjson.JSON;

public abstract class GeoJSON {

    private String type;
    
    public GeoJSON() {
        setType(getClass().getSimpleName());
    }
    
    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
