package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class SemDesconto extends Desconto {
	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}	
}
