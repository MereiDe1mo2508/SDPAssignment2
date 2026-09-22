public class reportPDFFactory implements reportFactory{
    @Override
    public usingReport useReport() {
        return new usingPDF();
    }
}
