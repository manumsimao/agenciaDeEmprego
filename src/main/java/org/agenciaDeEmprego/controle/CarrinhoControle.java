package org.agenciaDeEmprego.controle;

import org.agenciaDeEmprego.modelo.Carrinho;
import org.agenciaDeEmprego.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

@Controller
@Scope(value=WebApplicationContext.SCOPE_REQUEST)
public class CarrinhoControle {
	
	private ProdutoRepositorio repositorio;
	private Carrinho carrinho;
	
	@Autowired
	public CarrinhoControle(ProdutoRepositorio repositorio, Carrinho carrinho) {
		super();
		this.repositorio = repositorio;
		this.carrinho = carrinho;
	}
	
	@RequestMapping("listarProdutosCliente")
	public String getProdutosLanchonete(Model model) {
		model.addAttribute("produtos", repositorio.getProdutos());
		return "cardapio";
	}
	
	@RequestMapping("listarProdutosCarrinho")
	public String getProdutoscarrinho(Model model) {
		model.addAttribute("carrinho", carrinho.getProdutos());
		return "carrinho";
	}
	
	@RequestMapping("adicionarProdutocarrinho")
	public String adicionarProduto(int codigo) {
		carrinho.adicionar(repositorio.getProduto(codigo));
		return "redirect:listarProdutosCarrinho";
	}
	
	@RequestMapping("removerProdutocarrinho")
	public String removerProduto(int codigo) {
		carrinho.removerProduto(codigo);
		return "redirect:listarProdutosCarrinho";
	}
	
	
	

}
