package app;

import java.util.Calendar;

import org.apache.log4j.Logger;

import control.NGIN;
import control.SDP;

public class CleanMain {

	NGIN ngin = new NGIN();
	SDP sdp = new SDP();

	private Logger logger = Logger.getLogger(CleanMain.class.getSimpleName());

	public static void main(String[] args) {
		CleanMain app = new CleanMain();

		String usuario = "USUARIO";
		String senha = "SENHA";
		String[] linhas = { "11944871503","11944871503","11944871503" };

		System.out.println(Calendar.getInstance().getTime() + " - Iniciando CleanNGIN e CleanSDP");

		for (String LinhaTelefonica : linhas) {
			app.executar(usuario, senha, LinhaTelefonica);
		}

		System.out.println("\n\n" + Calendar.getInstance().getTime() + " - CleanNGIN e CleanSDP finalizados.");

	}

	public void executar(String usuario, String senha, String linhaTelefonica) {

		logger.info("\n\n CleanNGIN - " + linhaTelefonica);
		ngin.cleanNginIn(usuario, senha, linhaTelefonica);

		logger.info("\n\n CleanSDP - " + linhaTelefonica);
		sdp.cleanSdpIn(usuario, senha, linhaTelefonica);
	}

}