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
    @Test
    @DisplayName("Caesar Cipher Decoding a Single LowerCase Character and No Wrap Around")
    void decodeSingleLowerCaseCharacterNoWrapAround() {
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",
                CipherDecoding.decode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",3));
        assertEquals("a", CipherDecoding.decode("b", 1));
        assertEquals("c", CipherDecoding.decode("e", 2));
        assertEquals("b", CipherDecoding.decode("i", 7));
        assertEquals("t", CipherDecoding.decode("z", 6));
        assertEquals("e", CipherDecoding.decode("h", 3));
        assertEquals("x", CipherDecoding.decode("y", 1));
        assertEquals("y", CipherDecoding.decode("z", 1));
    }
}
