public class reportPDFFactory implements reportFactory{
    @Override
    public report createReport() {
        return new reportPDF();
    }
}
