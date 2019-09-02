/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sears
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String fechaNacimiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public static Usuario findbyLogin(String email, String password){
        String emailDB = "mariamez@gmail.com";
        String passwordDB = "maria12345";
        Usuario usuario = null;
        
        if(email.equals(emailDB) && password.equals(passwordDB)){
            usuario = new Usuario();
            usuario.setNombre("María");
            usuario.setApellido("Meza");
            usuario.setEmail("mariamez@gmail.com");
        }
        return usuario;
    }
            
}
