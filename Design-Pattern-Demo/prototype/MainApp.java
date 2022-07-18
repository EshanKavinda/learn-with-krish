package com.demo.prototype;

public class MainApp {
	
	public static void main(String[] args) {
		
		Registry registry = new Registry();
		
		LEDTelevision television = (LEDTelevision) registry.getTelevision(TvType.LED);
        System.out.println(television);

        television.setScreenSize(32);

        System.out.println(television);

        LEDTelevision television1 = (LEDTelevision) registry.getTelevision(TvType.LED);
        System.out.println(television1);
		
	}

}
