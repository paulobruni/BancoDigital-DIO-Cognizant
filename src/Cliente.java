import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class Cliente {

	private String nome;
	private int idade;
	private String endereco;

	@Override
	public String toString() {
		return "Cliente{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", endereco='" + endereco + '\'' +
				'}';
	}
}
