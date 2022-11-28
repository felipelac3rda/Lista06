package questao04;

import java.util.ArrayList;

public class RegrasDeNegocio {
	ArrayList<Integer> numeros;

	public RegrasDeNegocio() {
		numeros = new ArrayList<Integer>();
	}

	public void adicionarNumeros(int numero) {
		numeros.add(numero);
	}

	public float calcularMedia() {
		float media = 0;
		for (Integer i : numeros) {
			media += i;
		}
		media = media / numeros.size();
		
		return media;
	}

	public int maiorNumero() {
		int numero = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > numero) {
				numero = numeros.get(i);
			}
		}

		return numero;
	}
	
	public int menorNumero() {
		int numero = numeros.get(0);;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) < numero) {
				numero = numeros.get(i);
			}
		}

		return numero;
	}
}
