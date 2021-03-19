import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;

//Employee class
public class Employee {

	// Id cannot be access outside. Must use getter
    private final String id;

	// Allow direct access to name
    @HostAccess.Export
    public final String name;

    Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// Allow access to getter
    @HostAccess.Export
    public String getName() {
        return name;
    }

	// Allow access to getter
    @HostAccess.Export
    public String getId() {
        return id;
    }
}
