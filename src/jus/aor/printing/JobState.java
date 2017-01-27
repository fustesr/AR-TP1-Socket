/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Représentation de l'état des jobs requis
 * @author Morat 
 */
public class JobState implements Serializable{
	private static final long serialVersionUID = 7100708038586728438L;
	/**
	 * la représentation de l'état d'un JobPrint.
	 * @author Morat
	 */
	private static class State implements Serializable {
		private static final long serialVersionUID = -3612211442041180130L;
		/** la représentation textuelle de la clé de ce job*/
		protected String key;
		/** le rang dans la file d'attente */
		protected int rang;
		/** le délai d'attente présumé pour l'impression de ce job */
		protected long delai;
		/** la taille de ce job */
		protected int size;
		/**
		 * construction de l'état d'un job 
		 * @param key la représentation textuelle de la clé du job
		 * @param rang le ranh du job
		 * @param delai le délai 
		 * @param size sa taille
		 */
		public State(String key, int rang, long delai, int size){this.key=key; this.rang = rang;this.delai = delai;this.size = size;}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		public String toString() { return key+"(rang="+rang+", delai="+delai+", size="+size+")";}
	}
	/**
	 * l'ensemble des états des jobs requis.
	 */
	public List<State> jobs = new LinkedList<State>();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s="";
		for(State e : jobs) s+=e+"\n";
		return s;
	}
	/**
	 * ajout à l'ensemble de l'état d'un JobPrint requis 
	 * @param j le JobPrint
	 * @param rang le rang de ce job dans le spooler
	 * @param delai le délai d'attente avant impression.
	 */
	public void add(JobPrint j, int rang, long delai ) {
		jobs.add(new State(j.key.toString(),rang, delai,j.size));
	}
}
