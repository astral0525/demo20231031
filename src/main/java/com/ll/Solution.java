
package com.ll;
import java.util.*;

class Solution {
    public int soulution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}
