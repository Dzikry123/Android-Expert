package com.example.core.di;

import com.example.core.data.service.ServiceGithub;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideServiceGithubFactory implements Factory<ServiceGithub> {
  @Override
  public ServiceGithub get() {
    return provideServiceGithub();
  }

  public static AppModule_ProvideServiceGithubFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ServiceGithub provideServiceGithub() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideServiceGithub());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideServiceGithubFactory INSTANCE = new AppModule_ProvideServiceGithubFactory();
  }
}
