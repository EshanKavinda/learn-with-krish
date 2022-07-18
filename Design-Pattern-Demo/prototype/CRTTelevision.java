package com.demo.prototype;

public class CRTTelevision extends Television{

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
    public String toString() {
        return "CRT Television{" +
                "TV Weight='" + weight + '\'' +
                '}';
    }
	
}
