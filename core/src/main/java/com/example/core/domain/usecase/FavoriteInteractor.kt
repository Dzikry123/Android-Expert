package com.example.core.domain.usecase

import androidx.lifecycle.LiveData
import com.example.core.domain.model.GithubUser
import com.example.core.domain.repository.IFavoriteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FavoriteInteractor @Inject constructor(private val repository: IFavoriteRepository): FavoriteUseCase {
    override fun getAllFavUser(): Flow<MutableList<GithubUser.Item>> = repository.getAllFavUser()

    override suspend fun insert(fav: GithubUser.Item) = repository.insert(fav)

    override suspend fun delete(fav: GithubUser.Item) = repository.delete(fav)

    override suspend fun findById(id: Int): GithubUser.Item? = repository.findById(id)
}