package com.demo.singleton;

public class MainApp {
	
	public static void main(String[] args) {
		
		DBManager dbManager1 = DBManager.getDBConnection();
		System.out.println(dbManager1);
		
		DBManager dbManager2 = DBManager.getDBConnection();
		System.out.println(dbManager2);
		
	}

}
