package com.example.core.domain.usecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/core/domain/usecase/FavoriteUseCase;", "", "delete", "", "fav", "Lcom/example/core/domain/model/GithubUser$Item;", "findById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavUser", "Landroidx/lifecycle/LiveData;", "", "insert", "core_debug"})
public abstract interface FavoriteUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.core.domain.model.GithubUser.Item>> getAllFavUser();
    
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.core.domain.model.GithubUser.Item fav);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.core.domain.model.GithubUser.Item fav);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.domain.model.GithubUser.Item> $completion);
}