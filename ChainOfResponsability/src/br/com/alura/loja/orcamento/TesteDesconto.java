package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;
import br.com.alura.loja.descontos.CalculadoraDeDescontos;

class TesteDesconto {

	public static void main(String[] args) {
			Orcamento primeiro = new Orcamento(new BigDecimal("200"),6);
			Orcamento segundo = new Orcamento(new BigDecimal("1000"),1);
			
			CalculadoraDeDescontos calculadoraDeDesconto = new CalculadoraDeDescontos();
			System.out.println(calculadoraDeDesconto.calcular(primeiro));
			System.out.println(calculadoraDeDesconto.calcular(segundo));
	}

}
