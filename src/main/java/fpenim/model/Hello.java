package fpenim.model;

import java.time.LocalDate;

/**
 * Created by flaviapenim on 28/Oct/2017.
 */
public class Hello {

    private String hello;

    private LocalDate date;

    public Hello(String hello, LocalDate date) {
        this.hello = hello;
        this.date = date;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
