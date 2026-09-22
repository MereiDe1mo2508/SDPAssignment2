public class Application {
    private IwriteReport writtenReport;
    private IuseReport usedReport;
    public Application(IreportAbstractFactory factory) {
        writtenReport = factory.writeReport();
        usedReport = factory.useReport();
    }
    public void output() {
        writtenReport.write();
        usedReport.use();
    }
}
