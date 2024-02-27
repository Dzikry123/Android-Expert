package com.example.core.ui.main;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B)\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/core/ui/main/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/core/ui/main/UserAdapter$UserViewHolder;", "data", "", "Lcom/example/core/domain/model/GithubUser$Item;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "UserViewHolder", "core_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.core.ui.main.UserAdapter.UserViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.core.domain.model.GithubUser.Item> data = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.core.domain.model.GithubUser.Item, kotlin.Unit> listener = null;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.core.domain.model.GithubUser.Item> data, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.core.domain.model.GithubUser.Item, kotlin.Unit> listener) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.core.domain.model.GithubUser.Item> data) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.core.ui.main.UserAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.core.ui.main.UserAdapter.UserViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/core/ui/main/UserAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Lcom/example/core/databinding/ListItemBinding;", "(Lcom/example/core/databinding/ListItemBinding;)V", "bind", "", "item", "Lcom/example/core/domain/model/GithubUser$Item;", "core_debug"})
    public static final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.core.databinding.ListItemBinding v = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull
        com.example.core.databinding.ListItemBinding v) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.core.domain.model.GithubUser.Item item) {
        }
    }
}