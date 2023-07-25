package org.indigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherEncodingTest {

    @Test
    @DisplayName("Caesar Cipher Encoding a Single UpperCase Character and No Wrap Around")
    void encodeSingleUpperCaseCharacterNoWrapAround() {
        assertEquals("B", CipherEncoding.encode("A", 1));
        assertEquals("E", CipherEncoding.encode("C", 2));
        assertEquals("I", CipherEncoding.encode("B", 7));
        assertEquals("Z", CipherEncoding.encode("T", 6));
        assertEquals("H", CipherEncoding.encode("E", 3));
        assertEquals("Y", CipherEncoding.encode("X", 1));
        assertEquals("Z", CipherEncoding.encode("Y", 1));
    }
    @Test
    @DisplayName("Caesar Cipher Encoding a Single LowerCase Character and No Wrap Around")
    void encodeSingleLowerCaseCharacterNoWrapAround() {
        assertEquals("b", CipherEncoding.encode("a", 1));
        assertEquals("e", CipherEncoding.encode("c", 2));
        assertEquals("i", CipherEncoding.encode("b", 7));
        assertEquals("z", CipherEncoding.encode("t", 6));
        assertEquals("h", CipherEncoding.encode("e", 3));
        assertEquals("y", CipherEncoding.encode("x", 1));
        assertEquals("z", CipherEncoding.encode("y", 1));
        assertEquals("ij", CipherEncoding.encode("hi", 1));
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", CipherEncoding.encode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",3));
    }
}


