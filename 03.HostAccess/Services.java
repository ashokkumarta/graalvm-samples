import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;

// Service class to create Employee objects
public class Services {
	
	// Factory method.
    @HostAccess.Export
    public Employee createEmployee(String id, String name) {
        return new Employee(id, name);
    }
}
