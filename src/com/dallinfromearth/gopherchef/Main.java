package com.dallinfromearth.gopherchef;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        XWPFDocument doc = new XWPFDocument();
        XWPFParagraph par = doc.createParagraph();
        XWPFRun run = par.createRun();
        run.setText("Your mom is gay");

        for (int i = 0; i < 100; i++) {
            XWPFParagraph parNum = doc.createParagraph();
            XWPFRun runNum = parNum.createRun();
            if (i % 10 == 0) { parNum.setPageBreak(true); continue; }
            runNum.setText("Hey I have another number. That number is " + i +" and I don't know what else to say about all of the things people pay when in connection to hay.");
        }

        List<XWPFParagraph> steve = doc.getParagraphs();

        for (XWPFParagraph thing : steve) {
            if (thing.isPageBreak()) {
                System.out.println("Hey look a break");
            } else {
                System.out.println(thing.toString());
            }
        }

        File f = new File("snakes.docx");
        FileOutputStream out = new FileOutputStream(f);
        doc.write(out);
        out.close();
        doc.close();

        Recipe test = new Recipe();
        test.setName("Youngberg Meatloaf");
        test.setDescription("The most amazing meatloaf ever");
        test.setContributor("Matthew Youngberg");
        test.addIngredient("BBQ Sauce");
        test.addIngredient("Meat");
        test.addIngredient("Love");
        test.setInstructions("Just make the meatloaf bruh");
        test.addIngredient("Loaf");
        System.out.println(test.toString());

    }
}