package com.example.core.di;

import com.example.core.data.service.ServiceGithub;
import com.example.core.domain.repository.IGithubRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideGithubUserListRepositoryFactory implements Factory<IGithubRepository> {
  private final Provider<ServiceGithub> serviceProvider;

  public AppModule_ProvideGithubUserListRepositoryFactory(Provider<ServiceGithub> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public IGithubRepository get() {
    return provideGithubUserListRepository(serviceProvider.get());
  }

  public static AppModule_ProvideGithubUserListRepositoryFactory create(
      Provider<ServiceGithub> serviceProvider) {
    return new AppModule_ProvideGithubUserListRepositoryFactory(serviceProvider);
  }

  public static IGithubRepository provideGithubUserListRepository(ServiceGithub service) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideGithubUserListRepository(service));
  }
}
