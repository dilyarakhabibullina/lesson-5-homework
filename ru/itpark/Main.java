package ru.itpark;

public class Main {
    public static void main(String[] args) {
        InitialService service = new InitialService();
        String resultFinal = service.getInitials("Dilyara Khabibullina");//Вопрос
        // -а как мне сделать, чтобы Main выдавал мне все четыре строчки, Может быть, можно сделать так, стобы он брал
        // name из файла initiala.cvs?
        System.out.println(resultFinal);
    }
}
