package settings.impl;
import java.util.Map;

import settings.Settings;
import settings.SettingsLocator;


public class ParameterMapSettingsLocator implements SettingsLocator {

	private Map<String, String[]> _parameterMap;
	private String _paramNamespace;
	
	public ParameterMapSettingsLocator(
			Map<String, String[]> parameterMap,
			String paramNamespace) {
		
		_parameterMap = parameterMap;
		_paramNamespace = paramNamespace;
	}
	
	@Override
	public Settings getSettings() {
		return null;
	}
}
