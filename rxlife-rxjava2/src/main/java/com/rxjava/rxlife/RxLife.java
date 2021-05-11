package com.rxjava.rxlife;

import android.view.View;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.parallel.ParallelFlowable;

/**
 * User: ljx
 * Date: 2019/4/3
 * Time: 14:41
 */
public final class RxLife {

    public static <T> RxConverter<T> as(LifecycleOwner owner) {
        return as(owner, Event.ON_DESTROY, false);
    }

    public static <T> RxConverter<T> as(LifecycleOwner owner, Event event) {
        return as(owner, event, false);
    }

    public static <T> RxConverter<T> asOnMain(LifecycleOwner owner) {
        return as(owner, Event.ON_DESTROY, true);
    }

    public static <T> RxConverter<T> asOnMain(LifecycleOwner owner, Event event) {
        return as(owner, event, true);
    }

    private static <T> RxConverter<T> as(LifecycleOwner owner, Event event, boolean onMain) {
        return as(LifecycleScope.from(owner, event), onMain);
    }

    public static <T> RxConverter<T> as(View view) {
        return as(ViewScope.from(view, false), false);
    }

    /**
     * @param view         目标View
     * @param ignoreAttach 忽略View是否添加到Window，默认为false，即不忽略
     * @return RxConverter
     */
    public static <T> RxConverter<T> as(View view, boolean ignoreAttach) {
        return as(ViewScope.from(view, ignoreAttach), false);
    }

    public static <T> RxConverter<T> asOnMain(View view) {
        return as(ViewScope.from(view, false), true);
    }

    /**
     * @param view         目标View
     * @param ignoreAttach 忽略View是否添加到Window，默认为false，即不忽略
     * @return RxConverter
     */
    public static <T> RxConverter<T> asOnMain(View view, boolean ignoreAttach) {
        return as(ViewScope.from(view, ignoreAttach), true);
    }

    public static <T> RxConverter<T> as(Scope scope) {
        return as(scope, false);
    }

    public static <T> RxConverter<T> asOnMain(Scope scope) {
        return as(scope, true);
    }

    private static <T> RxConverter<T> as(Scope scope, boolean onMain) {
        return new RxConverter<T>() {

            @Override
            public ObservableLife<T> apply(Observable<T> upstream) {
                return new ObservableLife<>(upstream, scope, onMain);
            }

            @Override
            public FlowableLife<T> apply(Flowable<T> upstream) {
                return new FlowableLife<>(upstream, scope, onMain);
            }

            @Override
            public ParallelFlowableLife<T> apply(ParallelFlowable<T> upstream) {
                return new ParallelFlowableLife<>(upstream, scope, onMain);
            }

            @Override
            public MaybeLife<T> apply(Maybe<T> upstream) {
                return new MaybeLife<>(upstream, scope, onMain);
            }

            @Override
            public SingleLife<T> apply(Single<T> upstream) {
                return new SingleLife<>(upstream, scope, onMain);
            }

            @Override
            public CompletableLife apply(Completable upstream) {
                return new CompletableLife(upstream, scope, onMain);
            }
        };
    }

    public static void dispose(Disposable disposable) {
        if (!isDisposed(disposable)) disposable.dispose();
    }

    public static boolean isDisposed(Disposable disposable) {
        return disposable == null || disposable.isDisposed();
    }

}
