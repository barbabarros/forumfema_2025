package br.edu.fema.forumfema_2025.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fema.forumfema_2025.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
