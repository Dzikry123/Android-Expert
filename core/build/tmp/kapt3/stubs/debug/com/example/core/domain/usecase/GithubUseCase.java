package com.example.core.domain.usecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/core/domain/usecase/GithubUseCase;", "", "getDetailUserFromGithub", "Lcom/example/core/domain/model/GithubDetailUser;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowerUserFromGithub", "", "Lcom/example/core/domain/model/GithubUser$Item;", "getFollowingUserFromGithub", "getUserFromGithub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUserFromGithub", "Lcom/example/core/domain/model/GithubUser;", "core_debug"})
public abstract interface GithubUseCase {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserFromGithub(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.model.GithubUser.Item>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.domain.model.GithubUser> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetailUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.domain.model.GithubDetailUser> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFollowerUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.model.GithubUser.Item>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFollowingUserFromGithub(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.model.GithubUser.Item>> $completion);
}