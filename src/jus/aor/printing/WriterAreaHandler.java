/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

import java.io.PrintStream;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 * @author Morat 
 */
public class WriterAreaHandler extends Handler{
	/** le formatter de texte à trou */
	private Formatter f = new SimpleFormatter();
	/** le printstream à utiliser */
	private PrintStream p;
	/**
	 * Construction d'un WriterAreaHandler
	 * @param p le printstream à utiliser
	 */
	public WriterAreaHandler(PrintStream p) { this.p = p;}
	@Override
	public void publish(LogRecord record){p.println(f.formatMessage(record));}
	@Override
	public void flush(){p.flush();}
	@Override
	public void close() throws SecurityException{p.close();}
}
