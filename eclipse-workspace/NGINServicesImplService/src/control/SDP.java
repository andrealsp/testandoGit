package control;

import org.apache.log4j.Logger;

import br.telefonica.gonext.nginservices.CleanSDPIn;
import br.telefonica.gonext.nginservices.CleanSDPOut;
import br.telefonica.gonext.nginservices.NGINServicesImplService;
import br.telefonica.gonext.nginservices.NGINServicesWS;
import br.telefonica.gonext.nginservices.UserManagementIn;

public class SDP {
	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

	public void cleanSdpIn(String USUARIO, String SENHA, String LinhaTelefonica) {
		CleanSDPIn in = new CleanSDPIn();
		UserManagementIn user = new UserManagementIn();

		user.setUsername(USUARIO);
		user.setPassword(SENHA);
		in.setMsisdn(LinhaTelefonica);

		try {
			NGINServicesImplService service = new NGINServicesImplService();
			NGINServicesWS port = service.getNGINServicesWSPort();

			CleanSDPOut out = port.cleanSDP(user, in);
			logger.info(out.getMessageStatus());
			logger.info(out.getStatus());
			logger.info(out.getScriptData());
		} catch (Exception e) {
			logger.error(e);
		}

	}

}
