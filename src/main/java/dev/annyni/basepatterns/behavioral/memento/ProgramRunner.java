package dev.annyni.basepatterns.behavioral.memento;

public class ProgramRunner {
    public static void main(String[] args) throws InterruptedException {
        Document document = new Document();
        Archive archive = new Archive();

        document.setWhoIsEditingAndTextEditAndDate("Roma", "This is a beautiful day!");

        System.out.println(document);

        System.out.println("Saving current text to archive...");
        archive.setSaveDocument(document.save());

        System.out.println("Updating text in document...");
        Thread.sleep(7000);

        document.setWhoIsEditingAndTextEditAndDate("Lisa", "This is a bad day!!!!");

        System.out.println(document);

        System.out.println("This record is not true");
        System.out.println("Read old text");

        document.read(archive.getSaveDocument());
        System.out.println(document);
    }
}
