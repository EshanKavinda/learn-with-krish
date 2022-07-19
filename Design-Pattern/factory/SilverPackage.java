package com.demo.factory;

public class SilverPackage extends Package {

	@Override
	protected void createPackage() {
		sataliteTVs.add(new LocalChannels());
	}

}
