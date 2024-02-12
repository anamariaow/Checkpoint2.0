import java.util.ArrayList;

public class Carrello {
    private ArrayList<Prodotto> prodottoArrayList;
    public Carrello() {
        this.prodottoArrayList = new ArrayList<>();
    }

    public ArrayList<Prodotto> getProdottoArrayList() {
        return prodottoArrayList;
    }

    public void setProdottoArrayList(ArrayList<Prodotto> prodottoArrayList) {
        this.prodottoArrayList = prodottoArrayList;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodottoArrayList.add(prodotto);
    }

    public void rimuoviProdotto(Prodotto prodotto) {
        prodottoArrayList.remove(prodotto);
    }

    public void visualizzaProdotti() {
        for(Prodotto prodotto : prodottoArrayList) {
            prodotto.stampaDettagliProdotto();
        }
    }

    public void calcolaTotaleImporti() {
        Double somma = 0.0;
        for(Prodotto prodotto : prodottoArrayList) {
            somma += prodotto.getPrezzo();
        }
        System.out.println("La somma nel carrello: " + somma);
    }

    public void svuotaCarrello() {
        prodottoArrayList.clear();
    }

    public void scontoProdotti(Double percentualeSconto) {
        for(Prodotto prodotto : prodottoArrayList) {
            Double sconto = prodotto.getPrezzo() * (percentualeSconto/100);
            prodotto.setPrezzo(prodotto.getPrezzo() - sconto);
        }
    }

}
