package com.example.core.domain.usecase;

import com.example.core.domain.repository.IFavoriteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class FavoriteInteractor_Factory implements Factory<FavoriteInteractor> {
  private final Provider<IFavoriteRepository> repositoryProvider;

  public FavoriteInteractor_Factory(Provider<IFavoriteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavoriteInteractor get() {
    return newInstance(repositoryProvider.get());
  }

  public static FavoriteInteractor_Factory create(
      Provider<IFavoriteRepository> repositoryProvider) {
    return new FavoriteInteractor_Factory(repositoryProvider);
  }

  public static FavoriteInteractor newInstance(IFavoriteRepository repository) {
    return new FavoriteInteractor(repository);
  }
}
