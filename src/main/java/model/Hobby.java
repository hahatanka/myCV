package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Hobby {
    private UUID id;
    private String name;

    public Hobby(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}

