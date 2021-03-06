package com.example.qa.testbase.driverfactory;

import com.example.qa.testbase.BrowsersEnum;
import com.example.qa.testbase.TestModesEnum;

public class DriverFactory {

	public DriverInterface createDriver(final TestModesEnum testMode, final BrowsersEnum browser) {
		switch (browser) {
		case CHROME:
			return new ChromeFactory(testMode);
		case FIREFOX:
			return new FirefoxFactory(testMode);
		case EDGE:
			return new EdgeFactory(testMode);
		default:
			throw new UnsupportedOperationException("Browser type is not yet supported");
		}
	}
}