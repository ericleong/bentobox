package me.ericleong.bentobox;

import android.support.annotation.Nullable;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/**
 * Created by Eric on 9/26/2017.
 */
public class DeferredLogger implements Logger {
    final ListenableFuture<Logger> loggerFuture;

    public DeferredLogger(ListenableFuture<Logger> loggerFuture) {
        this.loggerFuture = loggerFuture;
    }

    @Override
    public void log(final String s) {
        Futures.addCallback(loggerFuture, new FutureCallback<Logger>() {
            @Override
            public void onSuccess(@Nullable Logger logger) {
                logger.log(s);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        }, MoreExecutors.directExecutor());
    }
}
