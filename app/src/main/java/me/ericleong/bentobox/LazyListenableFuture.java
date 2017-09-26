package me.ericleong.bentobox;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;

import dagger.Lazy;

/**
 * Created by Eric on 9/26/2017.
 */

public class LazyListenableFuture<T> implements Lazy<T> {

    private final ListenableFuture<T> mListenableFuture;

    public LazyListenableFuture(ListenableFuture<T> mListenableFuture) {
        this.mListenableFuture = mListenableFuture;
    }

    @Override
    public T get() {
        try {
            return mListenableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Could not get listenable.", e);
        }
    }
}
