package ap2.s1.model;
import ap2.s1.ui.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class InfraestructureDepartment {
    public static final String BILLBOARD_FILE_NAME = "BillboardDataExported.csv";
    private ArrayList<Billboard> billboards;
    public InfraestructureDepartment(){
        billboards = new ArrayList<>();
    }
    public void loadBillboard() throws Exception{
        String resource = Main.class.getClassLoader().getResource(BILLBOARD_FILE_NAME).getFile();
        File file = new File(resource);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null){
            importData(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
    }
    private void importData(String line) {
        String[] columns = line.split("\\|");
        Billboard billboard = new Billboard(Double.parseDouble(columns[0]),Double.parseDouble(columns[1]),Boolean.parseBoolean(columns[2]),columns[3]);
        billboards.add(billboard);
    }
    public  String BillboardList() {
        return "msg";
    }
    public double calculatePromW(ArrayList<Billboard> billboards) {
        double promW = 0.0;
        int n = billboards.size();
        for (int i = 0; i < billboards.size(); i++) {
            promW += billboards.get(i).getWidth();
        }
        promW = promW/n;
        return promW;
    }
    public double calculatePromH() {
        double promH = 0.0;
        int n = billboards.size();
        for (int i = 0; i < billboards.size(); i++) {
            promH += billboards.get(i).getHeight();
        }
        promH = promH/n;
        return promH;
    }
    public int calculateUse() {
        int count = 0;
        boolean use;
        for (int i = 0; i < billboards.size(); i++) {
            use = billboards.get(i).isInUse();
            if(use) {
                count++;
            }
        }
        return count;
    }
    public int calculateBrand() {
        return 0;
    }
}