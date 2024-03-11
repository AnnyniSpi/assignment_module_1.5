package dev.annyni.basepatterns.behavioral.memento;

import java.util.Date;

public class Document {
    private String whoIsEditing;
    private String textEdit;
    private Date dateEdit;

    public void setWhoIsEditingAndTextEditAndDate(String whoIsEditing, String textEdit) {
        this.whoIsEditing = whoIsEditing;
        this.textEdit = textEdit;
        dateEdit = new Date();
    }

    public SaveDocument save(){
        return new SaveDocument(whoIsEditing, textEdit);
    }

    public void read(SaveDocument saveDocument){
        whoIsEditing = saveDocument.getWhoIsEditing();
        textEdit = saveDocument.getTextEdit();
        dateEdit = saveDocument.getDateEdit();
    }

    @Override
    public String toString() {
        return "Document{" +
                "whoIsEditing='" + whoIsEditing + '\'' +
                ", textEdit='" + textEdit + '\'' +
                ", dateEdit=" + dateEdit +
                '}';
    }
}
