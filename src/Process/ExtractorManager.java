/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Bean.CCN1;
import Helper.S;
import static Process.RecordInterface.pntData;

/**
 *
 * @author End User
 */
public class ExtractorManager {
    protected String tokenLine_history[];
    protected static int ccn = 0;
    protected static int vts = 0;
    protected static int hpi = 0;
    protected static int pmh = 0;
    protected static int fmh = 0;
    protected static int soh = 0;
    protected static int alg = 0;
    protected static int imu = 0;
    protected static int dab = 0;
    protected static int dgs = 0;
    protected static int dto = 0;
    protected static int pdi = 0;
    protected static int mec = 0;
    protected static int bld = 0;
    protected static int pos = 0;
    protected static int msh = 0;
    protected static int pem = 0;
    protected static int pnt = 0;
    protected static int orc = 0; // add later 15 Apr 2017
    protected static int ros = 0; // add later 15 Apr 2017
    protected static int lio = 0; // add later 15 Apr 2017
    protected static int pis = 0; // add later 15 Apr 2017
    protected ExtractorManager() {
        ccn = 0;
        vts = 0;
        hpi = 0;
        pmh = 0;
        fmh = 0;
        soh = 0;
        alg = 0;
        imu = 0;
        dab = 0;
        dgs = 0;
        dto = 0;
        pdi = 0;
        mec = 0;
        bld = 0;
        pos = 0;
        msh = 0;
        pem = 0;
        pnt = 0;
        orc = 0; // add later 15 Apr 2017
        ros = 0; // add later 15 Apr 2017
        lio = 0; // add later 15 Apr 2017
        pis = 0; // add later 15 Apr 2017
    }
    protected void extract(String healthRecord) {
        tokenLine_history = healthRecord.split(">");
        for (int i = 0; i < tokenLine_history.length; i++) {
            String line = tokenLine_history[i].equals("") ? "-" : tokenLine_history[i]; //insert each line into string
            String column[] = line.split("\\|");
            int k = 0;
            String TableType = column[k++].equals("") ? "-" : column[k - 1];//1st column is table name
            if (TableType.contains("PDI")) {
                for (int j = 0; j < RecordInterface.component_length; j++) {
                    RecordInterface.pdiData[pdi].setDataField(j, "");
                    try {
                        RecordInterface.pdiData[pdi].setDataField(j, column[k++].equals("") ? "-" : column[k - 1]);
                    } catch (Exception e) {
                        RecordInterface.pdiData[pdi].setDataField(j, "");
                    }
                }
                pdi++;
            } else if (TableType.contains("CCN")) {
                RecordInterface.ccnData[ccn].setEncounterDate("");
                try {
                    RecordInterface.ccnData[ccn].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.ccnData[ccn].setEncounterDate("");
                }
                RecordInterface.ccnData[ccn].setDataField("");
                try {
                    RecordInterface.ccnData[ccn].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.ccnData[ccn].setDataField("");
                }
                ccn++;
            } else if (TableType.contains("HPI")) {
                RecordInterface.hpiData[hpi].setEncounterDate("");
                try {
                    RecordInterface.hpiData[hpi].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.hpiData[hpi].setEncounterDate("");
                }
                RecordInterface.hpiData[hpi].setDataField("");
                try {
                    RecordInterface.hpiData[hpi].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.hpiData[hpi].setDataField("");
                }
                hpi++;
            } else if (TableType.contains("PMH")) {
                RecordInterface.pmhData[pmh].setEncounterDate("");
                try {
                    RecordInterface.pmhData[pmh].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pmhData[pmh].setEncounterDate("");
                }
                RecordInterface.pmhData[pmh].setDataField("");
                try {
                    RecordInterface.pmhData[pmh].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pmhData[pmh].setDataField("");
                }
                pmh++;
            } else if (TableType.contains("FMH")) {
                RecordInterface.fmhData[fmh].setEncounterDate("");
                try {
                    RecordInterface.fmhData[fmh].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.fmhData[fmh].setEncounterDate("");
                }
                RecordInterface.fmhData[fmh].setDataField("");
                try {
                    RecordInterface.fmhData[fmh].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.fmhData[fmh].setDataField("");
                }
                fmh++;
            } else if (TableType.contains("SOH")) {
                RecordInterface.sohData[soh].setEncounterDate("");
                try {
                    RecordInterface.sohData[soh].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.sohData[soh].setEncounterDate("");
                }
                RecordInterface.sohData[soh].setDataField("");
                try {
                    RecordInterface.sohData[soh].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.sohData[soh].setDataField("");
                }
                soh++;
            } else if (TableType.contains("ALG")) {
                RecordInterface.algData[alg].setEncounterDate("");
                try {
                    RecordInterface.algData[alg].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.algData[alg].setEncounterDate("");
                }
                RecordInterface.algData[alg].setDataField("");
                try {
                    RecordInterface.algData[alg].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.algData[alg].setDataField("");
                }
                alg++;
            } else if (TableType.contains("IMU")) {
                RecordInterface.imuData[imu].setEncounterDate("");
                try {
                    RecordInterface.imuData[imu].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.imuData[imu].setEncounterDate("");
                }
                RecordInterface.imuData[imu].setDataField("");
                try {
                    RecordInterface.imuData[imu].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.imuData[imu].setDataField("");
                }
                imu++;
            } else if (TableType.contains("DAB")) {
                RecordInterface.dabData[dab].setEncounterDate("");
                try {
                    RecordInterface.dabData[dab].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.dabData[dab].setEncounterDate("");
                }
                RecordInterface.dabData[dab].setDataField("");
                try {
                    RecordInterface.dabData[dab].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.dabData[dab].setDataField("");
                }
                dab++;
            } else if (TableType.contains("VTS")) {
                RecordInterface.vtsData[vts].setEncounterDate("");
                try {
                    RecordInterface.vtsData[vts].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.vtsData[vts].setEncounterDate("");
                }
                RecordInterface.vtsData[vts].setDataField("");
                try {
                    RecordInterface.vtsData[vts].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.vtsData[vts].setDataField("");
                }
                vts++;
            } else if (TableType.contains("DGS")) {
                RecordInterface.dgsData[dgs].setEncounterDate("");
                try {
                    RecordInterface.dgsData[dgs].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.dgsData[dgs].setEncounterDate("");
                }
                RecordInterface.dgsData[dgs].setDataField("");
                try {
                    RecordInterface.dgsData[dgs].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.dgsData[dgs].setDataField("");
                }
                dgs++;
            } else if (TableType.contains("DTO")) {
                RecordInterface.dtoData[dto].setEncounterDate("");
                try {
                    RecordInterface.dtoData[dto].setEncounterDate(column[k++].equals("") ? "" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.dtoData[dto].setEncounterDate("");
                }
                for(int j = 0; j < RecordInterface.component_length; j++) {
                    //RecordInterface.dtoData[dto].setDataField(j, "");
                    try {
                        RecordInterface.dtoData[dto].setDataField(j, column[k].equals("") ? "" : column[k]);
                        k++;
                    } catch (Exception e) {
                        RecordInterface.dtoData[dto].setDataField(j, "");
                    }
                }
                dto++;
            } else if (TableType.contains("MEC")) {
                RecordInterface.mecData[mec].setEncounterDate("");
                try {
                    RecordInterface.mecData[mec].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.mecData[mec].setEncounterDate("");
                }
                RecordInterface.mecData[mec].setDataField("");
                try {
                    RecordInterface.mecData[mec].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.mecData[mec].setDataField("");
                }
                mec++;
            } else if (TableType.contains("BLD")) {
                RecordInterface.bldData[bld].setEncounterDate("");
                try {
                    RecordInterface.bldData[bld].setEncounterDate(column[k++].equals("") ? "" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.bldData[bld].setEncounterDate("");
                }
                for(int j = 0; j < RecordInterface.component_length; j++) {
                    //RecordInterface.bldData[bld].setDataField(j, "");
                    try {
                        RecordInterface.bldData[bld].setDataField(j, column[k].equals("") ? "" : column[k]);
                        k++;
                    } catch (Exception e) {
                        RecordInterface.bldData[bld].setDataField(j, "");
                    }
                }
                bld++;
            } else if (TableType.contains("POS")) {
                RecordInterface.posData[pos].setEncounterDate("");
                try {
                    RecordInterface.posData[pos].setEncounterDate(column[k++].equals("") ? "" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.posData[pos].setEncounterDate("");
                }
                for(int j = 0; j < RecordInterface.component_length; j++) {
                    //RecordInterface.dtoData[dto].setDataField(j, "");
                    try {
                        RecordInterface.posData[pos].setDataField(j, column[k].equals("") ? "" : column[k]);
                        k++;
                    } catch (Exception e) {
                        RecordInterface.posData[pos].setDataField(j, "");
                    }
                }
                pos++;
            } else if (TableType.contains("MSH")) {
                RecordInterface.mshData[msh].setEncounterDate("");
                try {
                    RecordInterface.mshData[msh].setEncounterDate(column[k++].equals("") ? "" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.mshData[msh].setEncounterDate("");
                }
                for(int j = 0; j < RecordInterface.component_length; j++) {
                    //RecordInterface.mshData[dto].setDataField(j, "");
                    try {
                        RecordInterface.mshData[msh].setDataField(j, column[k].equals("") ? "" : column[k]);
                        k++;
                    } catch (Exception e) {
                        RecordInterface.mshData[msh].setDataField(j, "");
                    }
                }
                msh++;
            } else if (TableType.contains("PEM")) {
                RecordInterface.pemData[pem].setEncounterDate("");
                try {
                    RecordInterface.pemData[pem].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pemData[pem].setEncounterDate("");
                }
                RecordInterface.pemData[pem].setDataField("");
                try {
                    RecordInterface.pemData[pem].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pemData[pem].setDataField("");
                }
                pem++;
            } else if (TableType.contains("PNT")) {
                RecordInterface.pntData[pnt].setEncounterDate("");
                try {
                    RecordInterface.pntData[pnt].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pntData[pnt].setEncounterDate("");
                }
                RecordInterface.pntData[pnt].setDataField("");
                try {
                    RecordInterface.pntData[pnt].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pntData[pnt].setDataField("");
                }
                pnt++;
            } else if (TableType.contains("ORC")) {
                RecordInterface.orcData[orc].setEncounterDate("");
                try {
                    RecordInterface.orcData[orc].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.orcData[orc].setEncounterDate("");
                }
                RecordInterface.orcData[orc].setDataField("");
                try {
                    RecordInterface.orcData[orc].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.orcData[orc].setDataField("");
                }
                orc++;
            } else if (TableType.contains("ROS")) {
                RecordInterface.rosData[ros].setEncounterDate("");
                try {
                    RecordInterface.rosData[ros].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.rosData[ros].setEncounterDate("");
                }
                RecordInterface.rosData[ros].setDataField("");
                try {
                    RecordInterface.rosData[ros].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.rosData[ros].setDataField("");
                }
                ros++;
            } else if (TableType.contains("LIO")) {
                RecordInterface.lioData[lio].setEncounterDate("");
                try {
                    RecordInterface.lioData[lio].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.lioData[lio].setEncounterDate("");
                }
                RecordInterface.lioData[lio].setDataField("");
                try {
                    RecordInterface.lioData[lio].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.lioData[lio].setDataField("");
                }
                lio++;
            } else if (TableType.contains("PIS")) {
                RecordInterface.pisData[pis].setEncounterDate("");
                try {
                    RecordInterface.pisData[pis].setEncounterDate(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pisData[pis].setEncounterDate("");
                }
                RecordInterface.pisData[pis].setDataField("");
                try {
                    RecordInterface.pisData[pis].setDataField(column[k++].equals("") ? "-" : column[k - 1]);
                } catch (Exception e) {
                    RecordInterface.pisData[pis].setDataField("");
                }
                pis++;
            }
        }
    }
}
