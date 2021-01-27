package org.agenciaDeEmprego.controle;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.agenciaDeEmprego.modelo.Carrinho;
import org.agenciaDeEmprego.modelo.Compra;
import org.agenciaDeEmprego.modelo.Item;
import org.agenciaDeEmprego.modelo.Produto;
import org.agenciaDeEmprego.modelo.Usuario;
import org.agenciaDeEmprego.repositorio.CompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompraControle {
	
	private CompraRepositorio repositorio;

	@Autowired
	public CompraControle(CompraRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}
	
	@Transactional
	@RequestMapping("finalizarCompra")
	public String finalizar(HttpSession sessao, Model model) {
		List<Item> itens = new ArrayList<Item>();
		Carrinho carrinho = (Carrinho) sessao.getAttribute("carrinho");
		for(Produto produto:carrinho.getProdutos()) {
			Item item = new Item();
			item.setProduto(produto);
			itens.add(item);
		}
		Usuario usuario = (Usuario) sessao.getAttribute("usuario");
		Compra compra = repositorio.finalizar(usuario, itens);
		model.addAttribute("compra", compra);
		return "resumo";
	}
	
	

}
