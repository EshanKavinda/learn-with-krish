package com.demo.factory;

public class EmeraldPackage extends Package{

	@Override
	protected void createPackage() {
		sataliteTVs.add(new LocalChannels());
		sataliteTVs.add(new BusinessChannels());
		sataliteTVs.add(new SportsChannels());
	}

}
