public class reportWordFactory implements reportFactory {
    @Override
    public usingReport useReport() {
        return new usingWord();
    }
}
