public class IreportPDF implements IreportAbstractFactory{
    @Override
    public IuseReport useReport() {
        return new IusePDF();
    }
    @Override
    public IwriteReport writeReport() {
        return new IwritePDF();
    }
}
