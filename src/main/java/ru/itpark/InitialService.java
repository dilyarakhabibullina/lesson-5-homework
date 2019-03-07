package ru.itpark;

public class InitialService {
    public String Initials1 (String name){
        String[]parts = name.split(" ");
        return parts[0].substring(0, 1) + parts[parts.length-1].substring (0, 1);
    }
}
