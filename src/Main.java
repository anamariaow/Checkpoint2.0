public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("123", "Prodotto1", "Descrizione1", 10.0);
        Prodotto prodotto2 = new Prodotto("234", "Prodotto2", "Descrizione2", 20.0);
        Prodotto prodotto3 = new Prodotto("345", "Prodotto3", "Descrizione3", 30.0);
        Prodotto prodotto4 = new Prodotto("567", "Prodotto4", "Descrizione4", 40.0);
        Prodotto prodotto5 = new Prodotto("678", "Prodotto5", "Descrizione5", 50.0);
        Prodotto prodotto6 = new Prodotto("789", "Prodotto6", "Descrizione6", 60.0);

        Carrello carrello = new Carrello();

        carrello.aggiungiProdotto(prodotto1);
        carrello.aggiungiProdotto(prodotto2);
        carrello.aggiungiProdotto(prodotto3);
        carrello.aggiungiProdotto(prodotto4);
        carrello.aggiungiProdotto(prodotto5);
        carrello.aggiungiProdotto(prodotto6);

        //carrello.rimuoviProdotto(prodotto2);

        //Carrello con prodotti non scontati
        carrello.visualizzaProdotti();
        //Totale importo carrello
        carrello.calcolaTotaleImporti();
        //Sconto applicato al carrello
        carrello.scontoProdotti(30.0);
        //Carrello aggiornato con lo sconto
        carrello.visualizzaProdotti();
        //Totale importo carrello scontato
        carrello.calcolaTotaleImporti();

        //carrello.svuotaCarrello();

    }
}