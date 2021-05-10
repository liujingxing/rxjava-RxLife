package com.rxjava.rxlife

import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import io.reactivex.rxjava3.core.*
import io.reactivex.rxjava3.parallel.ParallelFlowable


/**
 * [Observable.as] + [RxLife.as]
 */
fun <T> Observable<T>.life(owner: LifecycleOwner): ObservableLife<T> =
    this.to(RxLife.`as`<T>(owner))

fun <T> Flowable<T>.life(owner: LifecycleOwner): FlowableLife<T> =
    this.to(RxLife.`as`(owner))

fun <T> Maybe<T>.life(owner: LifecycleOwner): MaybeLife<T> =
    this.to(RxLife.`as`<T>(owner))

fun Completable.life(owner: LifecycleOwner): CompletableLife =
    this.to(RxLife.`as`<Any>(owner))

fun <T> Single<T>.life(owner: LifecycleOwner): SingleLife<T> =
    this.to(RxLife.`as`<T>(owner))

fun <T> ParallelFlowable<T>.life(owner: LifecycleOwner): ParallelFlowableLife<T> =
    this.to(RxLife.`as`<T>(owner))

fun <T> Observable<T>.life(view: View): ObservableLife<T> =
    this.to(RxLife.`as`<T>(view))

fun <T> Flowable<T>.life(view: View): FlowableLife<T> =
    this.to(RxLife.`as`(view))

fun <T> Maybe<T>.life(view: View): MaybeLife<T> =
    this.to(RxLife.`as`<T>(view))

fun Completable.life(view: View): CompletableLife =
    this.to(RxLife.`as`<Any>(view))

fun <T> Single<T>.life(view: View): SingleLife<T> =
    this.to(RxLife.`as`<T>(view))

fun <T> ParallelFlowable<T>.life(view: View): ParallelFlowableLife<T> =
    this.to(RxLife.`as`<T>(view))

fun <T> Observable<T>.life(view: View, ignoreAttach: Boolean): ObservableLife<T> =
        this.to(RxLife.`as`<T>(view, ignoreAttach))

fun <T> Flowable<T>.life(view: View, ignoreAttach: Boolean): FlowableLife<T> =
        this.to(RxLife.`as`(view, ignoreAttach))

fun <T> Maybe<T>.life(view: View, ignoreAttach: Boolean): MaybeLife<T> =
        this.to(RxLife.`as`<T>(view, ignoreAttach))

fun Completable.life(view: View, ignoreAttach: Boolean): CompletableLife =
        this.to(RxLife.`as`<Any>(view, ignoreAttach))

fun <T> Single<T>.life(view: View, ignoreAttach: Boolean): SingleLife<T> =
        this.to(RxLife.`as`<T>(view, ignoreAttach))

fun <T> ParallelFlowable<T>.life(view: View, ignoreAttach: Boolean): ParallelFlowableLife<T> =
        this.to(RxLife.`as`<T>(view, ignoreAttach))

fun <T> Observable<T>.life(scope: Scope): ObservableLife<T> =
    this.to(RxLife.`as`<T>(scope))

fun <T> Flowable<T>.life(scope: Scope): FlowableLife<T> =
    this.to(RxLife.`as`(scope))

fun <T> Maybe<T>.life(scope: Scope): MaybeLife<T> =
    this.to(RxLife.`as`<T>(scope))

fun Completable.life(scope: Scope): CompletableLife =
    this.to(RxLife.`as`<Any>(scope))

fun <T> Single<T>.life(scope: Scope): SingleLife<T> =
    this.to(RxLife.`as`<T>(scope))

fun <T> ParallelFlowable<T>.life(scope: Scope): ParallelFlowableLife<T> =
    this.to(RxLife.`as`<T>(scope))



fun <T> Observable<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): ObservableLife<T> =
    this.to(RxLife.`as`<T>(owner, event))

fun <T> Flowable<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): FlowableLife<T> =
    this.to(RxLife.`as`(owner, event))

fun <T> Maybe<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): MaybeLife<T> =
    this.to(RxLife.`as`<T>(owner, event))

fun Completable.life(owner: LifecycleOwner, event: Lifecycle.Event): CompletableLife =
    this.to(RxLife.`as`<Any>(owner, event))

fun <T> Single<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): SingleLife<T> =
    this.to(RxLife.`as`<T>(owner, event))

fun <T> ParallelFlowable<T>.life(owner: LifecycleOwner, event: Lifecycle.Event): ParallelFlowableLife<T> =
    this.to(RxLife.`as`<T>(owner, event))


/**
 * [Observable. as] + [RxLife.asOnMain]
 */
