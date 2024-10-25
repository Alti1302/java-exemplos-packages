package EstadoBrasileiro;

import java.util.Iterator;

public class SistemaIBGE {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + "-" + e.getNome());
		}
	}

}
