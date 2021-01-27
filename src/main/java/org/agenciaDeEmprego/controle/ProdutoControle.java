package org.agenciaDeEmprego.controle;

import org.agenciaDeEmprego.modelo.Produto;
import org.agenciaDeEmprego.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutoControle {
	
	private ProdutoRepositorio repositorio;

	@Autowired
	public ProdutoControle(ProdutoRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	@Transactional
	@RequestMapping(value ="cadastrarProduto", method = RequestMethod.POST)
	public String cadastrar(Produto produto) {
		repositorio.inserir(produto);
		return "redirect:listarProdutosAdmin";
	}
	
	@Transactional
	@RequestMapping(value ="atualizarProduto", method = RequestMethod.POST)
	public String atualizar(Produto produto) {
		repositorio.atualizar(produto);
		return "redirect:listarProdutosAdmin";
	}
	
	@Transactional
	@RequestMapping("excluirProduto")
	public String remover(int codigo) {
		repositorio.excluir(repositorio.getProduto(codigo));
		return "redirect:listarProdutosAdmin";
	}
	
	@RequestMapping("listarProdutosAdmin")
	public String getProdutos(Model model) {
		model.addAttribute("produtos", repositorio.getProdutos());
		return "admin";
	}
	
	@RequestMapping("alterarProduto")
	public String alterarProduto(int codigo, Model model) {
		model.addAttribute("produto", repositorio.getProduto(codigo));
		return "atualizarProduto";
	}
	

}
