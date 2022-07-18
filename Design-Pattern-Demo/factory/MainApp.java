package com.demo.factory;

public class MainApp {
	
	public static void main(String[] args) {
		
		Package package1 = PackageFactory.createPackage(PackageCode.SILVER);
		System.out.println(package1);
		
		Package package2 = PackageFactory.createPackage(PackageCode.DIAMOND);
		System.out.println(package2);
		
		Package package3 = PackageFactory.createPackage(PackageCode.EMERALD);
		System.out.println(package3);
		
		Package package4 = PackageFactory.createPackage(PackageCode.GOLD);
		System.out.println(package4);
		
	}
}
