package com.example.core.domain.usecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/core/domain/usecase/GithubInteractor;", "Lcom/example/core/domain/usecase/GithubUseCase;", "repository", "Lcom/example/core/domain/repository/IGithubRepository;", "(Lcom/example/core/domain/repository/IGithubRepository;)V", "getDetailUserFromGithub", "Lcom/example/core/domain/model/GithubDetailUser;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowerUserFromGithub", "", "Lcom/example/core/domain/model/GithubUser$Item;", "getFollowingUserFromGithub", "getUserFromGithub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUserFromGithub", "Lcom/example/core/domain/model/GithubUser;", "core_debug"})
public final class GithubInteractor implements com.example.core.domain.usecase.GithubUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.domain.repository.IGithubRepository repository = null;
    
    @javax.inject.Inject
    public GithubInteractor(@org.jetbrains.annotations.NotNull
    com.example.core.domain.repository.IGithubRepository repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUserFromGithub(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.model.GithubUser.Item>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object searchUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.domain.model.GithubUser> $completion) {
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
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.model.GithubUser.Item>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getFollowingUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.model.GithubUser.Item>> $completion) {
        return null;
    }
}