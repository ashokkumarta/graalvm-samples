import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		try (Context context = Context.create()) {
			
			// Create Employee & Services objects
			Employee owner = new Employee("1", "Owner & employee #1");
			Services services = new Services();
			
			// Pass it to JavaScript
			context.getBindings("js").putMember("owner", owner);
			context.getBindings("js").putMember("services", services);
			
			// Invoke JavaScript execution
			execJSFile(context, new File("host.js"));
			
		}
	}

	// Executes JavaScript source 
	static void execJSFile(Context context, File file) throws Exception {
		Source source = Source.newBuilder("js", file).build();
		context.eval(source);
	}
}
