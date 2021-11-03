package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class DescontoMaiorCinco extends Desconto {
	public DescontoMaiorCinco(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidade()>5)
		{
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		// TODO Auto-generated method stub
		return proximo.calcular(orcamento);
	}	
}
