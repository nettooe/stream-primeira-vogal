
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		if (args != null && args.length > 0) {

			for (String input : args) {
				try {
					System.out.print("input= \"" + input + "\" == ");
					char retorno = firstChar(input);
					System.out.println(retorno);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} else {

			String input = "aAbBABacafe";
			System.out.print("input= \"" + input + "\"");
			try {
				char retorno = firstChar(input);
				System.out.println(retorno);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static char firstChar(String input) throws Exception {
		Stream stream = new StreamImpl(input);

		boolean vogal = false;
		boolean consoante = false;
		boolean atualEhVogal = false;

		char c;
		Set<Character> vogaisRepetidas = new HashSet<Character>();

		while (stream.hasNext()) {
			c = stream.getNext();
			atualEhVogal = (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'
					|| c == 'u' || c == 'U');

			if (atualEhVogal && vogal && consoante && !vogaisRepetidas.contains(c)) {
				return c;
			} else {
				vogal = !consoante;
				consoante = !atualEhVogal;
			}

			if (atualEhVogal)
				vogaisRepetidas.add(c);

		}

		throw new Exception(
				"Não foi possível localizar o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream");
	}
}
