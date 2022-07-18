package com.demo.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<TvType, Television> tvs = new HashMap<>();

    public Registry() {
         this.initialize();
    }
    
    public Television getTelevision(TvType type){
        Television tv = null;
        try {
             tv = (Television) tvs.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  tv;
    }

    private void initialize() {
    	
    	CRTTelevision crtTelevision = new CRTTelevision();
    	crtTelevision.setBrandName("SINGER");
    	crtTelevision.setAspectRatio("4:3");
    	crtTelevision.setWeight(15);

    	LEDTelevision ledTelevision = new LEDTelevision();
    	ledTelevision.setBrandName("SAMSUNG");
    	ledTelevision.setAspectRatio("16:9");
    	ledTelevision.setScreenSize(55);

        tvs.put(TvType.CRT,crtTelevision);
        tvs.put(TvType.LED,ledTelevision);
    }

}
