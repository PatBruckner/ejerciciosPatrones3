package chain;

public class Persona {
    private Boolean certificado;
    private Boolean pagoAlBanco;
    private Boolean ficha;

    public Persona(Boolean certificado, Boolean pagoAlBanco, Boolean ficha) {
        this.certificado = certificado;
        this.pagoAlBanco = pagoAlBanco;
        this.ficha = ficha;
    }

    public Boolean getCertificado() {
        return certificado;
    }

    public void setCertificado(Boolean certificado) {
        this.certificado = certificado;
    }

    public Boolean getPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(Boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public Boolean getFicha() {
        return ficha;
    }

    public void setFicha(Boolean ficha) {
        this.ficha = ficha;
    }
}
