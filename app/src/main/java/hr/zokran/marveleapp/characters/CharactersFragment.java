package hr.zokran.marveleapp.characters;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import hr.zokran.marveleapp.R;

public class CharactersFragment extends Fragment implements CharactersContract.View {

    private CharactersPresenter mPresenter;

    public static CharactersFragment newInstance() {

        Bundle args = new Bundle();

        CharactersFragment fragment = new CharactersFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_characters, container);
        mPresenter = new CharactersPresenter(this);
        return view;
    }

    @Override
    public void onCharactersReceived(List<Character> characters) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public boolean isActive() {
        return isAdded();
    }
}
