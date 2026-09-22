public class Main {
    public static void main(String[] args) {
        System.out.println("Factory pattern");
        reportFactory wordFactory = new reportWordFactory();
        usingReport usingReport1 = wordFactory.useReport();
        usingReport1.use();

        reportFactory pdfFactory = new reportPDFFactory();
        usingReport usingReport2 = pdfFactory.useReport();
        usingReport2.use();
    }
}