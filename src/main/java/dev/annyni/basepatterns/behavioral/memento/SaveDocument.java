package dev.annyni.basepatterns.behavioral.memento;

import java.util.Date;

public class SaveDocument {
    private String whoIsEditing;
    private String textEdit;
    private Date dateEdit;

    public SaveDocument(String whoIsEditing, String textEdit) {
        this.whoIsEditing = whoIsEditing;
        this.textEdit = textEdit;
        dateEdit = new Date();
    }

    public String getWhoIsEditing() {
        return whoIsEditing;
    }

    public String getTextEdit() {
        return textEdit;
    }

    public Date getDateEdit() {
        return dateEdit;
    }
}
