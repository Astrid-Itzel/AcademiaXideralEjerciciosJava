package main;
import java.util.HashMap;

public class UsuarioService {

	private final HashMap<Long, UsuarioDto> usuarios = new HashMap<>();
	
	
	//Método para crear usuario
	public UsuarioDto crearUsuario (Long id, String nombre, int edad) {
		usuarios.put(id, new UsuarioDto(id, nombre, edad));
		return usuarios.get(id);
	}
	
	//Método para obtener usuario
	public UsuarioDto obtenerUsuario(Long id) {
		return usuarios.get(id);
	}
	
	//Método para actualizar usuario
	public UsuarioDto actualizarUsuario(Long id, String nombre, int edad) {
		return usuarios.put(id, new UsuarioDto(id, nombre, edad));
	}

}
