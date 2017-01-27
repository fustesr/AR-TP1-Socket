/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

/**
 * Représentation d'un JobPrint (travail d'impression) étendu avec le contenu et la taille de ce
 * qui doit être imprimé.
 * @author Morat 
 */
public class JobPrint extends Job {
	/**
	 * le contenu d'impression
	 */
	public String content;
	/**
	 * la taille du contenu
	 */
	public int size;
	/**
	 * Construction d'un JobPrint
	 * @param key le jobKey 
	 * @param content la chaine représentant le contenu du fichier d'impression
	 */
	public JobPrint(JobKey key, String content){
		super(key);
		this.content = content;
		size=content.length();
	}
}
