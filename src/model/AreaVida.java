package model;

public class AreaVida {
    private String name;
    private Usuario user;

    public AreaVida(String name, Usuario user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    
}
