package com.dallinfromearth.gopherchef;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        XWPFDocument doc = new XWPFDocument();
        XWPFParagraph par = doc.createParagraph();
        XWPFRun run = par.createRun();
        run.setText("Your mom is gay");

        for (int i = 0; i < 10; i++) {
            XWPFParagraph parNum = doc.createParagraph();
            XWPFRun runNum = parNum.createRun();
            runNum.setText("Hey I have another number. That number is " + String.valueOf(i));
        }

        File f = new File("snakes.docx");
        FileOutputStream out = new FileOutputStream(f);
        doc.write(out);
        out.close();
        doc.close();


        System.out.println("Goodbye World");
    }
}