package ru.itpark;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/initials.csv", numLinesToSkip = 1)
    void getInitials(String input, String expected) {//просьба возле каждой строчки теста
        // написать, что именно она делает.
        InitialService service = new InitialService();
        String actual = service.getInitials (input); //откуда программа узнала, что такое
        // input? Мы же нигде не объявляли эту переменную? Тот же вопрос про expected.
        assertEquals(expected, actual);
    }
}


    {
        InitialService service = new InitialService();
        String actual = service.Initials1("Andrea Pedro Trinchieri");
        String expected = "AT";
        assertEquals(expected, actual);


       }
        {   InitialService service = new InitialService();
        String actual = service.Initials1("zinatulla bill");
        String expected = "ZB";
        assertEquals(expected, actual);
    }
    {   InitialService service = new InitialService();
        String actual = service.Initials1("zinatulla");
        String expected = "Z";
        assertEquals(expected, actual);
    }
    }
