package dev.annyni.basepatterns.behavioral.memento;

public class Archive {
    private SaveDocument saveDocument;

    public SaveDocument getSaveDocument(){
        return saveDocument;
    }

    public void setSaveDocument(SaveDocument saveDocument) {
        this.saveDocument = saveDocument;
    }
}
