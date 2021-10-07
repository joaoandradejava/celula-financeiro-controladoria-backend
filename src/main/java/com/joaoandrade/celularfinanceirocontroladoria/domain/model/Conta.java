package com.joaoandrade.celularfinanceirocontroladoria.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal saldoInicial;
	private BigDecimal saldoAtual;
	private Integer movimentacaoCredito;
	private Integer movimentacaoDebito;
	private Integer totalMovimentacao;
	private BigDecimal valorPagoMovimentacao;

	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	public Conta() {
	}

	public Conta(Long id, BigDecimal saldoInicial, BigDecimal saldoAtual, Integer movimentacaoCredito,
			Integer movimentacaoDebito, Integer totalMovimentacao, BigDecimal valorPagoMovimentacao, Pessoa pessoa) {
		super();
		this.id = id;
		this.saldoInicial = saldoInicial;
		this.saldoAtual = saldoAtual;
		this.movimentacaoCredito = movimentacaoCredito;
		this.movimentacaoDebito = movimentacaoDebito;
		this.totalMovimentacao = totalMovimentacao;
		this.valorPagoMovimentacao = valorPagoMovimentacao;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(BigDecimal saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public BigDecimal getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(BigDecimal saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public Integer getMovimentacaoCredito() {
		return movimentacaoCredito;
	}

	public void setMovimentacaoCredito(Integer movimentacaoCredito) {
		this.movimentacaoCredito = movimentacaoCredito;
	}

	public Integer getMovimentacaoDebito() {
		return movimentacaoDebito;
	}

	public void setMovimentacaoDebito(Integer movimentacaoDebito) {
		this.movimentacaoDebito = movimentacaoDebito;
	}

	public Integer getTotalMovimentacao() {
		return totalMovimentacao;
	}

	public void setTotalMovimentacao(Integer totalMovimentacao) {
		this.totalMovimentacao = totalMovimentacao;
	}

	public BigDecimal getValorPagoMovimentacao() {
		return valorPagoMovimentacao;
	}

	public void setValorPagoMovimentacao(BigDecimal valorPagoMovimentacao) {
		this.valorPagoMovimentacao = valorPagoMovimentacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(id, other.id);
	}

}
