/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Helper.S;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author End User
 */
public class MainRetrieval {
    private RecordInterface ri = new RecordInterface();
    private ExtractorManager em = new ExtractorManager();
    protected static int row_nums = 0;
    
    public MainRetrieval() {
        RecordInterface ri = new RecordInterface();
        ExtractorManager em = new ExtractorManager();
    }
    
    /** 
     * First run
     * @param healthRecord 
     */
    public void startProcess(String healthRecord) {
        ri.setInputRecord(healthRecord);
        em.extract(ri.getInputRecord());
    }
    public String[][] getData(String type) {
        return ri.getOutputRecord(type);
    }
    public int getRowNums() {
        return row_nums;
    }
    
    public static void main1(String[] args) {
        MainRetrieval mr = new MainRetrieval();
        //mr.startProcess("DTO|2013-06-27 16:04:11.064|-^Yellow fever vaccination ^-|L01CD010001P3001^PACLITAXEL^L01CD010001P3001|^INJECTION, LIQUID^|^^|^Daily^||1|150MG/25ML|^^Week|2 Week|1|^^||^^^^^|Before meals|<cr>");
        mr.startProcess("MSH|^~|CIS^T12109|<cr>\n" +
"PDI|8910310652137|OMAR MUKHTAR BIN HAMBARAN^891031065213^-^Male^31/10/1989^O^-^|<cr>\n" +
"PIS|2015-01-06 17:04:31.658|^180^120^^^^^50^170^^^^80^^^^^^^^^2015-01-06 17:04:31.658^^^^null^null^null^null^null^null^5^null^|<cr>");
//        mr.startProcess("MSH|^~|CIS^T12109|<cr>\n" +
//"\n" +
//"PDI|PMS10015|umar umar^891031065213^Malay^Male^31/10/1989^O^Single^|<cr>\n" +
//"");
        String dto[][] = mr.getData("PIS");
        int row = mr.getRowNums();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < dto[i].length; j++) {
                System.out.println(j+":"+dto[i][j]+"|");
            }
            //break;
            System.out.println("");
        }
        
//        try {
//            String a = "";
//            String b[] = a.split("\\^");
//            String c = b[0];
//            System.out.println("?"+c+"?");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        Calendar today = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String now = dateFormat.format(today.getTime());
        S.oln(now);
    }
}
