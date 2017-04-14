/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author End User
 */
public abstract class CIS1 {
    protected static final int component_length = 20;
    public static int numCheck(String str, char find) {
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == find) {
                num++;
            }
        }
        return num;
    }
}
