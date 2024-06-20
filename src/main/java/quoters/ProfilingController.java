package quoters;

public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled = true;

    public ProfilingController(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
