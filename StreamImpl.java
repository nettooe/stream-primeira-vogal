

public class StreamImpl implements Stream {

	private String input;
	private int posicao;

	public StreamImpl(String input) {
		this.input = input;
	}

	@Override
	public char getNext() {
		return this.input.charAt(this.posicao++);
	}

	@Override
	public boolean hasNext() {
		return this.posicao < this.input.length();
	}

}
