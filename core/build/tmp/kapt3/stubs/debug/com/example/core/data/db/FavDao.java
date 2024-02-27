package com.example.core.data.db;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/example/core/data/db/FavDao;", "", "deleteFav", "", "user", "Lcom/example/core/data/db/entity/GithubEntity$Item;", "findByid", "id", "", "insertFav", "loadAll", "Landroidx/lifecycle/LiveData;", "", "core_debug"})
@androidx.room.Dao
public abstract interface FavDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertFav(@org.jetbrains.annotations.NotNull
    com.example.core.data.db.entity.GithubEntity.Item user);
    
    @androidx.room.Query(value = "SELECT * FROM USER")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.core.data.db.entity.GithubEntity.Item>> loadAll();
    
    @androidx.room.Query(value = "SELECT * FROM USER WHERE id LIKE :id LIMIT 1")
    @org.jetbrains.annotations.Nullable
    public abstract com.example.core.data.db.entity.GithubEntity.Item findByid(int id);
    
    @androidx.room.Delete
    public abstract void deleteFav(@org.jetbrains.annotations.NotNull
    com.example.core.data.db.entity.GithubEntity.Item user);
}