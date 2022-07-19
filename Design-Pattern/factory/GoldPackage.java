package com.demo.factory;

public class GoldPackage extends Package{

	@Override
	protected void createPackage() {
		sataliteTVs.add(new LocalChannels());
		sataliteTVs.add(new BusinessChannels());
		sataliteTVs.add(new SportsChannels());
		sataliteTVs.add(new MovieChannels());
	}

}
