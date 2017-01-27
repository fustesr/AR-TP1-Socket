/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

/**
 * Représentation d'un Job (travail d'impression).
 * @author Morat 
 */
public abstract class Job  {
	/** le JobKey  de ce job */
	public JobKey key;
	/**
	 * Construction d'un Job
	 * @param key le jobKey 
	 */
	public Job(JobKey key){
		this.key=key;
	}
	/**
	 * la représentation textuelle de la forme : "job(<<b>key</b>>)"
	 */
	public String toString() {return "job("+key+")";}
}
