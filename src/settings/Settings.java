package settings;

public interface Settings<T> {

	public T getConfiguration();
	public ModifiableSettings getModifiableSettings();
}
