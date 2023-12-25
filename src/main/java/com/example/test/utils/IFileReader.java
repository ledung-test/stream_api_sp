package com.example.test.utils;

import com.example.test.model.Person;

import java.io.IOException;
import java.util.List;

public interface IFileReader {
    List<Person> readFile(String filePath) throws IOException;
}
