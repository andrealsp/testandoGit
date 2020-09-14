package control;

import org.apache.log4j.Logger;

import br.telefonica.gonext.nginservices.CleanNginIn;
import br.telefonica.gonext.nginservices.CleanNginOut;
import br.telefonica.gonext.nginservices.NGINServicesImplService;
import br.telefonica.gonext.nginservices.NGINServicesWS;
import br.telefonica.gonext.nginservices.UserManagementIn;

public class NGIN {

	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

	public void cleanNginIn(String USUARIO, String SENHA, String LinhaTelefonica) {

		CleanNginIn in = new CleanNginIn();
		UserManagementIn user = new UserManagementIn();

		user.setUsername(USUARIO);
		user.setPassword(SENHA);
		in.setMsisdn(LinhaTelefonica);

		try {
			NGINServicesImplService service = new NGINServicesImplService();
			NGINServicesWS port = service.getNGINServicesWSPort();

			CleanNginOut out = port.cleanNgin(user, in);
			logger.info(out.getMessageStatus());
			logger.info(out.getStatus());
			logger.info(out.getScriptData());
		} catch (Exception e) {
			logger.error(e);
		}

	}
}
