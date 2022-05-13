package Gabriel.Kenji.Utiyama;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
		
	static {
		Produto produto = new Produto();
		produto.setId(chaveSequencial++);
		produto.setNome("Produto1");
		Produto produto2 = new Produto();
		produto2.setId(chaveSequencial++);
		produto2.setNome("Produto2");
		lista.add(produto);
		lista.add(produto2);
	}
	
	public void adiciona(Produto produto) {
		produto.setId(Banco.chaveSequencial++);
		Banco.lista.add(produto);
	}
	
	public List<Produto> getProdutos(){
		return Banco.lista;
	}
	
	public void removeProduto(Integer id) {
		Iterator<Produto> it = lista.iterator();
		
		while (it.hasNext()) {
			Produto prod = it.next();
			
			if(prod.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Produto buscaProdutoPeloId(Integer id) {
		for (Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
		
	}
}
