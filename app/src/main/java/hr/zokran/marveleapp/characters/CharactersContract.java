package hr.zokran.marveleapp.characters;


import java.util.List;

import hr.zokran.marveleapp.common.BaseView;

public interface CharactersContract {

    interface View extends BaseView {
        void onCharactersReceived(List<Character> characters);

        void onError(Throwable e);
    }

    interface Presenter {
        void getCharacters();
    }
}
