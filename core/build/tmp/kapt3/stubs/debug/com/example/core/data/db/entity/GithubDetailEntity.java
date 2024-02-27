package com.example.core.data.db.entity;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u00a2\u0006\u0002\u0010%J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u000bH\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0001H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u000bH\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Y\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u001eH\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0001H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0001H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u000bH\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\u00cb\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010k\u001a\u00020\u001e2\b\u0010l\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010m\u001a\u00020\u000bH\u00d6\u0001J\t\u0010n\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\'R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\'R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\'R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\'R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\'R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\'R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\'R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\'R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\'R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\'R\u0011\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0011\u0010\u001a\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\'R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\'R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\'R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\'R\u0011\u0010!\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\'R\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\'R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\'\u00a8\u0006o"}, d2 = {"Lcom/example/core/data/db/entity/GithubDetailEntity;", "", "avatar_url", "", "bio", "blog", "company", "created_at", "email", "events_url", "followers", "", "followers_url", "following", "following_url", "gists_url", "gravatar_id", "hireable", "html_url", "id", "location", "login", "name", "node_id", "organizations_url", "public_gists", "public_repos", "received_events_url", "repos_url", "site_admin", "", "starred_url", "subscriptions_url", "twitter_username", "type", "updated_at", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar_url", "()Ljava/lang/String;", "getBio", "getBlog", "getCompany", "getCreated_at", "getEmail", "()Ljava/lang/Object;", "getEvents_url", "getFollowers", "()I", "getFollowers_url", "getFollowing", "getFollowing_url", "getGists_url", "getGravatar_id", "getHireable", "getHtml_url", "getId", "getLocation", "getLogin", "getName", "getNode_id", "getOrganizations_url", "getPublic_gists", "getPublic_repos", "getReceived_events_url", "getRepos_url", "getSite_admin", "()Z", "getStarred_url", "getSubscriptions_url", "getTwitter_username", "getType", "getUpdated_at", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "core_debug"})
public final class GithubDetailEntity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String avatar_url = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String bio = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String blog = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String company = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object email = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String events_url = null;
    private final int followers = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String followers_url = null;
    private final int following = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String following_url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gists_url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gravatar_id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object hireable = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String html_url = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String location = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String login = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String node_id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String organizations_url = null;
    private final int public_gists = 0;
    private final int public_repos = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String received_events_url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String repos_url = null;
    private final boolean site_admin = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String starred_url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String subscriptions_url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object twitter_username = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String url = null;
    
    public GithubDetailEntity(@org.jetbrains.annotations.NotNull
    java.lang.String avatar_url, @org.jetbrains.annotations.Nullable
    java.lang.String bio, @org.jetbrains.annotations.NotNull
    java.lang.String blog, @org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    java.lang.String created_at, @org.jetbrains.annotations.NotNull
    java.lang.Object email, @org.jetbrains.annotations.NotNull
    java.lang.String events_url, int followers, @org.jetbrains.annotations.NotNull
    java.lang.String followers_url, int following, @org.jetbrains.annotations.NotNull
    java.lang.String following_url, @org.jetbrains.annotations.NotNull
    java.lang.String gists_url, @org.jetbrains.annotations.NotNull
    java.lang.String gravatar_id, @org.jetbrains.annotations.NotNull
    java.lang.Object hireable, @org.jetbrains.annotations.NotNull
    java.lang.String html_url, int id, @org.jetbrains.annotations.NotNull
    java.lang.String location, @org.jetbrains.annotations.NotNull
    java.lang.String login, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String node_id, @org.jetbrains.annotations.NotNull
    java.lang.String organizations_url, int public_gists, int public_repos, @org.jetbrains.annotations.NotNull
    java.lang.String received_events_url, @org.jetbrains.annotations.NotNull
    java.lang.String repos_url, boolean site_admin, @org.jetbrains.annotations.NotNull
    java.lang.String starred_url, @org.jetbrains.annotations.NotNull
    java.lang.String subscriptions_url, @org.jetbrains.annotations.NotNull
    java.lang.Object twitter_username, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAvatar_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBio() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBlog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEvents_url() {
        return null;
    }
    
    public final int getFollowers() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFollowers_url() {
        return null;
    }
    
    public final int getFollowing() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFollowing_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGists_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGravatar_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getHireable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHtml_url() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNode_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrganizations_url() {
        return null;
    }
    
    public final int getPublic_gists() {
        return 0;
    }
    
    public final int getPublic_repos() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReceived_events_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRepos_url() {
        return null;
    }
    
    public final boolean getSite_admin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStarred_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubscriptions_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getTwitter_username() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    public final boolean component26() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.core.data.db.entity.GithubDetailEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String avatar_url, @org.jetbrains.annotations.Nullable
    java.lang.String bio, @org.jetbrains.annotations.NotNull
    java.lang.String blog, @org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    java.lang.String created_at, @org.jetbrains.annotations.NotNull
    java.lang.Object email, @org.jetbrains.annotations.NotNull
    java.lang.String events_url, int followers, @org.jetbrains.annotations.NotNull
    java.lang.String followers_url, int following, @org.jetbrains.annotations.NotNull
    java.lang.String following_url, @org.jetbrains.annotations.NotNull
    java.lang.String gists_url, @org.jetbrains.annotations.NotNull
    java.lang.String gravatar_id, @org.jetbrains.annotations.NotNull
    java.lang.Object hireable, @org.jetbrains.annotations.NotNull
    java.lang.String html_url, int id, @org.jetbrains.annotations.NotNull
    java.lang.String location, @org.jetbrains.annotations.NotNull
    java.lang.String login, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String node_id, @org.jetbrains.annotations.NotNull
    java.lang.String organizations_url, int public_gists, int public_repos, @org.jetbrains.annotations.NotNull
    java.lang.String received_events_url, @org.jetbrains.annotations.NotNull
    java.lang.String repos_url, boolean site_admin, @org.jetbrains.annotations.NotNull
    java.lang.String starred_url, @org.jetbrains.annotations.NotNull
    java.lang.String subscriptions_url, @org.jetbrains.annotations.NotNull
    java.lang.Object twitter_username, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}