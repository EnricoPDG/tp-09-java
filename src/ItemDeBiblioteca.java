public interface ItemDeBiblioteca {
    int diasemprestimos = 7;

    void setEmprestado(Boolean emp);
    void setLocalizacao(String loc);
    Boolean getEmprestado();
    String getLocalizacao();
    void Empresta();
    void Devolve();
}