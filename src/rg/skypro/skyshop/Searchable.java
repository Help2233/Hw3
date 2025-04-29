package rg.skypro.skyshop;

public interface Searchable {

    String searchTerm();

    String typeContent();

    default void getStringRepresentation() {
        System.out.println("Имя " + searchTerm() + " -объекта - тип " + typeContent() + " -объекта");
        ;
    }



}

