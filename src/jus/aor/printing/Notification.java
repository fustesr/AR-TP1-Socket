/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aor.printing;

import java.io.Serializable;

/**
 * l'ensemble des notifications pouvant être échangées entre le client et le serveur.
 * @author Morat 
 */
public enum Notification implements Serializable {
	QUERY_PRINT, REPLY_PRINT_OK;
}

