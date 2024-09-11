package `in`.example.unittests.viewmodel2

import androidx.lifecycle.ViewModel
import `in`.example.unittests.User
import `in`.example.unittests.usecases.UserUseCase

class MainActivityViewModelWithUseCaseAndRepo(private val useCase: UserUseCase) : ViewModel() {

    fun getUserDetails(): User? {
        return useCase.fetchUserData()
    }

    fun saveUserDetails(user: User): Boolean {
        return useCase.updateUserDetails(user)
    }
}