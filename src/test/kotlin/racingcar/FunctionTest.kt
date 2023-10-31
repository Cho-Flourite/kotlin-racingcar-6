package racingcar

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import racingcar.model.CarNameSeparator
import racingcar.model.RacingGame
import racingcar.model.WinnerDiscrimination

class FunctionTest{
    @Test
    fun `자동차 이름 분리 테스트`() {
        val names = "kim,su,han,mu"
        val result = CarNameSeparator().separator(names)
        val expectedList = listOf("kim", "su", "han", "mu")
        assertEquals(expectedList, result)
    }

    @Test
    fun `우승자 판별 테스트`() {
        val scoreBoard = listOf("-", "--", "--", "-")
        val cars = listOf("kim", "su", "han", "mu")
        val result = WinnerDiscrimination().answer(scoreBoard, cars)
        val expectedWinners = listOf("su", "han")
        assertEquals(expectedWinners, result)
    }

    @Test
    fun `레이싱 게임 기능 테스트`() {
        camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest(
            {
                val expectedResult = RacingGame().racing(listOf("","","-"))
                assertEquals(expectedResult, listOf("-","","--"))
            },
            MOVING_FORWARD, STOP, MOVING_FORWARD
        )
    }


    companion object {
        private const val MOVING_FORWARD = 4
        private const val STOP = 3
    }

}