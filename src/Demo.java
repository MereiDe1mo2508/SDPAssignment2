public class Demo {
    public static void main(String[] args) {
        IreportAbstractFactory factory;
        String reportName = System.getProperty("report.name").toLowerCase();
        if(reportName.contains("word")) {
            factory = new IreportWord();
        } else {
            factory = new IreportPDF();
        }
        Application app = new Application(factory);
        app.output();
    }
}
