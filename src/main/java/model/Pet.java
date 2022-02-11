package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pet {
    private String name;
    private int age;
    private PetType type;

}
