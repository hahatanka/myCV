package model;

import lombok.Getter;

import java.util.UUID;
@Getter
public class Superpower {
    private UUID id;
    private String name;

    public Superpower(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}
