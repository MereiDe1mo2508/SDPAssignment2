public class IreportWord implements IreportAbstractFactory{
    @Override
    public IwriteReport writeReport() {
        return new IwriteWord();
    }
    @Override
    public IuseReport useReport() {
        return new IuseWord();
    }
}
