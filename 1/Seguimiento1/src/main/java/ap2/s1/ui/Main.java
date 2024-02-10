package ap2.s1.ui;
import ap2.s1.model.InfraestructureDepartment;
import java.io.File;
public class Main {
    int EXIT_OPTION = 5;
    public static void main(String[] args) throws Exception {
        InfraestructureDepartment id = new InfraestructureDepartment();
        id.loadBillboard();
    }
}