package com.example.demo.utils;

import java.util.UUID;

public class UUIDGen {

    public static String getUUId() {

        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
