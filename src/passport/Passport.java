package passport;

import java.util.Objects;

public class Passport {
    private final Integer number;
    private String surname;
    private String name;
    private String patronymic;
    private final String birthday;

    public Passport(int number, String surname, String name, String birthday) {
        this(number, name, surname, null, birthday);
    }

    public Passport(int number, String surname, String name, String patronymic, String birthday) {
        if (number <= 0 || name == null || surname == null || birthday == null) {
            throw new RuntimeException("Укажите номер паспорта, фамилию, имя и дату рождения владельца");
        }
        this.number = number;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.birthday = birthday;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        if (patronymic == null) {
            return String.format("%d, %s %s, %s", number, surname, name, birthday);
        }
        return String.format("%d, %s %s %s, %s", number, surname, name, patronymic, birthday);
    }
}
