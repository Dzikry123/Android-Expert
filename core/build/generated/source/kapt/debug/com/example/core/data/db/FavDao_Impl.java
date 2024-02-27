package com.example.core.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.core.data.db.entity.GithubEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavDao_Impl implements FavDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GithubEntity.Item> __insertionAdapterOfItem;

  private final EntityDeletionOrUpdateAdapter<GithubEntity.Item> __deletionAdapterOfItem;

  public FavDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItem = new EntityInsertionAdapter<GithubEntity.Item>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user` (`avatar_url`,`id`,`login`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GithubEntity.Item value) {
        if (value.getAvatar_url() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAvatar_url());
        }
        stmt.bindLong(2, value.getId());
        if (value.getLogin() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLogin());
        }
      }
    };
    this.__deletionAdapterOfItem = new EntityDeletionOrUpdateAdapter<GithubEntity.Item>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GithubEntity.Item value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insertFav(final GithubEntity.Item user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfItem.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFav(final GithubEntity.Item user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfItem.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<GithubEntity.Item>> loadAll() {
    final String _sql = "SELECT * FROM USER";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"USER"}, false, new Callable<List<GithubEntity.Item>>() {
      @Override
      public List<GithubEntity.Item> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final List<GithubEntity.Item> _result = new ArrayList<GithubEntity.Item>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GithubEntity.Item _item;
            final String _tmpAvatar_url;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatar_url = null;
            } else {
              _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            _item = new GithubEntity.Item(_tmpAvatar_url,_tmpId,_tmpLogin);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public GithubEntity.Item findByid(final int id) {
    final String _sql = "SELECT * FROM USER WHERE id LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
      final GithubEntity.Item _result;
      if(_cursor.moveToFirst()) {
        final String _tmpAvatar_url;
        if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
          _tmpAvatar_url = null;
        } else {
          _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
        }
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpLogin;
        if (_cursor.isNull(_cursorIndexOfLogin)) {
          _tmpLogin = null;
        } else {
          _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
        }
        _result = new GithubEntity.Item(_tmpAvatar_url,_tmpId,_tmpLogin);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
