/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08.Exemplos.Aula08_DB;

/**
 *
 * @author kawan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public static void inserir(Usuario usuario) {
        String sql = "inset into usuario(usuraio,senha) values(?,?)";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            
            stmt.executeUpdate();
        } catch (Exception e) {
        
        }
    }
}
