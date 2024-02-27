package com.example.core.domain.usecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/core/domain/usecase/FavoriteInteractor;", "Lcom/example/core/domain/usecase/FavoriteUseCase;", "repository", "Lcom/example/core/domain/repository/IFavoriteRepository;", "(Lcom/example/core/domain/repository/IFavoriteRepository;)V", "delete", "", "fav", "Lcom/example/core/domain/model/GithubUser$Item;", "findById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavUser", "Landroidx/lifecycle/LiveData;", "", "insert", "core_debug"})
public final class FavoriteInteractor implements com.example.core.domain.usecase.FavoriteUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.domain.repository.IFavoriteRepository repository = null;
    
    @javax.inject.Inject
    public FavoriteInteractor(@org.jetbrains.annotations.NotNull
    com.example.core.domain.repository.IFavoriteRepository repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.example.core.domain.model.GithubUser.Item>> getAllFavUser() {
        return null;
    }
    
    @java.lang.Override
    public void insert(@org.jetbrains.annotations.NotNull
    com.example.core.domain.model.GithubUser.Item fav) {
    }
    
    @java.lang.Override
    public void delete(@org.jetbrains.annotations.NotNull
    com.example.core.domain.model.GithubUser.Item fav) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object findById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.domain.model.GithubUser.Item> $completion) {
        return null;
    }
}