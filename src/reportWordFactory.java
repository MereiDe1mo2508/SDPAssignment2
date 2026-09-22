public class reportWordFactory implements reportFactory {
    @Override
    public writingReport writeReport() {
        return new writingReportWord();
    }
    @Override
    public usingReport useReport() {
        return new usingWord();
    }
}
