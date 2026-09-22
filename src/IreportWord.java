public abstract class IreportWord implements IreportAbstractFactory{
    @Override
    public IuseReport useReport() {
        return new IuseWord();
    }
    @Override
    public IwriteReport writeReport() {
        return new IwriteWord();
    }
}
