package automationFramework;

public class AutomacaoCAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogarCAM logarCAM = new LogarCAM();
		AcessarOrdensControle acessar = new AcessarOrdensControle();

		logarCAM.logarCAM();
		acessar.AcessarOrdens();

	}

}
