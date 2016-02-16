package settings;

public interface SettingsLocator {

	public <T> Settings<T> getSettings(Class<T> clazz);
}
