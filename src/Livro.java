public class Livro {
    private String titulo, autor, editora, anoedicao;

    Livro() {}

    Livro(String t, String a, String e,String an) {
        titulo = t;
        autor = a;
        editora = e;
        anoedicao = an;
    }

    public void setTitulo(String t) {
        titulo = t;
    }
    
    public void setAutor(String a) {
        autor = a;
    }

    public void setEditora(String e) {
        editora = e;
    }
    
    public void setAnoEdicao(String an) {
        anoedicao = an;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor; 
    }

    public String getEditora() {
        return editora; 
    }

    public String getAnoEdicao() {
        return anoedicao; 
    }

    public String getDados() {
        return String.format("Titulo: %s\nAutor: %s\nEditora: %s\nAno: %s", titulo, autor, editora, anoedicao);
    }

}
