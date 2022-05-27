//Gabriel Kenji Utiyama CB3012069
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
		produto.setNome("Pão doce");
		produto.setUnidadeCompra(10);
		produto.setDescricao("É doce");
		produto.setQtdPrevistoMes(5.0);
		produto.setPrecoMaxComprado(1.5);
		Produto produto2 = new Produto();
		produto2.setId(chaveSequencial++);
		produto2.setNome("Salada");
		produto2.setUnidadeCompra(15);
		produto2.setDescricao("É verde");
		produto2.setQtdPrevistoMes(3.0);
		produto2.setPrecoMaxComprado(0.5);
		lista.add(produto);
		lista.add(produto2);
	}
	
	public void adiciona(Produto produto) {
		produto.setId(Banco.chaveSequencial++);
		Banco.lista.add(produto);
	}
	
	public List<Produto> getProduto(){
		return Banco.lista;
	}
	
	public void removeProduto(Integer id) {
		Iterator<Produto> it = lista.iterator();
		 while(it.hasNext()) {
			 Produto produto = it.next();
			 
			 if(produto.getId() == id) {
				 it.remove();
			 }
		 }
	}
	
	public Produto buscaProdutoPelaId(Integer id) {
		for (Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}
