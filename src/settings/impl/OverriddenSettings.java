package settings.impl;

import settings.ModifiableSettings;
import settings.Settings;
import settings.SettingsLocator;

public class OverriddenSettings implements Settings {

	public OverriddenSettings(
			SettingsLocator baseSettingsLocator, 
			SettingsLocator overridingSettingsLocator) {}

	@Override
	public ModifiableSettings getModifiableSettings() {
		return null;
	}
}
