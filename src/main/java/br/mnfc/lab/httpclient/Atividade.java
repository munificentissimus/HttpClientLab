package br.mnfc.lab.httpclient;

import java.util.List;

public class Atividade {

	private String _id;
	private String atividade;
	private long criadaPor;
	private String dataInicio;
	private String dataFim;
	private int __v;
	private List<IntegranteAtividade> integrantes;
	private List<ContribuicaoAtividade> contribuicoes;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public long getCriadaPor() {
		return criadaPor;
	}

	public void setCriadaPor(long criadaPor) {
		this.criadaPor = criadaPor;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public int get__v() {
		return __v;
	}

	public void set__v(int __v) {
		this.__v = __v;
	}

	public List<IntegranteAtividade> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<IntegranteAtividade> integrantes) {
		this.integrantes = integrantes;
	}

	public List<ContribuicaoAtividade> getContribuicoes() {
		return contribuicoes;
	}

	public void setContribuicoes(List<ContribuicaoAtividade> contribuicoes) {
		this.contribuicoes = contribuicoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((atividade == null) ? 0 : atividade.hashCode());
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
		Atividade other = (Atividade) obj;
		if (atividade == null) {
			if (other.atividade != null)
				return false;
		} else if (!atividade.equals(other.atividade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Atividade [_id=" + _id + ", atividade=" + atividade
				+ ", criadaPor=" + criadaPor + ", dataInicio=" + dataInicio
				+ ", dataFim=" + dataFim + ", __v=" + __v + ", integrantes="
				+ integrantes + ", contribuicoes=" + contribuicoes + "]";
	}

}
