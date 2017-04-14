/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Helper.S;
import Process.RecordInterface;

/**
 *
 * @author End User
 */
public class DTO1 extends CIS1 {
    private String encounterDate;
    private String dataField[] = new String[component_length];
    private String tokenData[][] = new String[component_length][component_length];

    public void setEncounterDate(String ed) {
        encounterDate = ed;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setDataField(int index, String df) {
        dataField[index] = df;
        tokenData[index] = dataField[index].split("\\^");
        try {
            String a = tokenData[index][0];
            int num1 = tokenData[index].length;
            int num2 = numCheck(df, '^');
            if(num1 == num2) {
                String temp[] = new String[num2+1];
                for(int i = 0; i < tokenData[index].length; i++) {
                    temp[i] = tokenData[index][i];
                }
                temp[num2] = "";
                tokenData[index] = new String[num2+1];
                tokenData[index] = temp;
            }
        } catch (Exception e) {
            tokenData[index] = new String[df.length()+1];
            for(int i = 0; i < df.length()+1; i++) {
                tokenData[index][i] = "";
            }
        }
    }

    public String getDataField(int index) {
        return dataField[index];
    }

    public String[][] getTokenData() {
        return tokenData;
    }
}
