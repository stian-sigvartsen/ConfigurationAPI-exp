package configuration.impl;
import configuration.ConfigurationAccessor;
import settings.Settings;


public class ConfigurationAccessorImpl<T> implements ConfigurationAccessor<T> {

	public ConfigurationAccessorImpl(Class<T> clazz, Settings settings) {}
	
	@Override
	public T getConfiguration() {
		return null;
	}
	
	@Override
	public Settings getSettings() {
		return null;
	}

}
