package com.graphql.model;

import java.util.HashMap;
import java.util.Map;

public enum Books {
    ABC("abc"),
    PQR("pqr"),
    XYZ("xyz");

    private String code;
    private static final Map<String, Books> BOOKS_MAP = new HashMap<>();

    Books(String code) {
        this.code = code;
    }

    static {
        for (Books books : values()) {
            BOOKS_MAP.put(books.code, books);
            System.out.println(books.code + "\t" + books);
        }
    }

    public static Books getBookByCode(String str) {
        return BOOKS_MAP.get(str);
    }

    public String getCode() {
        return this.code;
    }

}
