package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int birthYear;

    public Human(String name, int birthYear) {

        if ((name.trim().contains(" ")) && (LocalDate.now().getYear() - birthYear <= 120)) {
            this.name = name;
            this.birthYear = birthYear;
        } else {
            throw new IllegalArgumentException("Hibás adatok!");
        }
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }


}
