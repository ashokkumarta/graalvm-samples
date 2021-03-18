import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;
import java.io.File;

public class HelloPolyglot {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello from Java!");
        try (Context context = Context.create()) {
			execJSString(context, "print('Hello JavaScript!');");
			execJSFile(context, new File("hello.js"));
        }
    }
	
	static void execJSString(Context context, String code) {
		context.eval("js", "print('Hello from JavaScript!');");
	}

	static void execJSFile(Context context, File file) throws Exception {
		Source source = Source.newBuilder("js", file).build();
		context.eval(source);
	}

}

// javac HelloPolyglot.java
// java HelloPolyglot
// Compiles and runs only on GraalVM
