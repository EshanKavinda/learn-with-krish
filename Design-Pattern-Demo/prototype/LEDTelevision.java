package com.demo.prototype;

public class LEDTelevision extends Television{
	
	private int screenSize;

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	@Override
    public String toString() {
        return "LED Television{" +
                "TV Screen Size='" + screenSize + '\'' +
                '}';
    }

}
