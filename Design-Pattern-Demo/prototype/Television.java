package com.demo.prototype;

public abstract class Television implements Cloneable{
	
	private String brandName;
	private String aspectRatio;
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getAspectRatio() {
		return aspectRatio;
	}
	
	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
	
	

}
