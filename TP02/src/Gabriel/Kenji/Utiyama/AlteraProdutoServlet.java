//Gabriel Kenji Utiyama CB3012069

package Gabriel.Kenji.Utiyama;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando produto");
		
		String nomeProduto = request.getParameter("nome");
		Integer unidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
		String descricao = request.getParameter("descricao");
		Double qtdPrevistoMes = Double.parseDouble(request.getParameter("qtdPrevistoMes"));
		Double precoMaxComprado = Double.parseDouble(request.getParameter("precoMaxComprado"));
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		
		
		
		System.out.println(id);
		Banco banco = new Banco();
		Produto produto = banco.buscaProdutoPelaId(id);
		produto.setNome(nomeProduto);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		response.sendRedirect("listaProdutos");
		
	}
}
