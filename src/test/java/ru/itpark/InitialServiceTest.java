package ru.itpark;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/initials.csv", numLinesToSkip = 1)
    void getInitials (String input, String expected) {
        InitialService service = new InitialService();
        String actual = service.getInitials(input);
        assertEquals(expected, actual);
}

  /* @ParameterizedTest
    @CsvFileSource(resources = "/initials.csv", numLinesToSkip = 1)
    void getInitials(String input, String expected) {
        InitialsService service = new InitialsService();

        String actual = service.getInitials(input);

        assertEquals(expected, actual);
    }*/


    //  @Test

       //void initials1() {
        //InitialService service = new InitialService();
        //String actual =;
        //String expected =;
        //assertEquals(expected, actual);


  /*  @Test
    void initials1() {
        InitialService service = new InitialService();
        String actual = service.Initials1("Dilyara Khabibullina");
        String expected = "DK";
        assertEquals(expected, actual);
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
