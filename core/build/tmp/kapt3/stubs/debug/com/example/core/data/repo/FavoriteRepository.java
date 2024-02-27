package com.example.core.data.repo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/core/data/repo/FavoriteRepository;", "Lcom/example/core/domain/repository/IFavoriteRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "mFavDao", "Lcom/example/core/data/db/FavDao;", "delete", "", "fav", "Lcom/example/core/domain/model/GithubUser$Item;", "findById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavUser", "Landroidx/lifecycle/LiveData;", "", "insert", "core_debug"})
public final class FavoriteRepository implements com.example.core.domain.repository.IFavoriteRepository {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.core.data.db.FavDao mFavDao = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ExecutorService executorService = null;
    
    @javax.inject.Inject
    public FavoriteRepository(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
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