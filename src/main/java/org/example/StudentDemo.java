package org.example;

import org.example.service.DataBaseWorker;
import org.example.service.impl.DataBaseWorkerImpl;

public class StudentDemo {

    public static void main(String[] args) throws ClassNotFoundException {
      DataBaseWorker wk = new DataBaseWorkerImpl();
        wk.getStudents().forEach(System.out::println);

    }
}