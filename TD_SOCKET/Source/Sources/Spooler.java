/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

import java.util.logging.Logger;

import jus.util.Formule;

import static jus.aor.printing.Notification.*;
/**
 * Gestionnaire de la file d'attente d'impression sur l'imprimante.
 * @author Morat 
 */
public class Spooler extends Thread {
	/** la liste de jobs en attente d'impression par le spooler */
	private Queue<JobPrint> spool = new LinkedList<JobPrint>();
	/** le spooler doit-il être actif */
	private boolean alive = true;
	/** le port du service du spooler */
	protected int port;
	/** la console de visualisation du spooler */
	protected SpoolerGUI GUI=null;
	/** le logger du spooler */
	protected Logger log = Logger.getLogger("Jus.Aor.Printing.Spooler","jus.aor.printing.Spooler");
	/**
	 * La création du spooler
	 * @param port le port de communication avec le spooler
	 */
	public Spooler(int port){
		log.setLevel(Level.INFO_2);
		// création du GUI
		GUI=new SpoolerGUI(this);
		this.port=port;
		//----------------------------------------------------------------------------- A COMPLETER
	}
	/**  
	 * fixe la durée d'impression d'un job en fonction de sa taille et d'un minimum de 100 unités.
	 * @param size la taille
	 * @return la durée en milisecondes
	 */
	private int duree(int size) {return Math.max(100,10*size);}
	/**
	 * Le spooler d'impression qui prend chaque fichier du spool et l'imprime
	 * sur l'imprimante.
	 */
	public void run() {		
		JobPrint file=null;
		while(alive || spool.size()>0){
			//----------------------------------------------------------------------------- A COMPLETER
		}
		log.log(Level.INFO_1,"Spooler.Terminated");
		GUI.dispose();
		try{
			//----------------------------------------------------------------------------- A COMPLETER
		}catch(IOException e){
			log.log(Level.SEVERE,e.getMessage());
		}
	}
	/**
	 * Ajour d'un fichier dans le spooler d'impression
	 * @param file le fichier à insérer dans le spooler.
	 */
	public synchronized void add(JobPrint file) {
		//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * renvoie le nombre de jobs en attente
	 * @return le nombre de jobs en attente
	 */
	public synchronized int  nbFileSpooled() {return spool.size();}
	/**
	 * renvoie la durée estimée pour l'impression des fichiers en attente
	 * @return la durée estimée pour l'impression des fichiers en attente
	 */
	public synchronized int  delay() {
		int size = 0;
		for( JobPrint f : spool) size+=f.size;
		return size==0?0:duree(size);
	}
	/**
	 * arret du spooler
	 */
	public void stopping() { alive = false;}
	/**
	 * fixe la forumule de calcul du temps d'impression
	 * @param f la forumule de calcul du temps d'impression
	 */
	public void impressionTimeOfSize(Formule f) {impressionTimeOfSize =f;}
}
