package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio20 {

	public static void main(String[] args) {
		/*
		 * Conversão de temperatura: Crie um programa que solicita ao usuário uma
		 * temperatura em graus Celsius e converte para Fahrenheit usando a fórmula F =
		 * C * 9/5 + 32, utilizando um loop do-while.
		 */

		Double Fahrenheit, Celsius = null;

		do {
			try {

				Celsius = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Digite um valor para converter em Fahrenheit "));

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Digite apenas números nesse campo \n ERRO!!");
				break;
			}

			Fahrenheit = Celsius * 9 / 5 + 32;

			JOptionPane.showMessageDialog(null, " Temperatura em Celsius = " + Celsius + " ° "
					+ "  \n Temperatura em Fahrenheit = " + Fahrenheit + " ° ");

		} while (Celsius != 0);

	}

}
