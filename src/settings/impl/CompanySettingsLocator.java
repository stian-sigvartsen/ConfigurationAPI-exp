package settings.impl;
import settings.Settings;
import settings.SettingsLocator;


public class CompanySettingsLocator implements SettingsLocator {

	private long _companyId;
	
	public CompanySettingsLocator(long companyId) {
		_companyId = companyId;
	}
	
	@Override
	public <T> Settings<T> getSettings(Class<T> clazz) {
		return null;
	}
}
