import java.util.Map;

import settings.ModifiableSettings;
import settings.Settings;
import settings.impl.ParameterMapSettingsLocator;


public class ModuleExample {

	public static void main(String[] args) {
		
		long companyId = 1;
		
		Map<String, String[]> parameterMap = null;
		
		Settings<ConfigurationExample> settings = 
			ConfigurationProviderUtil.getCompanyConfigurationWithOverrides(
				ConfigurationExample.class, 
				companyId,
				new ParameterMapSettingsLocator(parameterMap, "namespace--"));
		
		ConfigurationExample conf = settings.getConfiguration();
		
		// Can access strongly typed interface without unsafe casting...
		conf.key1();

		// Additionally, configuration can be updated via the same object...
		ModifiableSettings modifiableSettings = settings.getModifiableSettings();
		modifiableSettings.set("key1", "new value");
		modifiableSettings.store();
	}
}