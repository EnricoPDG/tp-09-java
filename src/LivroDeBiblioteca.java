public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private Boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String t, String a, String e, String an, String loc) {
        super(t, a, e, an);
        localizacao = loc;
        emprestado = false;
    }

    @Override
    public void Empresta() {
        setEmprestado(true);
    }

    @Override
    public void Devolve() {
        setEmprestado(false);
    }

    @Override
    public String getDados() {
        String dados = super.getDados();
        return String.format("%s\nLocalização: %s", dados, localizacao);
    }

    @Override
    public void setEmprestado(Boolean emp) {
        emprestado = emp;
    }

    @Override
    public void setLocalizacao(String loc) {
        localizacao = loc;
    }

    @Override
    public Boolean getEmprestado() {
        return emprestado;
    }

    @Override
    public String getLocalizacao() {
        return localizacao;
    }
}