package org.yagamipaul.hackerrank.algorithms.implementation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class HappyLadyBugsTest {


    @Test
    fun `test case 1`() {
        val res = HappyLadyBugs().happyLadybugs("RBY_YBR")
        Assertions.assertThat(res).isEqualTo("YES")
    }

    @Test
    fun `test case 2`() {
        val res = HappyLadyBugs().happyLadybugs("X_Y__X")
        Assertions.assertThat(res).isEqualTo("NO")
    }

    @Test
    fun `test case 3`() {
        val res = HappyLadyBugs().happyLadybugs("__")
        Assertions.assertThat(res).isEqualTo("YES")
    }

    @Test
    fun `test case 4`() {
        val res = HappyLadyBugs().happyLadybugs("B_RRBR")
        Assertions.assertThat(res).isEqualTo("YES")
    }



}