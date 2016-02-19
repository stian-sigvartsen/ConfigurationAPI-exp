import settings.Settings;


public interface ConfigurationAccessor<T> {

	public T getConfiguration();
	public Settings getSettings();
}
