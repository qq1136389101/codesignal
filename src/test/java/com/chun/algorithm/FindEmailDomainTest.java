package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindEmailDomainTest {

    @Test
    public void findEmailDomain() {
        FindEmailDomain findEmailDomain = new FindEmailDomain();
        assertEquals("example.com", findEmailDomain.findEmailDomain("prettyandsimple@example.com"));
        assertEquals("codesignal.com", findEmailDomain.findEmailDomain("fully-qualified-domain@codesignal.com"));
        assertEquals("space.com", findEmailDomain.findEmailDomain("\\\" \\\"@space.com"));
        assertEquals("yandex.ru", findEmailDomain.findEmailDomain("someaddress@yandex.ru"));
    }
}