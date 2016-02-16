package settings.impl;

import settings.Settings;
import settings.SettingsLocator;

public class OverriddenSettings<T> implements Settings<T> {

	public OverriddenSettings(
			SettingsLocator baseSettingsLocator, 
			SettingsLocator overridingSettingsLocator) {
		
	}
	
	@Override
	public T getConfiguration() {
		return null;
	}
}
