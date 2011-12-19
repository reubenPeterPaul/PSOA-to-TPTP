package psoa.to.tptp.restful.resources;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;

enum ShellUtil {
	;
	protected static final String VKERNEL = "vkernel";
	protected static final String ECHO = "echo";	
	protected static final String RREDIRECT = "<";
	protected static final String LPAREN = "(";
	protected static final String RPAREN = ")";
	
	protected static String rredirect(String s) {
		return RREDIRECT+s;
	}
	
	protected static String subshell(String s) {
		return wrap(s,"(",")");
	}
	
	protected static String wrap(String s, String head, String tail) {
		return head+s+tail;
	}
	
	protected static DefaultExecuteResultHandler resultHandler() {
		return new DefaultExecuteResultHandler();
	}
	
	protected static ExecuteWatchdog watchdog() {
		return new ExecuteWatchdog(60*1000);
	}
	
	protected static Executor executor(ExecuteWatchdog dog) {
		Executor e = new DefaultExecutor();
		e.setWatchdog(dog);
		return e;
	}
	
	protected static void execute(CommandLine cl, DefaultExecuteResultHandler h, OutputStream out) throws ExecuteException, IOException {
		Executor e = executor(watchdog());
		PumpStreamHandler psh = new PumpStreamHandler(out);
		e.setStreamHandler(psh);
		e.execute(cl, h);
	}
	
	protected static CommandLine cl(String s) {
		return new CommandLine(s);
	}

	protected static String echo(String s) {
		return ECHO+padl(s);
	}
	
	protected static String padl(String s) {
		return " "+s;
	}
	
	protected static String parenthesize(String s) {
		return LPAREN+s+RPAREN;
	}
}
