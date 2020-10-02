package singleton;
/**
 *
 * @author Ygor
 */
public class ClasseB {
    	private static ClasseB INSTANCE;
	public ClasseA a = new ClasseA();

	public ClasseB() {
		System.out.println("Instancia criada com sucesso!");
	}

	public static ClasseB GetInstance() {
		if (INSTANCE == null) {
			synchronized (ClasseB.class) {
				if (INSTANCE == null) {
					INSTANCE = new ClasseB();
				}
			}
		}
		return INSTANCE;
	}
}

