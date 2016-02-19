import java.util.Map;

import configuration.ConfigurationAccessor;
import configuration.ConfigurationProviderUtil;
import settings.ModifiableSettings;
import settings.Settings;
import settings.impl.ParameterMapSettingsLocator;


public class ModuleExample {

	public static void main(String[] args) {
		
		long companyId = 1;
		
		Map<String, String[]> parameterMap = null;
		
		ConfigurationAccessor<ConfigurationExample> configurationAccessor = 
			ConfigurationProviderUtil.getCompanyConfigurationWithOverrides(
				ConfigurationExample.class, 
				companyId,
				new ParameterMapSettingsLocator(parameterMap, "namespace--"));
		
		ConfigurationExample conf = configurationAccessor.getConfiguration();
		
		// Can access strongly typed interface without unsafe casting...
		conf.key1();

		// Additionally, configuration can be updated via the same object...
		ModifiableSettings modifiableSettings = configurationAccessor.getSettings().getModifiableSettings();
		modifiableSettings.set("key1", "new value");
		modifiableSettings.store();
	}
}