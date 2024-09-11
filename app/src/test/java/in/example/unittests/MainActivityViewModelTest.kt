package `in`.example.unittests

import `in`.example.unittests.viewmodel1.MainActivityViewModel
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test


class MainActivityViewModelTest {

        private  lateinit var viewModel :MainActivityViewModel
        private  lateinit var  repo: HomeRepo


        @Before
        fun setUp(){
            repo = mockk()
            viewModel = MainActivityViewModel(repo)
        }

        @Test
        fun sumOfTwoNumberTest(){
            val result = viewModel.sumOfTwoNumber(2,4)
            assertEquals(result,6)
        }


    @Test
    fun multiplicationOfTwoNumberTest(){
        val result = viewModel.multiplicationOfTwoNumber(2,3)
        assertEquals(result,6)
    }

    @Test
    fun divideTwoNumberTest(){
        val result = viewModel.divideTwoNumbers(10,2)
        assertEquals(result,5)

    }

    @Test
    fun getUserTest(){
        val sprRepo = spyk(repo)
        val spyViewModel = MainActivityViewModel(sprRepo)

        val mockUser = User("userId 1", "user name", 26)

        every { spyViewModel.getUserDetails() } returns  mockUser

        val result = spyViewModel.getUserDetails()

        assertEquals(result, mockUser)
    }

    @Test
    fun sumOfTwoNumberMock(){
    val mockViewModel = mockk<MainActivityViewModel>()
        every { mockViewModel.sumOfTwoNumber(2,5) } returns  7

        val result = mockViewModel.sumOfTwoNumber(2,5)

        assertEquals(7,result)
    }

    @Test
    fun multiplicationOfTwoMock(){
        val mockViewModel = mockk<MainActivityViewModel>()
        every { mockViewModel.multiplicationOfTwoNumber(2,5) } returns 10
        val result1 = mockViewModel.multiplicationOfTwoNumber(2,5)

        assertEquals(10,result1)

        verify { mockViewModel.multiplicationOfTwoNumber(2,5) }
    }

    @Test
    fun divideTwoNumberMockTest(){

        val mockViewModel = mockk<MainActivityViewModel>()
        every { mockViewModel.divideTwoNumbers(10,2) } returns  5

        val result1= mockViewModel.divideTwoNumbers(10,2)
        assertEquals(5, result1)
    }
}