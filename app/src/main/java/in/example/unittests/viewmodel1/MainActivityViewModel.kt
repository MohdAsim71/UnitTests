package `in`.example.unittests.viewmodel1

import androidx.lifecycle.ViewModel
import `in`.example.unittests.HomeRepo
import `in`.example.unittests.User

class MainActivityViewModel (val repo: HomeRepo) : ViewModel() {

    fun sumOfTwoNumber(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun multiplicationOfTwoNumber(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divideTwoNumbers(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun getUserDetails() : User? {
        return repo.getUserData()
    }


}