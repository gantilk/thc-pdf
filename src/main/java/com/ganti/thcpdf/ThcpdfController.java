package com.ganti.thcpdf;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

@RestController
public class ThcpdfController {

    @GetMapping("/generate")
    public ResponseEntity<FileSystemResource> generate(@RequestParam String url) throws Exception {
        // 1. Fetch the crossword page
        Document doc = Jsoup.connect(url).get();

        // Placeholder: use doc.title() as dummy content
        String title = doc.title();

        // 2. Create PDF
        PDDocument pdf = new PDDocument();
        PDPage page = new PDPage(PDRectangle.LETTER);
        pdf.addPage(page);

        PDPageContentStream content = new PDPageContentStream(pdf, page);
        content.setFont(PDType1Font.HELVETICA_BOLD, 16);
        content.beginText();
        content.newLineAtOffset(100, 700);
        content.showText("Crossword: " + title);
        content.endText();
        content.close();

        // 3. Save locally
        String filename = "crossword_" + LocalDateTime.now().toString().replaceAll("[:.]", "_") + ".pdf";
        File file = new File(filename);
        pdf.save(file);
        pdf.close();

        // 4. Return the file as download
        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=" + filename)
                .body(new FileSystemResource(file));
    }
}
