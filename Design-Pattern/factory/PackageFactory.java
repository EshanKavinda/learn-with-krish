package com.demo.factory;

public class PackageFactory {
	
	public static Package createPackage (PackageCode code) {
		
		switch(code) {
			case SILVER:
				return new SilverPackage();
			case DIAMOND:
				return new DiamondPackage();
			case EMERALD:
				return new EmeraldPackage();
			case GOLD: 
				return new GoldPackage();
			default:
				return null;
		}
		
	}

}
