package Utils;

import constants.FrameworkConstants;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;



public class PDFReader {


    public static  void  PDFReader() throws IOException {
        File file = new File(FrameworkConstants.PDFFILE);// Change this to your PDF file path
        BufferedReader bf = new BufferedReader(new FileReader(file));
        FileInputStream fstream = new FileInputStream(file);

        PDFParser pdfParser=new PDFParser((RandomAccessRead) file);


        try (PDDocument document = new PDDocument()) {

            PDDocument document1 = new PDDocument();
            document1.getDocumentId();
            PDFTextStripper pdfStripper = new PDFTextStripper();
//            String text = pdfStripper.getText();
//            System.out.println("PDF Content:\n" + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
