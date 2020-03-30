package by.tms.DomashneeZadanie._4_Calculator.UsersServes.List;

import java.util.LinkedList;
import java.util.Objects;

public class User {
    public static final LinkedList<User> n = new LinkedList<User>();

    private String ИМЯЛОГИНА;
    private String ПАРОЛЬ;

    public User(String р2, String рр2) {
        this.ИМЯЛОГИНА = ИМЯЛОГИНА;
        this.ПАРОЛЬ = ПАРОЛЬ;
    }

    @Override
    public String toString() {
        return "User{" +
                "ИМЯЛОГИНА='" + ИМЯЛОГИНА + '\'' +
                ", ПАРОЛЬ='" + ПАРОЛЬ + '\'' +
                '}';
    }

    public String getИМЯЛОГИНА() {
        return ИМЯЛОГИНА;
    }

    public void setИМЯЛОГИНА(String ИМЯЛОГИНА) {
        this.ИМЯЛОГИНА = ИМЯЛОГИНА;
    }

    public String getПАРОЛЬ() {
        return ПАРОЛЬ;
    }

    public void setПАРОЛЬ(String ПАРОЛЬ) {
        this.ПАРОЛЬ = ПАРОЛЬ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ПАРОЛЬ == user.ПАРОЛЬ &&
                Objects.equals(ИМЯЛОГИНА, user.ИМЯЛОГИНА);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ИМЯЛОГИНА, ПАРОЛЬ);
    }


}
