package Tests;

/**
 * Esta línea importa la clase org.junit.jupiter.api.BeforeEach,
 * que es una anotación que se utiliza para indicar que el método
 * al que se aplica se ejecutará antes de cada método de prueba en la clase.
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaKnightsTest1 {

	/**
	 * Este método se ejecuta antes de cada método de prueba en la clase JavaKnightsTest1.
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Este método es un método de prueba que se utiliza para probar la funcionalidad
	 * de la clase JavaKnights. En este caso, el método siempre fallará con el mensaje
	 * "Not yet implemented".
	 */
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
