public class reportPDFFactory implements reportFactory{
    @Override
    public writingReport writeReport() {
        return new writingReportPDF();
    }
    @Override
    public usingReport useReport() {
        return new usingPDF();
    }
}
