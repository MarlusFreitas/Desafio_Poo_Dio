package Conteúdo;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descrocap) {
        this.descricao = descrocap;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descrocap=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

    

}
