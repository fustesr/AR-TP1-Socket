/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

/**
 * @author Morat 
 */
public class Level extends java.util.logging.Level {
	private static final long serialVersionUID = 1L;
	/**
	 * @param name
	 * @param value
	 */
	protected Level(String name, int value){super(name, value);}
	/**
	 * Les niveaux  d'INFO
   */
  public static final Level INFO_1 = new Level("INFO_1",810);
	public static final Level INFO_2 = new Level("INFO_2",820);
	public static final Level INFO_3 = new Level("INFO_3",830);
	public static final Level INFO_4 = new Level("INFO_4",840);
}
