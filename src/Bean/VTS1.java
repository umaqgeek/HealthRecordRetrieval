/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author End User
 */
public class VTS1 {
    private String encounterDate;
    private String dataField;
    private String tokenData[];

    public void setEncounterDate(String ed) {
        encounterDate = ed;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setDataField(String df) {
        dataField = df;
        tokenData = dataField.split("\\^");
        for (int i = 0; i < dataField.split("\\^").length; i++) {
            System.out.println("a1 "+i+":"+dataField.split("\\^")[i]);
        }
        for (int i = 0; i < tokenData.length; i++) {
            System.out.println("b1 "+i+":"+tokenData[i]);
        }
    }

    public String getDataField() {
        return dataField;
    }

    public String[] getTokenData() {
        return tokenData;
    }
}
