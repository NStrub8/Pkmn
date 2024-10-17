package ru.mirea.strubalin;
import ru.mirea.strubalin.Card;
import java.io.IOException;
public class PkmnApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CardImport cardImport = new CardImport();
        Card card = cardImport.importCardFromFile("my_card.txt");
        System.out.println("Student's pokemon" + '\n' + card + "\n\n");
        System.out.println("Evolves from: \n" + card.getEvolvesFrom() + "\n\n");

        CardExport cardExport = new CardExport(card);
        cardExport.serializeToBytes();
        Card anotherCard = cardImport.deserializeCardFromBytes("Noibat");
        System.out.println("Another pokemon"+ '\n'+ anotherCard + '\n');
        System.out.println("Evolves from: \n" + anotherCard.getEvolvesFrom() + "\n\n");
    }
}
