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
        if (number <= 0 || birthday == null) {
            throw new RuntimeException("Укажите номер паспорта и дату рождения владельца");
        }
        this.number = number;
        this.birthday = birthday;
        setName(name);
        setSurname(surname);
        setPatronymic(patronymic);
    }

    public void setSurname(String surname) {
        if (surname == null) {
            throw new RuntimeException("Укажите фамилию владельца");
        }
        this.surname = surname;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Укажите имя владельца");
        }
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
