package com.demo.singleton;

public class DBManager {

	private static volatile DBManager dbManager;

    private DBManager() {
        if(dbManager!=null){
            throw new RuntimeException("Please use getDBConnection Method");
        }
    }

    public static DBManager getDBConnection() {
        if(dbManager==null){
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }
	
}
