package ap2.s1;
import ap2.s1.model.Billboard;
import ap2.s1.model.InfraestructureDepartment;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Random;

public class InfraestructureTest extends TestCase {
    private InfraestructureDepartment id = new InfraestructureDepartment();
    private ArrayList<Billboard> billboardTests;

    @Override
    public void setUp(){
        billboardTests = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            double w = r.nextDouble(100.0, 999.0);
            double h = r.nextDouble(100.0, 999.0);
            boolean ui = r.nextBoolean();
            String b = "Caso " + (i+1);
            Billboard billboardTest = new Billboard(w, h, ui, b);
            billboardTests.add(billboardTest);
        }
        id.setBillboards(billboardTests);
    }
    //@Test
    public void testCalculatePromW() {
        assertNotNull(id.calculateAvgW());
    }
    //@Test
    public void testCalculatePromH() {
        assertNotNull(id.calculateAvgH());
    }
    public void testCalculateAvgArea() {
        assertNotNull(id.calculateAvgArea());
    }
    //@Test
    public void testCalculateUse() {
        assertNotNull(id.calculateUse());
    }
    //@Test
    public void testCalculateBrand() {
        assertNotNull(id.calculateBrand());
    }
}
