package L_Three;

public class DocumentDemo {
 // Abstract Document class
    abstract static class Document {
        public abstract void open();
    }
 // WordDocument class extending Document
    static class WordDocument extends Document {
        @Override
        public void open() {
            System.out.println("Opening a Word document.");
        }
    }
// PDFDocument class extending Document
    static class PDFDocument extends Document {
        @Override
        public void open() {
            System.out.println("Opening a PDF document.");
        }
    }
// SpreadsheetDocument class extending Document
    static class SpreadsheetDocument extends Document {
        @Override
        public void open() {
            System.out.println("Opening a Spreadsheet document.");
        }
    }

    public static void main(String[] args) {
        // Create instances of different document types
        Document wordDoc = new WordDocument();
        Document pdfDoc = new PDFDocument();
        Document spreadsheetDoc = new SpreadsheetDocument();

        // Open each document
        wordDoc.open();
        pdfDoc.open();
        spreadsheetDoc.open();
    }
}

