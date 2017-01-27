/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Arrays;

/**
 * Classe de service fournissant toutes les interactions (read, write) en mode UDP.
 * @author Morat 
 */
public class UDP{
	/** adresse IP du groupe pour le spooler et les clients lors de la notification REPLY_PRINT_ENDED */
	public static final String PrintSpoolerGroupIPAddress = "230.0.0.1";
	/** taille maximale de bufferisation acceptée */
	private static final int MAX_LEN_BUFFER = 1024;
	/**
	 * 
	 * @param soc la socket
	 * @param remoteAddress IP remote address
	 * @param status the status to write
	 * @throws IOException
	 */
	static void writeStatus(DatagramSocket soc, SocketAddress remoteAddress, ServerStatus status) throws IOException {
		//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * 
	 * @param soc the socket
	 * @return the status and the corresponding DataGramPacket
	 * @throws IOException
	 */
	static Paire<ServerStatus,SocketAddress> readStatus(DatagramSocket soc) throws IOException {
		//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * 
	 * @param soc the socket
	 * @param remoteAddress the remote address
	 * @param not the notification to write
	 * @throws IOException
	 */
	static void writeProtocole(DatagramSocket soc, SocketAddress remoteAddress,  Notification not) throws IOException {
		//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * 
	 * @param soc the socket 
	 * @return the notification and the corresposding dataGramPacket 
	 * @throws IOException
	 */
	static Paire<Notification,SocketAddress> readProtocole(DatagramSocket soc) throws IOException {
		//----------------------------------------------------------------------------- A COMPLETER
	}
	static void writeEndPrint(DatagramSocket soc, SocketAddress remoteAddress, JobKey key) throws IOException {
		//----------------------------------------------------------------------------- A COMPLETER
	}
	static Paire<Notification,JobKey> readEndPrint(DatagramSocket soc) throws IOException {
		//----------------------------------------------------------------------------- A COMPLETER
	}
}
