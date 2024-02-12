public class Prodotto {
    private String codice;
    private String nome;
    private String descrizione;
    private Double prezzo;

    public Prodotto(String codice, String nome, String descrizione, Double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void stampaDettagliProdotto() {
        System.out.println("Codice: " + codice + " - Nome: " + nome + " - Descrizione: " + descrizione + " - Prezzo: " + prezzo);
    }
}
