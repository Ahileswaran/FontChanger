package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.*;

public class FontChanger {
    public static void main(String[] args) {
        String inputPath = "D:/Users/Ahileswaran/Documents/FONTCHANGER/Desi.docx";   // Path to your source .docx
        String outputPath = "D:/Users/Ahileswaran/Documents/FONTCHANGER/output.docx"; // Path to save the modified file

        try (FileInputStream fis = new FileInputStream(inputPath);
             XWPFDocument doc = new XWPFDocument(fis)) {

            // Go through all paragraphs
            for (XWPFParagraph para : doc.getParagraphs()) {
                for (XWPFRun run : para.getRuns()) {
                    String currentFont = run.getFontFamily();
                    if ("Bamini".equalsIgnoreCase(currentFont)) {
                        run.setFontFamily("Baamini");
                    }
                }
            }

            // Tables might also contain text
            for (XWPFTable table : doc.getTables()) {
                for (XWPFTableRow row : table.getRows()) {
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph para : cell.getParagraphs()) {
                            for (XWPFRun run : para.getRuns()) {
                                String currentFont = run.getFontFamily();
                                if ("Bamini".equalsIgnoreCase(currentFont)) {
                                    run.setFontFamily("Baamini");
                                }
                            }
                        }
                    }
                }
            }

            // Save the modified document
            try (FileOutputStream fos = new FileOutputStream(outputPath)) {
                doc.write(fos);
            }

            System.out.println("Font replacement complete.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
