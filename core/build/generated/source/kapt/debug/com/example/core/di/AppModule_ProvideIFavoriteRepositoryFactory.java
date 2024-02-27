package com.example.core.di;

import android.content.Context;
import com.example.core.domain.repository.IFavoriteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideIFavoriteRepositoryFactory implements Factory<IFavoriteRepository> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideIFavoriteRepositoryFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public IFavoriteRepository get() {
    return provideIFavoriteRepository(contextProvider.get());
  }

  public static AppModule_ProvideIFavoriteRepositoryFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideIFavoriteRepositoryFactory(contextProvider);
  }

  public static IFavoriteRepository provideIFavoriteRepository(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideIFavoriteRepository(context));
  }
}
