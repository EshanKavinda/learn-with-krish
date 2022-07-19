package com.demo.builder;

public class Pizza {
	
	private final String name;
	private final String shop;
	private final String type;
	private final String size;
	private final double weight;
	
	public Pizza(Builder builder) {
		this.name = builder.name;
		this.shop = builder.shop;
		this.type = builder.type;
		this.size = builder.size;
		this.weight = builder.weight;
	}
	
	static class Builder{
		private String name;
		private String shop;
		private String type;
		private String size;
		private double weight;
		
		public Pizza build() {
			return new Pizza(this);
		}
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder shop(String shop) {
			this.shop = shop;
			return this;
		}
		
		public Builder type(String type) {
			this.type = type;
			return this;
		}
		
		public Builder size(String size) {
			this.size = size;
			return this;
		}
		
		public Builder weight(double weight) {
			this.weight = weight;
			return this;
		}
		
	}
	
	@Override
    public String toString() {
        return "Pizza{" +
                "name=" + name +
                ", shop=" + shop +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

}
