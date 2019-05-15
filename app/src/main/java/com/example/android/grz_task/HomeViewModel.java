package com.example.android.grz_task;



import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;


public class HomeViewModel extends ViewModel {
    public MutableLiveData<HomeFragment_Lists>mainViewMutableLiveData=new MutableLiveData<>();
    public MutableLiveData<String> errorMessages=new MutableLiveData<>();
    private MainViewUseCase useCase;
    private CompositeDisposable mcompositeDisposable;
    private HomeRepository repository;

    public HomeViewModel(HomeRepository mrepository, MainViewUseCase useCase) {
       this.repository=mrepository;
        this.useCase = useCase;

        getData();
    }
    public void getData(){
        useCase.retrieveHomeFragmentData(mcompositeDisposable, mainViewMutableLiveData, repository,errorMessages);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        //mcompositeDisposable.clear();
    }

}
