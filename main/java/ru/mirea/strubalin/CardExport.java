package ru.mirea.strubalin;
import java.io.*;
public class CardExport extends AbstractFileAction{
    private static void serializeAndWrite(File file, Card card) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

            objectOutputStream.writeObject(card);
            objectOutputStream.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void serializeToBytes(Card card) {
        File output = new File(PATH_TO_RESOURCES + card.getName() + ".crd");

        serializeAndWrite(output, card);
    }

    public static void serializeToBytes(Card card, String outputFilename) {
        File output = new File(PATH_TO_RESOURCES + outputFilename + ".crd");

        serializeAndWrite(output, card);
    }
}
