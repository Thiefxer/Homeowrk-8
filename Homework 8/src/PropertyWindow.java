import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class PropertyWindow {
	
	private String message;
	private final PropertyChangeSupport support = new PropertyChangeSupport(this);

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	
	public String getMessage() {
		return this.message;
	}
	
    public void setMessage (String newValue) {
    	String oldValue = this.message;
    	this.message = newValue;
    	support.firePropertyChange("message", oldValue, newValue);
    }
}

