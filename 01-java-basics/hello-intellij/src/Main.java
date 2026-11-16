/*
*   La funzione si chiama Compact Source Files and Instance Main Methods (JEP 512)
*   Un file .java può non contenere una dichiarazione di classe: il compilatore genera automaticamente una classe
*   implicita, che non è visibile e non può essere usata da altre classi.
*   Il metodo main() non deve più essere static né public, e il parametro args è facoltativo.
*/

void main() {
    System.out.println("Cri Lo");
    System.out.println("Enna");
    System.out.println("26");
    //Esiste anche una scorciatoia per stampare: la nuova classe java.lang.IO, che permette di scrivere
    // IO.println("Hello, World!"). Il tuo System.out.println funziona comunque.
    IO.println("funziona comunque");
}

/*N.B: Tutto il codice aziendale usa classi esplicite. Spring Boot, i progetti che leggerai al lavoro,
le librerie: nessuno è scritto in forma compatta. La compatta è pensata per programmi piccoli e prove veloci.
Non nasconde i concetti, li rimanda. La classe c’è ancora, solo che il compilatore la crea al posto tuo, ed è
un’ottima semplificazione per iniziare. Ma tra poco, con l’OOP, dovrai sapere cos’è davvero una classe, e cosa
significano public e static.
Non puoi organizzare un progetto serio con file compatti, perché la loro classe implicita non è utilizzabile da
 altre classi.
* */