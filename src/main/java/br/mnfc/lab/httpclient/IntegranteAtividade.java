package br.mnfc.lab.httpclient;

public class IntegranteAtividade {
	private long matricula;
	private String nome;
	private String _id;

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (matricula ^ (matricula >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntegranteAtividade other = (IntegranteAtividade) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IntegranteAtividade [matricula=" + matricula + ", nome=" + nome
				+ ", _id=" + _id + "]";
	}

}
