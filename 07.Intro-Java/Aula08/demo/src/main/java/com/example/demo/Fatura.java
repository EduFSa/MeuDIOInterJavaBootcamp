package com.example.demo;

import java.util.Calendar;

public class Fatura {
	private Calendar dataVencimento; // Data de Vencimento
	private Calendar dataLimite; // Data limite sem Juros
	private final double valor; // Valor da fatura
	private static final int DIAS_APOS_VENCIMENTO = 10; // Dias até cobrança de juros após vencimento

	// Construtor recebendo valor, ano, mes e dia.
	public Fatura(final Double valor, final Integer ano, final Integer mes, final Integer dia) {
		this.valor = valor;
		dataVencimento = Calendar.getInstance();
		dataVencimento.set(Calendar.YEAR, ano);
		dataVencimento.set(Calendar.MONTH, mes - 1); // O mês da biblioteca é sempre menos 1
		dataVencimento.set(Calendar.DAY_OF_MONTH, dia);
		calculaDataLimite();
	}

	// Construtor default com a data padrão o dia atual
	public Fatura(Double valor) {
		dataVencimento = Calendar.getInstance();
		this.valor = valor;
		calculaDataLimite();
	}

	private void calculaDataLimite() {
		// Clona uma nova instância baseada na data anterior
		dataLimite = (Calendar) dataVencimento.clone();

		// Adiciona a quantidade de dias a aceitar cobrança sem juros
		dataLimite.add(Calendar.DATE, Fatura.DIAS_APOS_VENCIMENTO);

		if (dataLimite.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			dataLimite.add(Calendar.DATE, 2);
		} else if (dataLimite.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			dataLimite.add(Calendar.DATE, 1);
		}
	}

	@Override
	public String toString() {
		// OBS.: O uso do append permite um melhor desempenho em casos em que seja
		// necessário.
		return new StringBuilder().append("Valor: ").append(this.valor).append("; Data de Vencimento: ")
				.append(dataVencimento.getTime()).append("; Data Limite de Pagamento sem juros: ")
				.append(dataLimite.getTime()).toString();
	}

	public static void main(String[] args) {
		try {
			if (args.length == 4) {
				Fatura fatura = new Fatura(Double.parseDouble(args[0]), Integer.parseInt(args[1]),
						Integer.parseInt(args[2]), Integer.parseInt(args[3]));
				System.out.println(fatura.toString());
			} else if (args.length == 0) {
				Fatura fatura = new Fatura(200.0);
				System.out.println(fatura.toString());
			} else {
				System.out.println("Fatura Valor Ano Mes Dia");
			}
		} catch (NumberFormatException e) {
			System.out.println("Fatura Valor Ano Mes Dia");
		}

	}
}
