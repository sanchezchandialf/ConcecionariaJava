
package Disenio;


public enum CredencialesEnum {
    USUARIO_1("usuario1", "contraseña1"),
    USUARIO_2("usuario2", "contraseña2"),
    USUARIO_3("usuario3", "contraseña3"),
    USUARIO_4("usuario4", "contraseña4");

    private final String username;
    private final String password;

    CredencialesEnum(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
