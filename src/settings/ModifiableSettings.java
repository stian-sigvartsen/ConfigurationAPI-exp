package settings;

public interface ModifiableSettings {
	
	public void set(String configurationKey, String value);
	public void store();
}
