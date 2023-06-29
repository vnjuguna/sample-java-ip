package org.indigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherDecodingTest {
    @Test
    @DisplayName("Caesar Cipher Decoding a Single UpperCase Character and No Wrap Around")
    void decodeSingleUpperCaseCharacterNoWrapAround() {
        assertEquals("A", CipherDecoding.decode("B", 1));
        assertEquals("C", CipherDecoding.decode("E", 2));
        assertEquals("B", CipherDecoding.decode("I", 7));
        assertEquals("T", CipherDecoding.decode("Z", 6));
        assertEquals("E", CipherDecoding.decode("H", 3));
        assertEquals("X", CipherDecoding.decode("Y", 1));
        assertEquals("Y", CipherDecoding.decode("Z", 1));
    }
}
