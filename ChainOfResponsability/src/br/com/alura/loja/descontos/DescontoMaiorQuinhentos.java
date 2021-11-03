package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class DescontoMaiorQuinhentos extends Desconto {

	public DescontoMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal(500))>0)
		{
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		// TODO Auto-generated method stub
		return proximo.calcular(orcamento);
	}	

}
