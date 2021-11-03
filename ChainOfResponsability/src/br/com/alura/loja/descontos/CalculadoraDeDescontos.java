package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto desconto = new DescontoMaiorCinco(
				new DescontoMaiorQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
