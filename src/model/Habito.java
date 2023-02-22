package model;

public abstract class Habito {
    protected String name;
    protected AreaVida areaRelacionada;
    protected int times;
    protected int done;
    // protected turno  -> FAZER UM ENUM?
    protected Boolean status;
    // protected Lembrete lembrete;  -> CRIAR A CLASSE LEMBRETE 

    public Habito(String name) {
        this.name = name;
    }
    public Boolean getStatus() {
        return status;
    }
    public AreaVida getAreaRelacionada() {
        return areaRelacionada;
    }
    public void setAreaRelacionada(AreaVida areaRelacionada) {
        this.areaRelacionada = areaRelacionada;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public int getDone() {
        return done;
    }
    public void setDone(int done) {
        this.done = done;
    }
    public int getTimes() {
        return times;
    }
    public void setTimes(int times) {
        this.times = times;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}
