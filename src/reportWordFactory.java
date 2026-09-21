public class reportWordFactory implements reportFactory {
    @Override
    public report createReport() {
        return new reportWord();
    }
}
