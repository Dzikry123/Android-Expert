package com.example.core.data.repo;

import com.example.core.data.service.ServiceGithub;
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
public final class GithubRepository_Factory implements Factory<GithubRepository> {
  private final Provider<ServiceGithub> serviceGithubProvider;

  public GithubRepository_Factory(Provider<ServiceGithub> serviceGithubProvider) {
    this.serviceGithubProvider = serviceGithubProvider;
  }

  @Override
  public GithubRepository get() {
    return newInstance(serviceGithubProvider.get());
  }

  public static GithubRepository_Factory create(Provider<ServiceGithub> serviceGithubProvider) {
    return new GithubRepository_Factory(serviceGithubProvider);
  }

  public static GithubRepository newInstance(ServiceGithub serviceGithub) {
    return new GithubRepository(serviceGithub);
  }
}
