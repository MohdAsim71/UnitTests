package `in`.example.unittests.usecases

import `in`.example.unittests.HomeRepo
import `in`.example.unittests.User

class UserUseCase(private val repo: HomeRepo) {

    fun fetchUserData(): User? {
        return repo.getUserData()
    }

    fun updateUserDetails(user: User): Boolean {
        return repo.saveUserData(user)
    }
}