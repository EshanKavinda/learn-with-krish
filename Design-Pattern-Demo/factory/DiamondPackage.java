package com.demo.factory;

public class DiamondPackage extends Package{

	@Override
	protected void createPackage() {
		sataliteTVs.add(new LocalChannels());
		sataliteTVs.add(new BusinessChannels());
	}

}
