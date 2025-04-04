package br.edu.fema.forumfema_2025.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fema.forumfema_2025.Controller.Dto.UsuarioDto;
import br.edu.fema.forumfema_2025.Models.Usuario;
import br.edu.fema.forumfema_2025.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getUsuarios() {
        List<UsuarioDto> usuarios = usuarioRepository.findAll()
                .stream()
                .map(usuario -> new UsuarioDto(usuario.getNome(), usuario.getEmail()))
                .collect(Collectors.toList());

        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
