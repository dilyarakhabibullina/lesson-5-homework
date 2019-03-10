package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {

    @Test
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
