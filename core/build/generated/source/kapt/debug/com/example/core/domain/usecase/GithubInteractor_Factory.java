package com.example.core.domain.usecase;

import com.example.core.domain.repository.IGithubRepository;
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
public final class GithubInteractor_Factory implements Factory<GithubInteractor> {
  private final Provider<IGithubRepository> repositoryProvider;

  public GithubInteractor_Factory(Provider<IGithubRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GithubInteractor get() {
    return newInstance(repositoryProvider.get());
  }

  public static GithubInteractor_Factory create(Provider<IGithubRepository> repositoryProvider) {
    return new GithubInteractor_Factory(repositoryProvider);
  }

  public static GithubInteractor newInstance(IGithubRepository repository) {
    return new GithubInteractor(repository);
  }
}
