package edu.upc.eseiaat.pma.shoppinglist;

/**
 * Created by marc on 25/10/2017.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;

    //Fer Alt+Insert - Generate


    public ShoppingItem(String text) {
        this.text = text;
        this.checked = false;
    }

    public ShoppingItem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
