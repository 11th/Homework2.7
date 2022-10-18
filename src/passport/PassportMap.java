package passport;

import java.util.HashMap;
import java.util.Map;

public class PassportMap {
    private Map<Integer, Passport> passports = new HashMap<>();

    public void add(Passport passport) {
        passports.put(passport.getNumber(), passport);
    }

    public Passport findByNumber(Integer number) {
        return passports.get(number);
    }

    public Map<Integer, Passport> getPassports() {
        return passports;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Passport value : passports.values()) {
            stringBuilder.append(value);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
