/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author End User
 */
public class ORC1 {
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
    }
    public String getDataField() {
        return dataField;
    }
    public String[] getTokenData() {
        return tokenData;
    }
}
