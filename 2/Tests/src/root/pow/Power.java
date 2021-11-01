/**
 * Copyright (c) 2009 ISP RAS.
 * 109004, A. Solzhenitsina, 25, Moscow, Russia.
 * All rights reserved.
 *
 * $Id$
 * Created on Jan 15, 2016
 */

package root.pow;

/**
 * @author Victor Kuliamin
 */
public class Power {

    public int pow(int a, int b) {
        int r = 1;

        while(b > 0) {
            if((b&1) != 0) {
                r *= a;
                if(r < 0){
                    r -= Integer.MIN_VALUE;
                }
            }
            a *= a;
            if(a < 0){
                a -= Integer.MIN_VALUE;
            }
            b >>= 1;
        }

        return r;
    }
}