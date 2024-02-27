package com.example.core.data.repo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\f\u0010\u0012\u001a\u00020\u0006*\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/core/data/repo/GithubRepository;", "Lcom/example/core/domain/repository/IGithubRepository;", "serviceGithub", "Lcom/example/core/data/service/ServiceGithub;", "(Lcom/example/core/data/service/ServiceGithub;)V", "getDetailUserFromGithub", "Lcom/example/core/domain/model/GithubDetailUser;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowerUserFromGithub", "", "Lcom/example/core/data/db/entity/GithubEntity$Item;", "getFollowingUserFromGithub", "getUserFromGithub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUserFromGithub", "Lcom/example/core/data/db/entity/GithubEntity;", "toGithubDetailUser", "Lcom/example/core/data/responses/ResponseDetailUserGithub;", "core_debug"})
public final class GithubRepository implements com.example.core.domain.repository.IGithubRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.data.service.ServiceGithub serviceGithub = null;
    
    @javax.inject.Inject
    public GithubRepository(@org.jetbrains.annotations.NotNull
    com.example.core.data.service.ServiceGithub serviceGithub) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUserFromGithub(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.data.db.entity.GithubEntity.Item>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object searchUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.data.db.entity.GithubEntity> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getDetailUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.domain.model.GithubDetailUser> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getFollowerUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.data.db.entity.GithubEntity.Item>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getFollowingUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.data.db.entity.GithubEntity.Item>> $completion) {
        return null;
    }
    
    private final com.example.core.domain.model.GithubDetailUser toGithubDetailUser(com.example.core.data.responses.ResponseDetailUserGithub $this$toGithubDetailUser) {
        return null;
    }
}