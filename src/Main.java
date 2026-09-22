public class Main {
    public static void main(String[] args) {
        System.out.println("Factory pattern");
        reportFactory wordFactory = new reportWordFactory();
        writingReport writingReport1 = wordFactory.writeReport();
        usingReport usingReport1 = wordFactory.useReport();
        writingReport1.write();
        usingReport1.use();

        reportFactory pdfFactory = new reportPDFFactory();
        writingReport writingReport2 = pdfFactory.writeReport();
        usingReport usingReport2 = pdfFactory.useReport();
        writingReport2.write();
        usingReport2.use();

        System.out.println("Abstract Factory Pattern");

        IuseReport reportUsage;
        reportUsage = new IuseWord();
        reportUsage.use();

        IuseReport reportUsage2;
        reportUsage2 = new IusePDF();
        reportUsage2.use();

        IwriteReport newReport;
        newReport = new IwriteWord();
        newReport.write();

        IwriteReport newReport2;
        newReport2 = new IwritePDF();
        newReport2.write();
    }
}