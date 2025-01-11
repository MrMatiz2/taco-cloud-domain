package com.example.tacoclouddomain.email;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taco {

    @NonNull
    private String name;
    private List<String> ingredients;

}
