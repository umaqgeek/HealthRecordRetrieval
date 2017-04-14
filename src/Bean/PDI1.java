/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author End User
 */
public class PDI1 extends CIS1 {
    private String dataField[] = new String[component_length];
    private String tokenData[][] = new String[component_length][];

    public void setDataField(int index, String df) {
        dataField[index] = df;
        tokenData[index] = dataField[index].split("\\^");
    }

    public String getDataField(int index) {
        return dataField[index];
    }

    public String[][] getTokenData() {
        return tokenData;
    }
}
