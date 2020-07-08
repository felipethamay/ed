package tabelaHash;

public class Pessoa {

	private String nome;
	private Integer rg;
	private Integer idade;
	private String profissao;

	public Pessoa(String nome, int rg, int idade, String profissao) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
		this.profissao = profissao;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the rg
	 */
	public int getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(int rg) {
		this.rg = rg;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the profissao
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * @param profissao the profissao to set
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