fun <T> Observable<T>.lifeOnMain(owner: LifecycleOwner): ObservableLife<T> =
    this.to(RxLife.asOnMain<T>(owner))

fun <T> Flowable<T>.lifeOnMain(owner: LifecycleOwner): FlowableLife<T> =
    this.to(RxLife.asOnMain(owner))

fun <T> Maybe<T>.lifeOnMain(owner: LifecycleOwner): MaybeLife<T> =
    this.to(RxLife.asOnMain<T>(owner))

fun Completable.lifeOnMain(owner: LifecycleOwner): CompletableLife =
    this.to(RxLife.asOnMain<Any>(owner))

fun <T> Single<T>.lifeOnMain(owner: LifecycleOwner): SingleLife<T> =
    this.to(RxLife.asOnMain<T>(owner))

fun <T> ParallelFlowable<T>.lifeOnMain(owner: LifecycleOwner): ParallelFlowableLife<T> =
    this.to(RxLife.asOnMain<T>(owner))


fun <T> Observable<T>.lifeOnMain(view: View): ObservableLife<T> =
    this.to(RxLife.asOnMain<T>(view))

fun <T> Flowable<T>.lifeOnMain(view: View): FlowableLife<T> =
    this.to(RxLife.asOnMain(view))

fun <T> Maybe<T>.lifeOnMain(view: View): MaybeLife<T> =
    this.to(RxLife.asOnMain<T>(view))

fun Completable.lifeOnMain(view: View): CompletableLife =
    this.to(RxLife.asOnMain<Any>(view))

fun <T> Single<T>.lifeOnMain(view: View): SingleLife<T> =
    this.to(RxLife.asOnMain<T>(view))

fun <T> ParallelFlowable<T>.lifeOnMain(view: View): ParallelFlowableLife<T> =
    this.to(RxLife.asOnMain<T>(view))

fun <T> Observable<T>.lifeOnMain(view: View, ignoreAttach: Boolean): ObservableLife<T> =
        this.to(RxLife.asOnMain<T>(view, ignoreAttach))

fun <T> Flowable<T>.lifeOnMain(view: View, ignoreAttach: Boolean): FlowableLife<T> =
        this.to(RxLife.asOnMain(view, ignoreAttach))

fun <T> Maybe<T>.lifeOnMain(view: View, ignoreAttach: Boolean): MaybeLife<T> =
        this.to(RxLife.asOnMain<T>(view, ignoreAttach))

fun Completable.lifeOnMain(view: View, ignoreAttach: Boolean): CompletableLife =
        this.to(RxLife.asOnMain<Any>(view, ignoreAttach))

fun <T> Single<T>.lifeOnMain(view: View, ignoreAttach: Boolean): SingleLife<T> =
        this.to(RxLife.asOnMain<T>(view, ignoreAttach))

fun <T> ParallelFlowable<T>.lifeOnMain(view: View, ignoreAttach: Boolean): ParallelFlowableLife<T> =
        this.to(RxLife.asOnMain<T>(view, ignoreAttach))

fun <T> Observable<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): ObservableLife<T> =
    this.to(RxLife.asOnMain<T>(owner, event))

fun <T> Flowable<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): FlowableLife<T> =
    this.to(RxLife.asOnMain(owner, event))

fun <T> Maybe<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): MaybeLife<T> =
    this.to(RxLife.asOnMain<T>(owner, event))

fun Completable.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): CompletableLife =
    this.to(RxLife.asOnMain<Any>(owner, event))

fun <T> Single<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): SingleLife<T> =
    this.to(RxLife.asOnMain<T>(owner, event))

fun <T> ParallelFlowable<T>.lifeOnMain(owner: LifecycleOwner, event: Lifecycle.Event): ParallelFlowableLife<T> =
    this.to(RxLife.asOnMain<T>(owner, event))


fun <T> Observable<T>.lifeOnMain(scope: Scope): ObservableLife<T> =
    this.to(RxLife.asOnMain<T>(scope))

fun <T> Flowable<T>.lifeOnMain(scope: Scope): FlowableLife<T> =
    this.to(RxLife.asOnMain(scope))

fun <T> Maybe<T>.lifeOnMain(scope: Scope): MaybeLife<T> =
    this.to(RxLife.asOnMain<T>(scope))

fun Completable.lifeOnMain(scope: Scope): CompletableLife =
    this.to(RxLife.asOnMain<Any>(scope))

fun <T> Single<T>.lifeOnMain(scope: Scope): SingleLife<T> =
    this.to(RxLife.asOnMain<T>(scope))

fun <T> ParallelFlowable<T>.lifeOnMain(scope: Scope): ParallelFlowableLife<T> =
    this.to(RxLife.asOnMain<T>(scope))


