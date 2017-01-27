/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Classe de service fournissant toutes les interactions (read, write) en mode TCP.
 * @author Morat 
 */
class TCP{
	private static final int MAX_LEN_BUFFER = 1024;
	/**
	 * 
	 * @param soc the socket
	 * @param not the notification
	 * @throws IOException
	 */
	static void writeProtocole(Socket soc,  Notification not) throws IOException {
        OutputStream os = soc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(not.ordinal());
	}
	/**
	 * 
	 * @param soc the socket 
	 * @return the notification
	 * @throws IOException
	 */
	static Notification readProtocole(Socket soc) throws IOException {
        InputStream is = soc.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        int not = dis.readInt();
        
        return Notification.values()[not];
	}
	/**
	 * 
	 * @param soc the socket
	 * @param key the JobKey to write
	 * @throws IOException
	 */
	static void writeJobKey(Socket soc, JobKey key) throws IOException {
        OutputStream os = soc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        byte[] tab = key.marshal();
        dos.writeInt(tab.length);
        dos.write(tab);
	}
	/**
	 * 
	 * @param soc the socket
	 * @return the JobKey
	 * @throws IOException
	 */
	static JobKey readJobKey(Socket soc) throws IOException {
		InputStream is = soc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		int len = dis.readInt();

		byte[] tab = new byte[len];

		int wRead = 0;
		while (wRead < len) {
			wRead += dis.read(tab, wRead, len - wRead);
		}

		return new JobKey(tab);
	}
	/**
	 * 
	 * @param soc the socket
	 * @param fis the input stream ti transfert
	 * @param len th len of the input stream
	 * @throws IOException
	 */
	static void writeData(Socket soc, InputStream fis, int len) throws IOException {
	//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * 
	 * @param soc th socket
	 * @return string data 
	 * @throws IOException
	 */
	static String readData(Socket soc) throws IOException {
	//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * 
	 * @param soc the socket
	 * @param jobs the JobState
	 * @throws IOException
	 */
	static void writeJobState(Socket soc,  JobState jobs) throws IOException {
	//----------------------------------------------------------------------------- A COMPLETER
	}
	/**
	 * 
	 * @param soc the socket 
	 * @return the JobState
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	static JobState readJobState(Socket soc) throws IOException, ClassNotFoundException {
	//----------------------------------------------------------------------------- A COMPLETER
	}
}
