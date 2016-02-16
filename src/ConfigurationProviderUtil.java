import settings.Settings;
import settings.SettingsLocator;
import settings.impl.CompanySettingsLocator;
import settings.impl.OverriddenSettings;

public class ConfigurationProviderUtil {

	public static <T> Settings<T> getCompanyConfigurationWithOverrides(
			Class<T> clazz, 
			long companyId,
			SettingsLocator overrideSettingsLocator) {
		
		return new OverriddenSettings<T>(
			new CompanySettingsLocator(companyId),
			overrideSettingsLocator);
	}
	
	public static <T> Settings<T> getConfigurationWithOverrides(
			Class<T> clazz, 
			SettingsLocator baseSettingsLocator,
			SettingsLocator overrideSettingsLocator) {
		
		return new OverriddenSettings<T>(
				baseSettingsLocator,
				overrideSettingsLocator);
	}
}
