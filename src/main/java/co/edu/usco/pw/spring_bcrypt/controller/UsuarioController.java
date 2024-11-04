package co.edu.usco.pw.spring_bcrypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usco.pw.spring_bcrypt.model.Usuario;
import co.edu.usco.pw.spring_bcrypt.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	private final UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping("/register")
	public String registerUsuario(@RequestBody Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "Usuario registrado con éxito!";
	}

}
