package com.example.core.data.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/core/data/service/ServiceGithub;", "", "getDetailUserFromGithub", "Lcom/example/core/data/responses/ResponseDetailUserGithub;", "username", "", "authorization", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowerUserFromGithub", "", "Lcom/example/core/data/responses/ResponseUserGithub$Item;", "getFollowingUserFromGithub", "getUserFromGithub", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUserFromGithub", "Lcom/example/core/data/responses/ResponseUserGithub;", "params", "", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface ServiceGithub {
    
    @retrofit2.http.GET(value = "users")
    @kotlin.jvm.JvmSuppressWildcards
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserFromGithub(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<java.util.List<com.example.core.data.responses.ResponseUserGithub.Item>> $completion);
    
    @retrofit2.http.GET(value = "users/{username}")
    @kotlin.jvm.JvmSuppressWildcards
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetailUserFromGithub(@retrofit2.http.Path(value = "username")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<com.example.core.data.responses.ResponseDetailUserGithub> $completion);
    
    @retrofit2.http.GET(value = "users/{username}/followers")
    @kotlin.jvm.JvmSuppressWildcards
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFollowerUserFromGithub(@retrofit2.http.Path(value = "username")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<java.util.List<com.example.core.data.responses.ResponseUserGithub.Item>> $completion);
    
    @retrofit2.http.GET(value = "users/{username}/following")
    @kotlin.jvm.JvmSuppressWildcards
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFollowingUserFromGithub(@retrofit2.http.Path(value = "username")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<java.util.List<com.example.core.data.responses.ResponseUserGithub.Item>> $completion);
    
    @retrofit2.http.GET(value = "search/users")
    @kotlin.jvm.JvmSuppressWildcards
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchUserFromGithub(@retrofit2.http.QueryMap
    @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> params, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<com.example.core.data.responses.ResponseUserGithub> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}