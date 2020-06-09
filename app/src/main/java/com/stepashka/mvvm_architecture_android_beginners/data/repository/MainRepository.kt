package com.stepashka.mvvm_architecture_android_beginners.data.repository

import com.stepashka.mvvm_architecture_android_beginners.data.api.ApiHelper
import com.stepashka.mvvm_architecture_android_beginners.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}