import settings.Settings;
import settings.SettingsLocator;
import settings.impl.CompanySettingsLocator;
import settings.impl.OverriddenSettings;

public class ConfigurationProviderUtil {

	public static <T> ConfigurationAccessor<T> getCompanyConfigurationWithOverrides(
			Class<T> clazz, 
			long companyId,
			SettingsLocator overrideSettingsLocator) {
		
		return new ConfigurationAccessorImpl<T>(
			clazz, 
			new OverriddenSettings(new CompanySettingsLocator(companyId), overrideSettingsLocator));
		
	}
	
	public static <T> ConfigurationAccessor<T> getConfigurationWithOverrides(
			Class<T> clazz, 
			SettingsLocator baseSettingsLocator,
			SettingsLocator overrideSettingsLocator) {
		
		return new ConfigurationAccessorImpl<T>(
			clazz, 
			new OverriddenSettings(baseSettingsLocator, overrideSettingsLocator));	
	}
}
