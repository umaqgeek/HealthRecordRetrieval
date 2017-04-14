/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Bean.*;
import Helper.S;

/**
 *
 * @author End User
 */
public class RecordInterface {
    protected static final int full_length = 300;
    protected static final int component_length = 20;
    private String inputRecord;
    protected static CCN1 ccnData[] = new CCN1[full_length];
    protected static HPI1 hpiData[] = new HPI1[full_length];
    protected static PMH1 pmhData[] = new PMH1[full_length];
    protected static FMH1 fmhData[] = new FMH1[full_length];
    protected static SOH1 sohData[] = new SOH1[full_length];
    protected static ALG1 algData[] = new ALG1[full_length];
    protected static IMU1 imuData[] = new IMU1[full_length];
    protected static DAB1 dabData[] = new DAB1[full_length];
    protected static VTS1 vtsData[] = new VTS1[full_length];
    protected static DGS1 dgsData[] = new DGS1[full_length];
    protected static DTO1 dtoData[] = new DTO1[full_length];
    protected static PDI1 pdiData[] = new PDI1[full_length];
    protected static MEC1 mecData[] = new MEC1[full_length];
    protected static BLD1 bldData[] = new BLD1[full_length];
    protected static POS1 posData[] = new POS1[full_length];
    protected static MSH1 mshData[] = new MSH1[full_length];
    protected static PEM1 pemData[] = new PEM1[full_length];
    protected static PNT1 pntData[] = new PNT1[full_length];
    protected RecordInterface() {
        for(int i = 0; i < full_length; i++) {
            ccnData[i] = new CCN1();
            hpiData[i] = new HPI1();
            pmhData[i] = new PMH1();
            fmhData[i] = new FMH1();
            sohData[i] = new SOH1();
            algData[i] = new ALG1();
            imuData[i] = new IMU1();
            dabData[i] = new DAB1();
            vtsData[i] = new VTS1();
            dgsData[i] = new DGS1();
            dtoData[i] = new DTO1();
            pdiData[i] = new PDI1();
            mecData[i] = new MEC1();
            bldData[i] = new BLD1();
            posData[i] = new POS1();
            mshData[i] = new MSH1();
            pemData[i] = new PEM1();
            pntData[i] = new PNT1();
        }
    }
    protected void setInputRecord(String ir) {
        inputRecord = ir;
    }
    protected String getInputRecord() {
        return inputRecord;
    }
    protected String[][] getOutputRecord(String type) {
        String msg[][] = new String[full_length][full_length];
        if (type.contains("CCN")) {
            for(int i = 0; i < ExtractorManager.ccn && i < full_length; i++) {
                msg[i][0] = ccnData[i].getEncounterDate();
                for(int j = 1; j < ccnData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = ccnData[i].getTokenData()[j-1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.ccn;
        } else if (type.contains("HPI")) {
            for(int i = 0; i < ExtractorManager.hpi && i < full_length; i++) {
                msg[i][0] = hpiData[i].getEncounterDate();
                for (int j = 1; j < hpiData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = hpiData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.hpi;
        } else if (type.contains("PMH")) {
            for (int i = 0; i < ExtractorManager.pmh && i < full_length; i++) {
                msg[i][0] = pmhData[i].getEncounterDate();
                for (int j = 1; j < pmhData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = pmhData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.pmh;
        } else if (type.contains("FMH")) {
            for (int i = 0; i < ExtractorManager.fmh && i < full_length; i++) {
                msg[i][0] = fmhData[i].getEncounterDate();
                for (int j = 1; j < fmhData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = fmhData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.fmh;
        } else if (type.contains("SOH")) {
            for (int i = 0; i < ExtractorManager.soh && i < full_length; i++) {
                msg[i][0] = sohData[i].getEncounterDate();
                for (int j = 1; j < sohData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = sohData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.soh;
        } else if (type.contains("ALG")) {
            for (int i = 0; i < ExtractorManager.alg && i < full_length; i++) {
                msg[i][0] = algData[i].getEncounterDate();
                for (int j = 1; j < algData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = algData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.alg;
        } else if (type.contains("IMU")) {
            for (int i = 0; i < ExtractorManager.imu && i < full_length; i++) {
                msg[i][0] = imuData[i].getEncounterDate();
                for (int j = 1; j < imuData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = imuData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.imu;
        } else if (type.contains("DAB")) {
            for (int i = 0; i < ExtractorManager.dab && i < full_length; i++) {
                msg[i][0] = dabData[i].getEncounterDate();
                for (int j = 1; j < dabData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = dabData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.dab;
        } else if (type.contains("VTS")) {
            for (int i = 0; i < ExtractorManager.vts && i < full_length; i++) {
                msg[i][0] = vtsData[i].getEncounterDate();
                for (int j = 1; j < vtsData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = vtsData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.vts;
        } else if (type.contains("DGS")) {
            for (int i = 0; i < ExtractorManager.dgs && i < full_length; i++) {
                msg[i][0] = dgsData[i].getEncounterDate();
                for (int j = 1; j < dgsData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = dgsData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.dgs;
        } else if (type.contains("DTO")) {
            for (int i = 0; i < ExtractorManager.dto && i < full_length; i++) {
                msg[i][0] = dtoData[i].getEncounterDate();
                int p = 1;
                for (int k = 0; k < dtoData[i].getTokenData().length && k < component_length; k++) {
                    for (int j = 0; j < dtoData[i].getTokenData()[k].length && j < full_length; j++) {
                        msg[i][p] = dtoData[i].getTokenData()[k][j];
                        p++;
                    }
                }
            }
            MainRetrieval.row_nums = ExtractorManager.dto;
        } else if (type.contains("PDI")) {
            for (int i = 0; i < ExtractorManager.pdi && i < full_length; i++) {
                int p = 0;
                for (int k = 0; k < pdiData[i].getTokenData().length && k < component_length; k++) {
                    for (int j = 0; j < pdiData[i].getTokenData()[k].length && j < full_length; j++) {
                        msg[i][p] = pdiData[i].getTokenData()[k][j];
                        p++;
                    }
                }
            }
            MainRetrieval.row_nums = ExtractorManager.pdi;
        } else if (type.contains("MEC")) {
            for (int i = 0; i < ExtractorManager.mec && i < full_length; i++) {
                msg[i][0] = mecData[i].getEncounterDate();
                for (int j = 1; j < mecData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = mecData[i].getTokenData()[j - 1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.mec;
        } else if (type.contains("BLD")) {
            for (int i = 0; i < ExtractorManager.bld && i < full_length; i++) {
                int p = 0;
                for (int k = 0; k < bldData[i].getTokenData().length && k < component_length; k++) {
                    for (int j = 0; j < bldData[i].getTokenData()[k].length && j < full_length; j++) {
                        msg[i][p] = bldData[i].getTokenData()[k][j];
                        p++;
                    }
                }
            }
            MainRetrieval.row_nums = ExtractorManager.bld;
        } else if (type.contains("POS")) {
            for (int i = 0; i < ExtractorManager.pos && i < full_length; i++) {
                msg[i][0] = posData[i].getEncounterDate();
                int p = 1;
                for (int k = 0; k < posData[i].getTokenData().length && k < component_length; k++) {
                    for (int j = 0; j < posData[i].getTokenData()[k].length && j < full_length; j++) {
                        msg[i][p] = posData[i].getTokenData()[k][j];
                        p++;
                    }
                }
            }
            MainRetrieval.row_nums = ExtractorManager.pos;
        } else if (type.contains("MSH")) {
            for (int i = 0; i < ExtractorManager.msh && i < full_length; i++) {
                msg[i][0] = mshData[i].getEncounterDate();
                int p = 1;
                for (int k = 0; k < mshData[i].getTokenData().length && k < component_length; k++) {
                    for (int j = 0; j < mshData[i].getTokenData()[k].length && j < full_length; j++) {
                        msg[i][p] = mshData[i].getTokenData()[k][j];
                        p++;
                    }
                }
            }
            MainRetrieval.row_nums = ExtractorManager.msh;
        } else if (type.contains("PEM")) {
            for(int i = 0; i < ExtractorManager.pem && i < full_length; i++) {
                msg[i][0] = pemData[i].getEncounterDate();
                for(int j = 1; j < pemData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = pemData[i].getTokenData()[j-1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.pem;
        } else if (type.contains("PNT")) {
            for(int i = 0; i < ExtractorManager.pnt && i < full_length; i++) {
                msg[i][0] = pntData[i].getEncounterDate();
                for(int j = 1; j < pntData[i].getTokenData().length && j < full_length; j++) {
                    msg[i][j] = pntData[i].getTokenData()[j-1];
                }
            }
            MainRetrieval.row_nums = ExtractorManager.pnt;
        }
        return msg;
    }
}
