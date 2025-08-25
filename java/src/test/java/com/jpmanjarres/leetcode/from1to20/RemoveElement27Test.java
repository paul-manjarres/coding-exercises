package com.jpmanjarres.leetcode.from1to20;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElement27Test {

    @Test
    void removeElementTest1() {
        int[] data = new int[] {3, 2, 2, 3};
        int response = RemoveElement27.removeElement(data, 3);
        Assertions.assertThat(response).isEqualTo(2);
        Assertions.assertThat(data[0]).isEqualTo(2);
        Assertions.assertThat(data[1]).isEqualTo(2);
    }

    @Test
    void removeElementTest2() {
        int[] data = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        int response = RemoveElement27.removeElement(data, 2);
        Assertions.assertThat(response).isEqualTo(5);
        //        Assertions.assertThat(data[0]).isEqualTo(0);
        //        Assertions.assertThat(data[1]).isEqualTo(1);
        //        Assertions.assertThat(data[2]).isEqualTo(4);
        //        Assertions.assertThat(data[3]).isEqualTo(0);
        //        Assertions.assertThat(data[4]).isEqualTo(3);
    }
}
